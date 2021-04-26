#!/usr/bin/env python
# coding: utf-8

# In[1]:


import numpy as np
import pandas as pd


# In[3]:


#천단위 구분해주기위한 , 를 지워주지 않으면 피벗에서 숫자로 인식하지 못해 날아간다.
crime_anal_police = pd.read_csv("/Users/user/java-web-project0208/python-basic/dataset/02. crime_in_Seoul.csv", thousands=',' ,encoding='euc-kr')
crime_anal_police.head()


# In[4]:


import googlemaps


# In[5]:


gmaps_key = "AIzaSyA-vIbv4B8wj-u-CjwsE4lEMhTNzOm7T3A"
gmaps = googlemaps.Client(key=gmaps_key)


# In[6]:


gmaps.geocode('서울중부경찰서', language='ko')


# In[7]:


# 컬럼대로 검색을 용이하게 하기위한 전처리
station_name = []
for name in crime_anal_police['관서명']:
    station_name.append('서울' + str(name[:-1]) + '경찰서')


# In[8]:


station_name


# In[9]:


# 위치정보를 생성해주는 코드

station_address = []
station_lat = []
station_lng = []

for name in station_name:
    tmp = gmaps.geocode(name, language='ko')
    station_address.append(tmp[0].get("formatted_address"))
    
    tmp_loc = tmp[0].get("geometry")
    
    station_lat.append(tmp_loc['location']['lat'])
    station_lng.append(tmp_loc['location']['lng'])
    
    print(name + "-->" + tmp[0].get('formatted_address'))


# In[10]:


# 구의 이름을 알기위한 전처리
gu_name = []

for name in station_address:
    tmp = name.split()
    
    tmp_gu = [gu for gu in tmp if gu[-1] == '구'][0] #list.comprehension
    
    gu_name.append(tmp_gu)

crime_anal_police['구별'] = gu_name

crime_anal_police.head()


# In[11]:


# 구별로 범죄 발생 건수의 합을 표현해주는것.
crime_anal = pd.pivot_table(crime_anal_police, index='구별', aggfunc=np.sum)

crime_anal.columns


# In[12]:


crime_anal['강간검거율'] = crime_anal['강간 검거']/crime_anal['강간 발생']*100
crime_anal['강도검거율'] = crime_anal['강도 검거']/crime_anal['강도 발생']*100
crime_anal['살인검거율'] = crime_anal['살인 검거']/crime_anal['살인 발생']*100
crime_anal['절도검거율'] = crime_anal['절도 검거']/crime_anal['절도 발생']*100
crime_anal['폭력검거율'] = crime_anal['폭력 검거']/crime_anal['폭력 발생']*100


# In[13]:


del crime_anal['강간 검거']
del crime_anal['강도 검거']
del crime_anal['살인 검거']
del crime_anal['절도 검거']
del crime_anal['폭력 검거']


# In[14]:


crime_anal.head()


# In[15]:


con_list = ['강간검거율','강도검거율','살인검거율','절도검거율','폭력검거율']

for column in con_list:
    crime_anal.loc[crime_anal[column] > 100 , column] = 100
    
crime_anal.head()


# In[18]:


crime_anal.rename(columns={crime_anal.columns[0] : '강간',
                         crime_anal.columns[1] : '강도',
                         '살인 발생' : '살인',
                         crime_anal.columns[3] : '절도',
                         crime_anal.columns[4] : '폭력'}, inplace=True)


# In[19]:


crime_anal.head()


# In[22]:


# 상대적 평가를 위해 max를 기준으로 비율로 표현해주는 방법
from sklearn import preprocessing

col = ['강간', '강도', '살인', '절도', '폭력']

x = crime_anal[col].values
min_max_scaler = preprocessing.MinMaxScaler()
x_scaled = min_max_scaler.fit_transform(x.astype(float))

crime_anal_norm = pd.DataFrame(x_scaled, columns = col, index = crime_anal.index)

col2 = ['강간검거율', '강도검거율', '살인검거율', '절도검거율', '폭력검거율']
crime_anal_norm[col2] = crime_anal[col2]
crime_anal_norm.head()


# In[23]:


#CCTV정보를 추가해준다.
result_CCTV = pd.read_csv("/Users/user/java-web-project0208/python-basic/dataset/01. CCTV_result.csv", encoding='utf-8', index_col='구별')
crime_anal_norm[['인구수', 'CCTV']] = result_CCTV[['인구수', '소계']]
crime_anal_norm.head()


# In[24]:


# 범죄 항목으로 컬럼을 임시로 합쳐 합을 출력한다.
col = ['강간', '강도', '살인', '절도', '폭력']
crime_anal_norm['범죄'] = np.sum(crime_anal_norm[col], axis=1)
crime_anal_norm.head()


# In[25]:


import matplotlib.pyplot as plt
import seaborn as sns


# In[26]:


import platform
from matplotlib import font_manager, rc
plt.rcParams['axes.unicode_minus'] = False

if platform.system() == 'Darwin':
    rc('font', family='AppleGothic')
elif platform.system() == 'Windows':
    path="c:/Windows/Fonts/malgun.ttf"
    font_name = font_manager.FontProperties(fname=path),get_name()
    rc('font', family=font_name)


# In[28]:


sns.pairplot(crime_anal_norm, vars=['강도', '살인', '폭력'], kind='reg', height=3)
plt.show()


# In[29]:


sns.pairplot(crime_anal_norm, x_vars=['인구수', 'CCTV'], y_vars=['살인','강도'], kind='reg' ,height=3)
plt.show()


# In[30]:


sns.pairplot(crime_anal_norm, x_vars=['인구수', 'CCTV'], y_vars=['살인검거율','폭력검거율'], kind='reg' ,height=3)
plt.show()


# In[31]:


col = ['강간검거율', '강도검거율', '살인검거율', '절도검거율', '폭력검거율']
crime_anal_norm['검거'] = np.sum(crime_anal_norm[col], axis=1)


# In[33]:


tmp_max = crime_anal_norm['검거'].max()
crime_anal_norm['검거'] = crime_anal_norm['검거'] / tmp_max * 100
crime_anal_norm_sort = crime_anal_norm.sort_values(by='검거', ascending=False)
crime_anal_norm_sort.head()


# In[34]:


target_col = ['강간검거율', '강도검거율', '살인검거율', '절도검거율', '폭력검거율']
plt.figure(figsize=(10,10))
sns.heatmap(crime_anal_norm_sort[target_col], annot=True, fmt='f', linewidths=.5, cmap='RdPu')
plt.title('범죄 검거비율(정규화된 검거의 합으로 정렬)')
plt.show()


# In[35]:


target_col = ['강간', '강도', '살인', '절도', '폭력']

crime_anal_norm['범죄'] = crime_anal_norm['범죄'] /5
crime_anal_norm_sort = crime_anal_norm.sort_values(by='범죄', ascending=False)

plt.figure(figsize=(10,10))
sns.heatmap(crime_anal_norm_sort[target_col], annot=True, fmt='f', linewidths=.5, cmap='RdPu')
plt.title('범죄 검거비율(정규화된 검거의 합으로 정렬)')
plt.show()


# In[36]:


crime_anal_norm.to_csv('/Users/user/java-web-project0208/python-basic/dataset/02. crime_in_Seoul_final.csv', sep=',', encoding='utf-8')


# In[ ]:




