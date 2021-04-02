#!/usr/bin/env python
# coding: utf-8

# In[9]:


print("Tell me your age")

my_age = int(input())

if my_age < 30:
    print("Young!")
else:
    print("Old!")


# In[19]:


score = int(input("Enter your score:"))

if score >= 90:
    grade = 'A'
elif score >= 80:
    grade = 'B'
elif score >= 70:
    grade = 'C'
elif score >= 60:
    grade = 'D'
else:
    grade = 'F'

print(grade)


# In[18]:


a = 10
b = a * 10 if a % 2 == 0 else a + 10
print(b)


# In[21]:


for n in [1, 2, 3, 4, 5]:
    print('No.', n)  # 이게 주석임


# 이건 주피터 노트북으로 메모하는거임 CODE - 코드작성 , MarkDown - 메모 작성
#

# # 글자
# ## 크기
# ### 다르게
#
# 다음라인으로 넘기기 스페이스두번 엔터
# 다음라인에 작성
#
# 1.ㄱ
# 2.ㄴ
# 3.ㄷ
#
# - a
# - b
# - c

# In[23]:


for n in range(5):  # for문의 범위 지정
    print(n)


# In[26]:


for n in range(1, 6, 2):  # a ~ b-1 까지 c 칸씩
    print(n)


# In[28]:


for n in 'abcdefg':  # 문자열도 반복문으로 출력가능
    print(n)


# In[35]:


for n in ['apple', 'banana', 'mango']:
    for k in n:
        print(k)  # 배열중 string 을 char 로 출력
    print(n)  # 배열을 string으로 출력


# In[36]:


i = 1
while i < 10:
    print(i)
    i += 1


# In[45]:


for i in range(10):
    if i == 5:
        break
    print(i)
print("End of program")


# In[44]:


for i in range(5):
    if i == 3:
        continue
    print(i)
print("End of program")


# In[48]:


for i in range(10):
    print(i)
else:
    print("End of program")


# In[71]:


data = [2, 4, 5, 11, 3]

for i in data:
    if i > 10:
        break
else:
    # for 문이 완전히 실행되지 않으면 else 가 실행되지 않으므로 for문의 종결유무를 찾기 좋음
    print('10 보다 큰 수 없음')


# In[70]:


n = int(input("몇단"))

print("구구단", n, "단 계산")
for i in range(1, 10):
    print(n, 'x', i, '=', n*i)


# In[ ]:
