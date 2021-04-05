#!/usr/bin/env python
# coding: utf-8

# ## First Class Function  
#  프로그래밍 언어가 함수(function)을 first-class citizen으로 취급, 함수 자체를 일반 값처럼 취급함
# 

# In[1]:


def double_func(x):
    return x *2 
print(double_func(3))


# In[2]:


# 생성한 함수를 변수처럼 취급한다.
a = double_func
print(double_func)
print(a)


# In[3]:


def make_double_list(func, args):
    result = []
    for i in args :
        result.append(func(i))
    return result


# In[5]:


# 함수를 파라미터로도 사용 가능
input_list = [1,2,3,4,5]
doubles = make_double_list(double_func, input_list)
print(doubles)


# In[22]:


# 함수를 호출하면 함수에서 함수를 생성해서 리턴한다.
import time
def log_formatter(msg):
    
    def log_message():
        time_str = time.strftime('%c', time.localtime(time.time()))
        print(time_str , end=' ')
        print('------>', end=' ')
        print(msg)

    return log_message


# In[27]:


log_msg = log_formatter('test log')
print(log_msg())


# In[29]:


log_msg()


#     - log_formatter 함수의 로컬변수 msg는 함수 실행이 종료된 후 사라지는 변수
#     - 종료된 이후에도 참조가 가능 ? log_message를 클로져(closure)라고 함
#     - 클로저는 다른함수의 지역변수 값을 그 함수가 종료돈 후에도 기억

# In[30]:


del log_formatter


# In[31]:


# closure 이기 때문에 상위 함수를 지워도 하위 함수가 존재 한다.
log_msg()


# ## Closure  
#     - first class function을 지원하는 언어의 네임 바인딩 기술
#     - 어떤 함수를 함수 자신이 가지고 있는 환경과 함께 저장한 레코드
#     - 함수가 가진 프리변수(free variable)을 클로저가 만들어지는 당시의 값과 레퍼런스에 매핑하는 역할
#     - 자신의 영역 밖에서 호출된 함수의 변수값과 레퍼런스를 복사하고 저장
#     - free variable: 코드블럭 안에서 사용은 되지만 그 코드 블럭안에서 정의되지 않은 변수
#     

# In[20]:


log_msg(234)


# In[32]:


def outer_func():
    msg = 'Good Morning!'
    
    def inner_func():
        print(msg)
        
    return inner_func()


# In[33]:


outer_func()


# In[34]:


def outer_func():
    msg = 'Good Morning!'
    
    def inner_func():
        print(msg)
        
    return inner_func

func = outer_func()
print(func)
func()


# In[35]:


print(dir(func))


# In[36]:


print(type(func.__closure__))


# In[37]:


print(func.__closure__)


# In[38]:


print(func.__closure__[0])


# In[39]:


print(dir(func.__closure__[0]))


# In[41]:


print(func.__closure__[0].cell_contents)


# In[42]:



import time
def log_formatter(msg):
    
    def log_message():
        time_str = time.strftime('%c', time.localtime(time.time()))
        print(time_str , end=' ')
        print('------>', end=' ')
        print(msg)

    return log_message


# In[44]:


test_log_msg = log_formatter('test_log')
runtime_log_msg = log_formatter('runtime log')


# In[45]:


test_log_msg()
runtime_log_msg()


# In[97]:


# decorator 
def log_decorator(param_func):
    
    def log_message():
        time_str = time.strftime('%c', time.localtime(time.time()))
        print(time_str , end=' ')
        print('------>', end=' ')
        return param_func()

    return log_message


# In[98]:


def test_log_msg():
    print('This is test log Message')
    
def runtime_log_msg():
    print('This is runtime log Message')


# In[99]:


test_log = log_decorator(test_log_msg)
runtime_log = log_decorator(runtime_log_msg)


# In[100]:


test_log()
print()
runtime_log()


# In[101]:


# 애너테이션을 선언하듯 함수의 이름을 선언해주면 함수를 실행해주는 것 처럼 실행할 수 있다.
@log_decorator
def test_log_msg():
    print('This is test log Message')
    
@log_decorator
def runtime_log_msg():
    print('This is runtime log Message')


# In[102]:


test_log_msg()
print()
runtime_log_msg()


# In[103]:


@log_decorator
def runtime_log_msg(host, ip):
    print(f'This is runtime log Message from {host}:{ip}')


# In[104]:


test_log_msg()
print()
runtime_log_msg('localhost', '192.168.0.1')


# # 위와같이 데코레이터와 다른 갯수의 파라미터를 사용하기 위해 내부의 함수에 선언해주는것
# def log_decorator(param_func):
#     
#     def log_message(*args, **kargs):
#         time_str = time.strftime('%c', time.localtime(time.time()))
#         print(time_str , end=' ')
#         print('------>', end=' ')
#         return param_func(*args, **kargs)
# 
#     return log_message
# 

# In[108]:


@log_decorator
def test_log_msg():
    print('This is test log Message')

@log_decorator
def runtime_log_msg(host, ip):
    print(f'This is runtime log Message from {host}:{ip}')


# In[109]:


test_log_msg()
print()
runtime_log_msg('localhost', '192.168.0.1')


# # Generator
#     - iterator와 같은 loop 의 작용을 컨트롤 하기 위하여 쓰여지는 특별한 함수 또는 루틴
#     - 연속적인 값들을 리턴해야 할 때 한번에 모든 값을 리턴하지 않는다.
#     - yield 구문을 이용해 한번 호출될 때마다 하나의 값만을 리턴
#     - 일반 iterator에 비하여 적은 메모리를 사용
#    

# In[110]:


def square_numbers(nums):
    result = []
    for i in nums:
        result.append(i * i)
    return result

my_nums = square_numbers([1, 2, 3, 4, 5])
print(my_nums)


# In[123]:


def square_numbers(nums):
    for i in nums:
        yield i * i
        
my_nums = square_numbers([1, 2, 3, 4, 5])


# In[124]:


print(next(my_nums))


# In[125]:


print(next(my_nums))
print(next(my_nums))
print(next(my_nums))


# In[127]:


my_nums = square_numbers([1, 2, 3, 4, 5])

for num in my_nums:
    print(num)


# In[131]:


nums = [1, 2, 3, 4, 5]
my_nums = [x * x for x in nums]
print(my_nums)

for num in my_nums:
    print(num)


# In[132]:


result = [] 
for i in range(10):
    if i % 2 == 0:
        result.append(i)

print(result)


# In[ ]:


result = []

