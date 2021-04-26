#!/usr/bin/env python
# coding: utf-8

# In[1]:


import pandas as pd


# In[2]:


CCTV_Seoul = pd.read_csv("/Users/user/java-web-project0208/python-basic/dataset/01. CCTV_in_Seoul.csv", encoding='utf-8')


# In[3]:


CCTV_Seoul.head()


# In[4]:


CCTV_Seoul.columns


# In[5]:


CCTV_Seoul.rename(columns={CCTV_Seoul.columns[0] : '구별'}, inplace=True)


# In[6]:


pop_Seoul = pd.read_excel("/Users/user/java-web-project0208/python-basic/dataset/01. population_in_Seoul.xls")


# In[7]:


pop_Seoul.head()


# In[8]:


pop_Seoul = pd.read_excel("/Users/user/java-web-project0208/python-basic/dataset/01. population_in_Seoul.xls",
                         header = 2,
                         usecols = 'B, D, G, J, N')


# In[9]:


pop_Seoul.head()


# In[12]:


pop_Seoul.rename(columns={pop_Seoul.columns[0] : '구별',
                         pop_Seoul.columns[1] : '인구수',
                         pop_Seoul.columns[2] : '한국인',
                         pop_Seoul.columns[3] : '외국인',
                         pop_Seoul.columns[4] : '고령자'}, inplace=True)


# In[13]:


pop_Seoul.head()


# In[14]:


CCTV_Seoul.sort_values(by='소계',ascending=True).head(5)


# In[16]:


# 각 자치구 별 cctv 대수 증가율 
CCTV_Seoul['최근 증가율'] = (CCTV_Seoul['2016년'] + CCTV_Seoul['2015년'] +
                        CCTV_Seoul['2014년']) / CCTV_Seoul['2013년도 이전'] * 100


# In[17]:


CCTV_Seoul.sort_values(by='최근 증가율',ascending=False).head(5)


# In[18]:


#합계 row 날리기
pop_Seoul.drop([0], inplace=True)
pop_Seoul.head()


# In[19]:


#row 확인
pop_Seoul['구별'].unique()


# In[20]:


#유효하지 않은 데이터를 검색한다.
pop_Seoul[pop_Seoul['구별'].isnull()]


# In[21]:


#유효하지 않은 데이터를 삭제한다.
pop_Seoul.drop([26], inplace=True)
pop_Seoul.head()


# In[22]:


#원하는 컬럼의 값을 뽑아냄
pop_Seoul['외국인 비율'] = pop_Seoul['외국인'] / pop_Seoul['인구수'] * 100
pop_Seoul['고령자 비율'] = pop_Seoul['고령자'] / pop_Seoul['인구수'] * 100
pop_Seoul.head()


# In[23]:


pop_Seoul.sort_values(by='인구수',ascending=False).head(5)


# In[24]:


pop_Seoul.sort_values(by='외국인 비율',ascending=False).head(5)


# In[25]:


#CCTV 와 인구수를 구별로 합치는것 [merge]
data_result = pd.merge(CCTV_Seoul, pop_Seoul, on='구별')


# In[26]:


data_result.head()


# In[28]:


#컬럼 삭제하는 방법
del data_result['2013년도 이전']
del data_result['2014년']
del data_result['2015년']
del data_result['2016년']


# In[29]:


#인덱스를 원하는 컬럼으로 설정하는 것.
data_result.set_index('구별', inplace=True)
data_result.head()


# In[31]:


#상관관계를 표현해주는 numpy의 corrcoef 를 사용한다.
# target 과 연관있는 것들을 찾는데 용이하다.
import numpy as np
np.corrcoef(data_result['고령자 비율'], data_result['소계'])


# In[32]:


np.corrcoef(data_result['인구수'], data_result['소계'])


# In[38]:


import platform
import matplotlib.pyplot as plt
from matplotlib import font_manager, rc
plt.rcParams['axes.unicode_minus'] = False

if platform.system() == 'Darwin':
    rc('font', family='AppleGothic')
elif platform.system() == 'Windows':
    path="c:/Windows/Fonts/malgun.ttf"
    font_name = font_manager.FontProperties(fname=path),get_name()
    rc('font', family=font_name)


# In[39]:


plt.figure()
data_result['소계'].plot(kind='barh', grid=True, figsize=(10,10))
plt.show()


# In[40]:


data_result['CCTV비율'] = data_result['소계'] / data_result['인구수'] * 100


# In[41]:


data_result['CCTV비율'].sort_values().plot(kind='barh', grid=True, figsize=(10,10))
plt.show()


# In[42]:


plt.figure(figsize=(6,6))
plt.scatter(data_result['인구수'], data_result['소계'], s=50)
plt.xlabel('인구수')
plt.ylabel('CCTV')
plt.grid()
plt.show()


# In[43]:


fp1 = np.polyfit(data_result['인구수'], data_result['소계'], 1)


# In[44]:


fp1


# In[45]:


f1 = np.poly1d(fp1)


# In[46]:


fx = np.linspace(100000,700000,100)


# In[47]:


plt.figure(figsize=(6,6))
plt.scatter(data_result['인구수'], data_result['소계'], s=50)
plt.plot(fx, f1(fx), ls='dashed', lw=3, color='g')
plt.xlabel('인구수')
plt.ylabel('CCTV')
plt.grid()
plt.show()


# In[48]:


data_result['오차'] = np.abs(data_result['소계'] - f1(data_result['인구수']))
df_sort = data_result.sort_values(by='오차', ascending=False)
df_sort.head()


# In[49]:


plt.figure(figsize=(14,10))
plt.scatter(data_result['인구수'], data_result['소계'], c=data_result['오차'], s=50)
plt.plot(fx, f1(fx), ls='dashed', lw=3, color='g')

for n in range(10):
    plt.text(df_sort['인구수'][n]*1.02, df_sort['소계'][n]*0.98, df_sort.index[n], fontsize=15)

plt.xlabel('인구수')
plt.ylabel('인구당비율')
plt.grid()
plt.show()


# In[ ]:




