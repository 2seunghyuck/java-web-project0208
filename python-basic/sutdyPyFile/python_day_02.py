#!/usr/bin/env python
# coding: utf-8

# In[6]:


def calculate_rectangle_area(x, y):
    return x * y


# In[7]:


rectangle_x =10
rectangle_y =20
print('사각형 x의 길이 :', rectangle_x)
print('사각형 x의 길이 :', rectangle_y)
print('사각형의 넓이 :', calculate_rectangle_area(rectangle_x, rectangle_y))


# In[8]:


def func1(x): # Call by value 방식
    x+=1
    print('func1의 x :', x)


# In[9]:


x=10
func1(x)
print('메인의 x :', x)


# In[10]:


fruits = ['melon', 'apple', 'banana']
my_bag = fruits
print(fruits)
print(my_bag)
my_bag.sort()
print(fruits)
print(my_bag)


# In[11]:


def shopping_cart(goods): # Call by Reference 방식
    goods.append('coupon')
    goods=[1, 2]
    print('IN shopping_cart', goods)


# In[13]:


shopping_list = ['bean', 'salt', 'beef']
shopping_cart(shopping_list)
print('bought', shopping_list)


# In[17]:


def test(x):
    global a
    print(x)
    t=20
    a=300
    print('In test t, a', t, a)


# In[18]:


a=10
test(a)
print('in Main a : ', a)
print('in Main t : ', t)


# In[23]:


def f():
    global s # 'global'명령 -- s를 함수내의 고정변수로 지정해준다.
    s = "i love Doosan"
    print(s)


# In[25]:


s = "i love hanhwa"

f()
print(s)


# In[29]:


def print_name(my_name, your_name):
    print("Hello {0}, Myname is {1}".format(your_name,my_name))


# In[30]:


print_name("TOM", "John")


# In[31]:


print_name(your_name="TOM", my_name="John")


# In[34]:


def variable_length(a, b, *args): # *args 맨 마지막에 와야함
    print(a)
    print(b)
    print(args)


# In[35]:


variable_length(1, 2, 3, 4, 5)


# In[42]:


def key_variable_length(**args):
    print(args)
    print("First value: {first}".format(**args))
    print(f"First value is {args.get('first')}")
    print("Second value is {second}".format(**args))
    print("Third value is {third}".format(**args))
          


# In[43]:


key_variable_length(first=3, second=4, third=5)


# In[45]:


s = "BLACK LIVES MATTER"
print(s.upper())
print(s.lower())
print(s.title())
print(s.capitalize())
print(s.count("T"))
print(s.startswith("B"))

k="123"
print(k.isdigit())


# In[51]:


print(1, 2, 3)
print("%d %d %d " %(1, 2, 3))
print("%s--%s--%s" %('abc','def','ghi'))
print("{} {} {}".format('abc','def','ghi'))
print("{1} {0} {2}".format('abc','def','ghi'))
print(f"{'def'} {'abc'} {'ghi'}")
print("{0:>10s}".format('python'))
print("{0:<10s}".format('python'))
print(f"{'python':>10s}")
print(f"{'python':<10s}")


# In[52]:


items = 'zero one two three'.split()
print(items)

examples = 'python,javascript,sql'
print(examples.split(','))
a,b,c = examples.split(',')
print(a, b, c)


# In[53]:


colors = ['red', 'blue', 'green', 'yellow']
result = ''.join(colors)
print(result)

result = ' '.join(colors)
print(result)

result = ', '.join(colors)
print(result)

result = '- '.join(colors)
print(result)


# In[55]:


a = [1,2,3,4,5]
a.append(10)
print(a)
a.append(20)
print(a)
print(a.pop()) # 기본구조가 STACK (LIFO) 구조임
print(a)
print(a.pop())
print(a)
print(a.pop())


# In[57]:


word = input("input a word:")
word_list = list(word)
print(word_list)
result = []
for _ in range(len(word_list)):
    result.append(word_list.pop())
    
print(result)
print(word[::-1])


# In[63]:


a = [1,2,3,4,5]
a.append(10)
a.append(20)
print(a)
print(a.pop(0)) # pop(0) pop 에 인덱스를 줌으로 QUEUE 처럼 동작하게 만듬 
print(a.pop(0))
print(a)


# In[65]:


t = (1, 2, 3) # TUPLE 사용 리스트와 비슷하게 동작하지만, 데이터를 수정할 수 없다.
print (t+t, t*2)
print(len(t))


# In[74]:


t2 = ('s') # TUPLE을 이렇게 사용하면 tuple으로 지정되지 않고 단일 타입으로 들어간다.
print(type(t2))
t2 = (1,) # 하나짜리 tuple은 마지막에 , 를 붙여야함
print(type(t2))


# In[85]:


s = set([1, 2, 3, 4, 3, 4]) # set 은 중복값 무시, 
print(s)


# In[86]:


s.add(1)
print(s)


# In[87]:


s.remove(1)
print(s)


# In[164]:


s.update([11,22,33,44])
print(s)


# In[163]:


s.discard(9) #remove 는 값이 없으면 에러, discard는 없어도 실행됨
s.discard(44)
print(s)


# In[166]:


s.clear() # set 초기화하기
print(s)


# In[93]:


s1 = set([1,2,3,4,5])
s2 = set([3,4,5,6,7])

print(s1.union(s2)) # 합집합 
print(s1 | s2)
print(s1.intersection(s2)) # 교집합
print(s1 & s2)
print(s1.difference(s2)) # 차집합
print(s1-s2)


# In[97]:


#DICTIONARY key:value 값으로 지정하는것, index로 구별 못함
student_info = {20190001:'TOM', 20190002:'JANE', 20190003:'MIKE', 20190004:'JESSICA'}
print(student_info[20190001])


# In[99]:


student_info[20190002] = 'YOO' # 기존 값을 변경
student_info[20190005] = 'JAMES' # 새로운 값을 추가
print(student_info)
print(len(student_info)) 


# In[105]:


country_code = {'USA':1, 'KOREA':82, 'China':86, 'Malaysia':60}
print(country_code)


# In[106]:


print(country_code.keys()) #key값 표시


# In[107]:


country_code['German'] = 49
print(country_code)


# In[108]:


print(country_code.items()) # key & value 표시


# In[109]:


for k, v in country_code.items():
    print('Key :', k)
    print('Value :', v)


# In[111]:


print('KOREA' in country_code.keys())
print('85' in country_code.values())


# In[112]:


# collections 클래스 안의 OrderedDict 을 사용하기 위한 import문 
from collections import OrderedDict # 입력한 순서대로 뽑아낼 수 있는 dictionary 


# In[114]:


d = dict()
d['x'] = 100
d['y'] = 200
d['z'] = 300
d['a'] = 400
print(d)


# In[116]:


od = OrderedDict(sorted(d.items(), key=lambda x : x[0]))
print(od)


# In[121]:


od_list = sorted(d.items(), key=lambda x: x[1])
print(od_list)


# In[122]:


s = [('yellow', 1), ('blue', 2), ('yellow', 3), ('blue', 4), ('red', 1)]


# In[125]:


d= dict()
for k, v in s:
    try: d[k].append(v)
    except KeyError:
        d[k] = [v]
print(d.items())


# In[31]:


from collections import defaultdict #
d2 = defaultdict(list) #() 안에 여러가지 타입을 지정할 수 있다.

for k,v in s :
    d2[k].append(v)
    
print(d2.items())


# In[127]:


d3 = defaultdict(lambda:100)
print(d3['first'])


# In[128]:


from collections import Counter
c = Counter('scientist')
print(c)


# In[130]:


c = Counter({'red':4, 'blue':2})
print(c)
print(list(c.elements()))


# In[132]:


c = Counter(cats=4, dogs=6)
print(c)
print(list(c.elements()))


# In[133]:


c = Counter(a=4, b=2, c=0, d=-2)
d = Counter(a=1, b=2, c=3, d=4)

print(c + d)
print(c | d)
print(c & d)

c.subtract(d)
print(c)


# In[36]:


text = """A press release is the quickest and easiest way to get free publicity. If
 well written, a press release can result in multiple published articles about your
firm and its products. And that can mean new prospects contacting you
asking you to sell to them. ….""".lower().split()
    


# In[37]:


word_count = defaultdict(lambda:0)
for word in text:
    word_count[word] +=1


# In[40]:


for k, v in OrderedDict(sorted(word_count.items(), key=lambda t : t[1], reverse=True)).items():
    print(k, v)


# In[142]:


result =[]
for i in range(10):
    result.append(i)
print(result)


# In[143]:


result2 = [i for i in range(10)]# List Comprehension
print(result2)


# In[144]:


result = []
for i in range(10):
    if i % 2==0:
        result.append(i)
print(result)


# In[151]:


result3 = [i for i in range(10) if i % 2 ==0]
print(result3)


# In[152]:


result4 = [i if i %2 ==0 else 99 for i in range(10)] # else 까지 포함되면 for 문이 뒤로간다.
print(result4)


# In[160]:


word1 = 'Hello'
word2 = 'World'
word3 = 'Bit'
result5 = [i + j + k for i in word1 for j in word2 for k in word3]
print(result5)


# In[161]:


word1 = 'Hello'
word2 = 'World'
word3 = 'Bit'
result5 = set([i + j + k for i in word1 for j in word2 for k in word3])
print(result5)


# In[168]:


case1 = ['A', 'B', 'C']
case2 = ['D', 'E', 'F']
print(result5.pop())
print(result5)


# In[169]:


alist = ['a1','a2','a3']
blist = ['b1','b2','b3','b4']
for a,b in zip(alist, blist):
    print(a, b)


# In[2]:


import random
random.seed(3) # random을 사용하며 난수를 발생시키는데 random은 random인데 완전 랜덤은 아닌거



# In[247]:


four_uniform_randoms = [random.random() for _ in range(4)]
print(four_uniform_randoms)


# In[228]:


print(random.randrange(10)) # 범위를 지정해주고 그 범위안의 정수를 랜덤으로 발생시키는 것
print(random.randrange(2,8))


# In[204]:


up_to_ten = [1,2,3,4,5,6,7,8,9,10]
random.shuffle(up_to_ten)
print(up_to_ten)


# In[1]:


my_best_friend = random.choice(["Alice", "Bob", "Charlie"])
print(my_best_friend)


# In[3]:


lottery_numbers = range(60)
print(lottery_numbers)


# In[5]:


winning_numbers = random.sample(lottery_numbers, 10)
print(winning_numbers)


# In[6]:


def f(x, y):
    return x + y
print(f(1,4))


# In[8]:


f = lambda x, y : x + y # 함수를 간단하게 표현하기 위한 식 , [parameter : 함수식] 으로 표현
print(f(1,4))


# In[10]:


print((lambda x,y : x+y)(1,4))


# In[18]:


print((lambda n, m : n if n%2 ==0 else m)(1,3))
print((lambda n, m : n if n%2 ==0 else m)(8,3))


# In[19]:


def makeFunc(n) : #Closure 라는 함수를 받는 람다 사용법
    return lambda a : a % n ==1

isOdd = makeFunc(2)
print(isOdd(3))
print(isOdd(4))


# In[72]:


from collections import defaultdict
from collections import OrderedDict

N = 4
stages = [2, 1, 2, 6, 2, 4, 3, 3]

def solution(N, stages):
    answer =[]
    count = defaultdict(lambda:0)

    for cnt in stages:
        count[cnt] +=1
    for k, v in OrderedDict(sorted(count.items(), key=lambda t : t[1], reverse=True)).items():    
        if(k > N) :
            k=0
        elif(k==N):
            k=k-1
        answer.append(k+1)
        print(k, v)
        
    return answer

print(solution(N,stages))


# In[25]:


def asterisk_test(a, *args):
    print(a, args)
    print(type(args))
    
asterisk_test(1,2,3,4,5,6)


# In[29]:


def asterisk_test2(a, **kargs):
    print(a, kargs)
    print(type(kargs))
    
asterisk_test2(1, b=2, c=3, d=4, e=5, f=6)


# In[58]:


def unpacking_test(a, args):
    print(a, *args)
    print(type(args))
    
unpacking_test(1,(2,3,4,5,6))


# In[74]:


tom_score = [95, 85, 90]
jane_score = [90, 90, 100]
kate_score = [100, 100, 80]
students_scores = [tom_score, jane_score, kate_score]
tom_total =0
kate_total =0
jane_total =0
for tom, jane, kate in zip(*students_scores):
    tom_total += tom
    jane_total += jane
    kate_total += kate
    
print(tom_total, jane_total, kate_total)


# In[76]:


u = [2, 2]
v = [1, 2]
z = [-3, 5]
result = []

for i in range(len(u)):
    result.append(u[i] + v[i] + z[i])
    
print(result)


# In[79]:


result1 = [sum(t) for t in zip(u, v, z)]
print(result1)


# In[83]:


result2 = []
def vector_addition(*args):
    return [sum(t) for t in zip(*args)]
vectors = [[2, 2], [1, 2], [-3, 5]]
print(vector_addition(*vectors)) 

