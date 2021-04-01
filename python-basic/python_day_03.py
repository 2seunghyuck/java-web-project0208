#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import fah_converter as fah
import pandas as pd
import numpy as np
from typing import List, Dict, Tuple, Set
from roboadvisor import database
from roboadvisor import crawling
from roboadvisor import analysis
import roboadvisor
import sys
from roboadvisor.alalysis import series
from fah_converter import *
from fah_converter import convert_to_f
import fah_converter


class SoccerPlayer(object):
    def __init__(self, name, position, back_number):
        self.name = name
        self.position = position
        self.back_number = back_number

    def change_back_number(self, new_number):
        print("선수 등번호 변경 : From %d to %d" % (self.back_number, new_number))
        self.back_number = new_number

    def __str__(self):
        return "Hello, My name is %s. I play in %s in center." % (self.name, self.position)


# In[ ]:

chaboom = SoccerPlayer("Chaboom", "CF", 11)

print("현재 선수의 등번호: ", chaboom.back_number)
chaboom.change_back_number(9)
print("현재 선수의 등번호: ", chaboom.back_number)
print()
print(chaboom)


# In[ ]:


class Car:
    instance_count = 0

    def __init__(self, size, color):
        self.size = size
        self.color = color
        Car.instance_count += 1
        print(f"자동차 객체의 수: {Car.instance_count}")

    def move(self):
        print(f"자동차({self.size} & {self.color})가 움직입니다.")


# In[ ]:

K5 = Car("small", "white")


# In[ ]:


car2 = Car("big", "black")


# In[ ]:


print(f"Car클래스의 총 인스턴스 수: {Car.instance_count}")


# In[ ]:


K5.move()
car2.move()


# In[ ]:


class Car:
    instance_count = 0

    def __init__(self, size, color):
        self.size = size
        self.color = color
        self.speed = 0
        Car.instance_count += 1
        print(f"자동차 객체의 수: {Car.instance_count}")

    def move(self, speed):
        self.speed = speed
        print(f"자동차({self.size} & {self.color})가", end='')
        print(f"자동차가 {self.speed}Km 으로 움직입니다.")

    def auto_cruise(self):
        print("자율주행 모드")
        self.move(self.speed)

    # python의 staticMethod
    @staticmethod
    def check_type(model_code):
        if(model_code >= 20):
            print("이 자동차는 전기차 입니다.")
        elif(10 <= model_code < 20):
            print("이 자동차는 가솔린 입니다.")
        else:
            print("이 자동차는 디젤 입니다.")

    @classmethod
    def count_instance(cls):
        print(f"클래스 변수: {cls.instance_count}")


# In[ ]:


car = Car("Small", "red")
car.move(80)
car.auto_cruise()


# In[ ]:


Car.check_type(25)


# In[ ]:


Car.count_instance()
car1 = Car("small", "greed")
Car.count_instance()


# In[ ]:


car2 = Car("big", "black")
Car.count_instance()


# In[ ]:


car1.count_instance()


# In[ ]:


class Bicycle:
    def __init__(self, wheel_size, color):
        self.wheel_size = wheel_size
        self.color = color

    def move(self, speed):
        print(f"자전거 시속{speed}킬로미터로 전진")

    def turn(self, direction):
        print(f"자전거 {direction}회전")

    def stop(self):
        print(f"자전거 {self.wheel_size},{self.color} 정지")


# In[ ]:


class FoldingBicycle(Bicycle):
    def __init__(self, wheel_size, color, state):
        super().__init__(wheel_size, color)
        self.state = state

    def fold(self):
        self.state = 'folding'
        print(f"자전거: 접기, state = {self.state}")

    def unfold(self):
        self.state = 'unfolding'
        print(f"자전거: 펴기, state = {self.state}")


# In[ ]:


folding_bicycle = FoldingBicycle(27, 'white', 'unfolding')
folding_bicycle.move(20)
folding_bicycle.turn("right")
folding_bicycle.turn("좌")
folding_bicycle.stop()
folding_bicycle.fold()
folding_bicycle.unfold()


# In[ ]:


bicycle = Bicycle("big", "green")
bicycle.move(20)
bicycle.stop()


# In[ ]:


class Person:
    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender

    def about_me(self):
        print("저의 이름은", self.name, end='')
        print(f"({self.gender})이고요, 제 나이는", str(self.age), "살 입니다.")


# In[ ]:


class Employee(Person):

    def __init__(self, name, age, gender, salary, hire_date):
        super().__init__(name, age, gender)
        self.salary = salary
        self.hire_date = hire_date

    def do_work(self):
        print("열심히 일을 한다")

    # 부모의 메서드 오버라이딩
    def about_me(self):
        super().about_me()
        print("제 급여는", self.salary, "원이고, 제 입사일은 ", self.hire_date, "입니다.")


# In[ ]:


emp = Employee('Tom', 25, '남성', 350, '2020/06/02')

emp.do_work()
emp.about_me()


# In[ ]:


class Product:

    # 자바의 {}와 같은역할
    pass


# In[ ]:


class Inventory(object):
    def __init__(self):
        # python의 private 처리 역할을하는 '__'
        self.__items = []

    def add_new_item(self, product):
        if type(product) == Product:
            self.__items.append(product)
            print("new item added")
        else:
            raise ValueError("Invalid item")

    # 자바의 게터와 비슷한개념
    def get_number_of_items(self):
        return len(self.__items)

    @property
    def items(self):
        return self.__items


# In[ ]:


my_inventory = Inventory()
my_inventory.add_new_item(Product())
my_inventory.add_new_item(Product())


# In[ ]:


my_inventory.get_number_of_items()


# In[ ]:


my_inventory.__items


# In[ ]:


my_inventory = Inventory()


# In[ ]:


items = my_inventory.items
items.append(Product)


# In[ ]:


my_inventory.get_number_of_items()


# In[ ]:


my_inventory2 = Inventory()
my_inventory2.get_number_of_items()


# In[ ]:


print("Enter a clecius value: ")
celcius = float(input())
fahrenheit = fah_converter.convert_to_f(celcius)
print("It 's", fahrenheit, "degrees Farenheit.")


# In[ ]:


# 너무 긴 모듈명을 간단한 약어로 변경

# 모듈안의 함수를 직접 사용 하는것

# 모듈안의 모든 함수를 사용


# In[ ]:


get_ipython().run_line_magic('run', "-i 'fah_converter'")


# In[ ]:


series.series_test()


# In[ ]:


print(sys.path)


# In[ ]:


sys.path.append('/Users/user/java-web-project0208/python-modules')


# In[ ]:


analysis.series.series_test()
analysis.statics.statics_test()
crawling.parser.parser_test()
crawling.scrap.scrap_test()
database.connection.connection_test()
database.query.query_test()


# In[ ]:


# 예외처리
for i in range(10):
    try:
        print(10/i)

    except ZeroDivisionError as e:
        print(e)
        print("Not divide by 0")


# In[ ]:


# 예외처리
for i in range(10):
    try:
        result = 10/i
    except ZeroDivisionError as e:
        print(e)
        print("Not divide by 0")
    else:
        print(result)


# In[ ]:


# 예외처리
try:
    for i in range(1, 10):
        result = 10 // i
        print(result)
except ZeroDivisionError as e:
    print(e)
    print("Not divide by 0")
finally:
    print("프로그램 종료")


# In[ ]:


while True:
    value = input("변환할 정수값을 입력해주세요: ")
    for digit in value:
        if digit not in "0123456789":
            raise ValueError("숫자를 입력하지 않았습니다.")
    print("정수값으로 변환된 숫자 : ", int(value))


# In[ ]:


def get_binary_number(decimal_number):
    # 특정한 타입이 아닌 것에 에러를 발생시키는ㄱㅓ
    assert isinstance(decimal_number, int)
    return bin(decimal_number)


# In[ ]:


print(get_binary_number(10))


# In[ ]:


print(get_binary_number('10'))


# In[ ]:


# TYPE 애너테이션 : parameter 에 타입을 주석처럼 지정해주는 문법
def add(a: int, b: int) -> int:
    return a + b


print(add(10, 5))
print(add([1, 2], [3]))
print(add("hi ", "there"))


# In[ ]:


# 제공하는 기본타입이 아닌 사용자 지정타입에 타입에너테이션을 적어주기위한 typing 임포트

def add(a: List, b: List) -> List:
    return a + b


print(add(10, 5))
print(add([1, 2], [3]))
print(add("hi ", "there"))


# ### 파이썬에서 많이 쓰이는 모듈 사용

# In[1]:


# numpy


# In[ ]:


data1 = [0, 1, 2, 3, 4, 5, 6, 7]

# list를 numpy.array 로 만들어주는 메서드
a1 = np.array(data1)

print(a1)


# In[ ]:


# 파이썬은 모든 타입이 배열에 들어갈 수 있는데 numpy는 자동으로 타입을 맞춰준다

data2 = [0, 1, 2, 3, 4, 5.0]
a2 = np.array(data2)
print(a2)

print(a1.dtype)
print(a2.dtype)


# In[ ]:


a3 = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
print(a3)


# In[ ]:


# 자동으로 범위를 지정하여 array를 만드는 함수

a4 = np.arange(0, 10, 2)
a5 = np.arange(1, 10)
a6 = np.arange(5)

print(a4)
print(a5)
print(a6)


# In[ ]:


# 4행 3열의 2차원 배열을 생성해주는 함수
a7 = np.arange(12).reshape(4, 3)
print(a7)
print(a7[0][2])
print(a7.shape)


# In[ ]:


a8 = np.arange(11).reshape(4, 3)

print(a8)
# 갯수가 안맞아서 에러


# In[ ]:


# linspace  == a부터 b 까지 c 조각으로 분리해줌 무조건 실수로 나옴
b1 = np.linspace(1, 10, 10)
print(b1)


# In[ ]:


b2 = np.linspace(1, 10, 8)
print(b2)


# In[ ]:


b3 = np.linspace(1, np.pi, 20)
print(b3)


# In[ ]:


# zeros == 0을 a개, 타입은 b
c1 = np.zeros(10, int)
print(c1)


# In[ ]:


c2 = np.zeros((3, 4), int)
print(c2)


# In[ ]:


# ones == 1을 채워주는거
c3 = np.ones(10)


# In[ ]:


c4 = np.ones((3, 5))
print(c3)
print(c4)


# In[ ]:


# 단위 행렬을 만들어주는 eye함수
c5 = np.eye(3)
print(c5)


# In[ ]:


# 문자열 의 타입 ==> 최대 문자열의 길이를 출력
d1 = np.array(['abc', 'whoami', 'cheㅡistry', 'MerryChristmas'])
print(d1)
print(d1.dtype)


# In[ ]:


d2 = np.array(['1.567', '0.123', '5.232', '5', '8'])
num = a1.astype(float)
print(num)


# In[ ]:


a1 = np.random.rand(2, 3, 4)
print(a1)


# In[ ]:


# np.random.randint([low,]high, [,size])  <== [low, high] 사이의 정수 난수 생성
a1 = np.random.randint(10, size=(3, 4))
print(a1)


# In[ ]:


a2 = np.random.randint(1, 30)
print(a2)


# In[3]:


# size 가 같은 두개의 배열은 각 배열의 항목끼리 사칙연산이 가능하다.
# 이런 연산을 "element wise" 연산이라고 한다
a1 = np.array([10, 20, 30, 40])
a2 = np.array([1, 2, 3, 4])


# In[5]:


print(a1 + a2)
print(a1 - a2)
print(a1 * 2)
print(a1 ** 3)
print(a1 * a2)
print(a1 / a2)
print(a1 / (a2**2))
print(a1 > 20)


# In[13]:


a3 = np.array([10, 20, 30, 40])
a4 = np.array([2, 3, 4])


# In[14]:


print(a3 + a4)
print(a3 - a4)
print(a3 * a4)


# In[20]:


print(a1.sum())
print(a1.mean())
print(a1.min())
print(a1.max())


# In[17]:


print(a1.std())  # 표준편차
print(a1.var())  # 분산


# In[18]:


print(a1.cumsum())  # 누적 합
print(a1.cumprod())  # 누적 곱


# ## NumPy 는 선형대수(Linear Algebra)를 위한 행렬 연산을 지원

# In[21]:


a = np.array([0, 1, 2, 3]).reshape(2, 2)
print(a)


# In[23]:


b = np.array([3, 2, 0, 1]).reshape(2, 2)
print(b)


# In[26]:


# 행렬의 곱
print(a.dot(b))
print(np.dot(a, b))


# In[25]:


# 행렬의 전행렬 구하기
print(np.transpose(a))
print(a.transpose())


# In[28]:


# 단위행렬 구하는거
print(np.linalg.inv(a))
# 행렬식 구하는거
print(np.linalg.det(a))


# In[30]:


a = np.array([0, 10, 20, 30, 40, 50])

print(a[0])
print(a[4])
a[5] = 90
print(a)


# In[31]:


a = np.array([0, 10, 20, 30, 40, 50])
print(a[[1, 3, 4]])


# In[32]:


b = np.arange(10, 100, 10).reshape(3, 3)
print(b)


# In[33]:


print(b[0, 2])


# In[35]:


b[1] = np.array([45, 55, 65])
print(b)


# In[36]:


a = np.array([1, 2, 3, 4, 5, 6])


# In[37]:


print(a[a > 3])


# In[38]:


print(a[a % 2 == 0])


# In[39]:


a = np.array([0, 10, 20, 30, 40, 50])
print(a[1:4])
print(a[:3])
print(a[2:])
a[2:5] = np.array([25, 35, 45])
print(a)


# In[40]:


a = np.arange(10, 100, 10).reshape(3, 3)
print(a)


# In[41]:


print(a[1:3, 1:3])


# In[42]:


print(a[:3, 1:])


# In[44]:


print(a[1][0:2])


# In[45]:


a[0:2, 1:3] = np.array([[25, 35], [55, 65]])
print(a)


# In[46]:


# In[47]:


s1 = pd.Series([10, 20, 30, 40, 50])
print(s1)


# In[48]:


print(s1.index)


# In[54]:


print(s1.values)
print(type(s1.values))


# In[56]:


s2 = pd.Series(['a', 'b', 'c', 1, 2, 3])
print(s2)


# In[57]:


s3 = pd.Series([np.nan, 1, 2])
print(s3)


# In[61]:


index_date = ['2020-03-20', '2020-03-21', '2020-03-22', '2020-03-21']
s4 = pd.Series([200, 187, np.nan, 210], index=index_date)
print(s4)


# In[62]:


# 딕셔너리로 만들면 키가 인덱스, 밸류가 밸류가됨
s5 = pd.Series({'국어': 100, '영어': 95, '수학': 100})
print(s5)


# ## pd.date_range(start=None, end=None, periods=None, freq ='D')
#                                         시작, 끝, 기간, 생성주기

# In[64]:


p = pd.date_range(start='2020-01-20', end='2020-01-27')
print(p)


# In[ ]:


def solution(n, arr1, arr2):
    answer = []

    for i in arr1:
        answer = bin(arr1)
    print(k)

    print(answer)
    return answer
