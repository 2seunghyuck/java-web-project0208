#!/usr/bin/env python
# coding: utf-8

# In[1]:


import pandas as pd


# In[2]:


p = pd.date_range(start ='2020-05-01', periods=7)
print(p)


# ###https://pandas.pydata.org/pandas-docs/stable/user_guide/timeseries.html#offset-aliases
# Frequency 옵션들

# In[4]:


p = pd.date_range(start='2020-01-01', periods = 4, freq='2D') # D == Day
print(p)


# In[6]:


p = pd.date_range(start='2021-04-01', periods=5, freq='W') # W == Week
print(p)


# In[7]:


p = pd.date_range(start='2021-02-01', periods=12, freq='2BM') #BM == Business Month, 주의 마지막 평일까지
print(p)


# In[9]:


p = pd.date_range(start='2021-01-03', periods=5, freq='QS') # QS == 분기의 시작일
print(p)


# In[10]:


p = pd.date_range(start='2021-01-01', periods=3, freq='AS') # AS == 매 년의 시작일 
print(p)


# In[12]:


p = pd.date_range(start='2021-01-01 08:00', periods=10, freq='H') # H == hour, 시간단위로 period 만큼
print(p)


# In[13]:


p = pd.date_range(start='2021-01-01 08:00', periods=10, freq='BH') # BH == Business hour
print(p)


# In[17]:


print(pd.offsets.BusinessHour())


# In[19]:


import datetime

bh = pd.offsets.BusinessHour(start='09:00', end=datetime.time(18,0)) # 임의로 BH의 Range 를 정의해서 사용할 수 있다.
p2 = pd.date_range(start='2021-01-01 08:00', periods=10, freq='BH') +bh
print(p2)


# In[20]:


import warnings
warnings.simplefilter(action='ignore', category=pd.errors.PerformanceWarning) # 위의 performanceWarning 잡아주는것


# In[25]:


p = pd.date_range(start='2021-01-01 10:00', periods=4, freq='30min')
print(p)


# In[28]:


index_date = pd.date_range(start='2021-04-01', periods=5, freq='D')
p= pd.Series([51, 63, 59, 48, 60], index = index_date) # 날짜에 인덱스를 지정해줌
print(p)


# ## DataFrame

# df = pd.DataFrame(data, [,index=index_data, columns = columns_data])  
# data : 리스트, 딕셔너리, Numpy배열, Series, DataFrame  
# DataFrame의 세로축은 index, 가로축은 columns 라함  
# index 와 columns 를 제외한 영역은 values 라함  
# index와 columns의 기본값은 숫자 0 부터 입력  

# In[30]:


df = pd.DataFrame([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
print(df)


# In[31]:


import numpy as np


# In[32]:


data_list = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]]) # 위의 DataFrame 을 Numpy 배열로 만든것
df = pd.DataFrame(data_list)
print(df)


# In[34]:


data = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12]])
index_date = pd.date_range('2020-05-01', periods=4)
columns_list = ['A', 'B', 'C']
df = pd.DataFrame(data, index = index_date, columns = columns_list)
print(df)


# In[36]:


# DataFrame 을 딕셔너리로 생성하면 key 가 columns 가 된다.
data = {'연도': [2015, 2016, 2016, 2017, 2018], '지사': ['서울','서울','부산','서울','부산'], 
       '고객 수 ': [200, 250, 150, 300, 200]} # 
df = pd.DataFrame(data)
print(df)


# In[39]:


data = {'연도': [2015, 2016, 2016, 2017, 2018], '지사': ['서울','서울','부산','서울','부산'], 
       '고객 수': [200, 250, 150, 300, 200]}
df = pd.DataFrame(data, columns=['지사', '연도', '고객 수']) # 데이터를 건드리는것은 좋지않으므로 컬럼의 이름을줘서 추출
print(df)


# In[42]:


s1 = pd.Series([1, 2, 3, 4, 5])
s2 = pd.Series([10, 20, 30, 40, 50])

print(s1+s2)
print(s1-s2)
print(s1/s2)
print(s1*s2)


# In[43]:


s3 = pd.Series([1,2,3,4])
s4 = pd.Series([10, 20 ,30, 40, 50])
print(s3+s4)


# In[44]:


data1 = {'A': [1, 2, 3, 4, 5],
         'B': [10, 20, 30, 40, 50],
         'C': [100, 200, 300, 400, 500]}
df1 = pd.DataFrame(data1)
print(df1)

data2 = {'A': [6, 7, 8],
         'B': [60, 70, 80],
         'C': [600, 700, 800]}
df2 = pd.DataFrame(data2)
print(df2)


# In[45]:


print(df1 + df2)


# In[51]:


table_data3 = {'봄': [256.5, 264.3, 215.9, 223.2, 312.8],
             '여름': [770.6, 567.5, 599.8, 387.1, 446.2],
             '가을': [363.5, 231.2, 293.1, 247.7, 381.6],
             '겨울': [139.3, 59.9, 76.9, 109.1, 108.1]}
columns_list = ['봄', '여름', '가을', '겨울']
index_list = ['2012', '2013', '2014', '2015', '2016']


# In[52]:


df3 = pd.DataFrame(table_data3, columns = columns_list, index=index_list)
print(df3)


# In[53]:


print(df3.mean()) # 계절별 평균 --> columns
print('=' * 30)
print(df3.std()) # 계절별 표준편차


# In[55]:


print(df3.mean(axis=1)) # 연도별 --> index
print('=' * 30)
print(df3.std(axis=1)) 


# In[56]:


print(df3.describe()) # 전체를 다 표현해줌


# ## data slicing  
# 

# In[57]:


KTX_data = {'경부선 KTX': [39060, 39896, 42005, 43621, 41702, 41266, 32427],
           '호남선 KTX': [7313, 6967, 6873, 6626, 8675, 10622, 9228],
           '경전선 KTX': [3627, 4168, 4088, 4424, 4606, 4984, 5570],
           '전라선 KTX': [309, 1771, 1954, 2244, 3146, 3945, 5766],
           '동해선 KTX': [np.nan,np.nan, np.nan, np.nan, 2395, 3786, 6667]}
columns_list = ['경부선 KTX', '호남선 KTX', '경전선 KTX', '전라선 KTX', '동해선 KTX']
index_list = ['2011', '2012', '2013', '2014', '2015', '2016', '2017']


# In[58]:


df_KTX = pd.DataFrame(KTX_data, columns = columns_list, index = index_list)
print(df_KTX)


# ## 전체 데이터 중 처음이나 끝 일부분 선택  
# 
#   - head([n])  
#   - tail([n])  
#   - n 을 지정하지 않으면 기본값 5

# In[62]:


print(df_KTX.head())
print('='*30)
print(df_KTX.head(3))


# In[63]:


#slicing
print(df_KTX[2:5])


# In[64]:


# 인덱스 지정(행 선택)
print(df_KTX.loc['2011']) 


# In[66]:


print(df_KTX.loc['2013':'2016']) 


# In[67]:


print(df_KTX['경부선 KTX'][1:4]) #.loc 안쓰고 컬럼 추출


# In[68]:


print(df_KTX.loc['2016']['호남선 KTX'])
print('='*30)
print(df_KTX.loc['2016', '호남선 KTX'])
print('='*30)
print(df_KTX['호남선 KTX']['2016'])
print('='*30)
print(df_KTX['호남선 KTX'][5])
print('='*30)
print(df_KTX['호남선 KTX'].loc['2016'])
print('='*30)


# In[69]:


print(df_KTX.T) # 데이터 프레임을 행렬로 인식해서 만들어줌 (행과, 열을 바꿔줌)


# In[71]:


print(df_KTX[['동해선 KTX', '전라선  KTX', '경전선 KTX', '호남선  KTX', '경부선  KTX']])


# In[72]:


## 데이터 프레임 통합


# In[73]:


df1 = pd.DataFrame({'Class1': [95, 92 ,98, 100],
                    'Class2': [91,93,97,99]})
print(df1)


# In[74]:


df2 = pd.DataFrame({'Class1': [87, 89],
                    'Class2': [85, 90]})


# In[75]:


print(df1.append(df2)) # 같은 key 끼리 묶는거 append


# In[76]:


print(df1.append(df2, ignore_index=True)) # append로 합쳤을떄의 인덱스를 순서로 조정


# In[77]:


df3 = pd.DataFrame({'Class1': [96, 83]})


# In[78]:


print(df2.append(df3, ignore_index=True))


# In[79]:


df4 = pd.DataFrame({'Class3': [93, 91, 96, 98]})


# In[80]:


print(df1.join(df4)) # 옆으로 붙이는거 조인 (같은 index기준)


# In[81]:


index_label = ['a', 'b','c','d']
df1a = pd.DataFrame({'Class1': [95, 92, 98, 100],
                    'Class2': [91,93,95,99]}, index=index_label)
df4a = pd.DataFrame({'Class3': [92, 93, 94, 95]}, index=index_label)

print(df1a.join(df4a))


# In[82]:


df5 = pd.DataFrame({'Class4': [82, 92]})
print(df1.join(df5))


# In[83]:


df_A_B = pd.DataFrame({'판매월': ['1월', '2월', '3월', '4월'],
                      '제품A': [100, 150, 200, 130],
                      '제품B': [90, 110, 140, 170]})

df_C_D = pd.DataFrame({'판매월': ['1월', '2월', '3월', '4월'],
                      '제품C': [112, 141, 203, 134],
                      '제품D': [90, 110, 140, 170]})


# In[84]:


# 판매 월 이라는 동일한 컬럼이 겹쳐서 에러가남
print(df_A_B.join(df_C_D))


# In[87]:


#동일한 컬럼으로 조인 시킴
print(df_A_B.merge(df_C_D))
#append와의 차이
print(df_A_B.append(df_C_D))


# In[88]:


df_left = pd.DataFrame({'key': ['A', 'B','C'], 'left':[1, 2, 3]})
df_right = pd.DataFrame({'key': ['A','B','D'], 'right':[4, 5, 6]})
print(df_left, df_right)


# In[89]:


print(df_left.merge(df_right, how='left', on='key')) #기준을 잡아서 머지하는 것


# In[90]:


print(df_left.merge(df_right, how='outer', on='key')) # 양쪽 다


# In[91]:


print(df_left.merge(df_right, how='inner', on='key')) # 겹치는 부분만


# In[99]:


df = pd.read_csv('/Users/user/java-web-project0208/python-basic/data/sea_rain1.csv')


# In[96]:


print(df)


# In[100]:


df_WH = pd.DataFrame({'Weight': [62, 67, 55, 74],
                      'Height':[165, 177,160,180]},
                    index=['ID_1', 'ID_2', 'ID_3', 'ID_4' ])
df_WH.index.name = 'User'
print(df_WH)


# In[101]:


bmi = df_WH['Weight']/(df_WH['Height']/100) **2
print(bmi)


# In[102]:


df_WH['BMI'] = bmi
print(df_WH)


# In[103]:


df_WH.to_csv('/Users/user/java-web-project0208/python-basic/data/save_DataFrame.csv')


# In[104]:


import matplotlib.pyplot as plt


# In[105]:


data1 = [10, 14, 19, 20, 25]
plt.plot(data1)
plt.show()


# In[108]:


# 별도의 창으로 띄워줌
# %matplotlib auto

#jupyter 에서 쓸때
get_ipython().run_line_magic('matplotlib', 'inline')


# In[109]:


data1 = [10, 14, 19, 20, 25]
plt.plot(data1)
plt.show()


# In[112]:


x = np.arange(-4.5, 5, 0.5) # 범위 -4.5~ 5 0.5씩증가
y= 2*x**2
plt.plot(x, y)
plt.show()


# In[113]:


x = np.arange(-4.5, 5, 0.5)
y1 = 2*x**2
y2 = 5*x +30
y3 = 4*x**2 +10


# In[115]:


plt.plot(x, y1)
plt.plot(x, y2)
plt.plot(x, y3)
plt.show()


# In[116]:


plt.plot(x, y1, x, y2, x, y3)
plt.show()


# In[118]:


x = np.arange(-5, 5, 0.1)
y1 = x **2 -2
y2 = 20*np.cos(x) **2 

plt.figure(1) # 1번 그래프 창을 생성합
plt.plot(x, y1) # 지정된 그래프 창에 그래프를 그림

plt.figure(2) # 2번 그래프 창을 생성합
plt.plot(x, y2)# 지정된 그래프 창에 그래프를 그림

plt.figure(1) # 이미 생성된 1번 그래프 창을 지정함
plt.plot(x, y2) # 지정된 그래프 창에 그래프를 그림

plt.figure(2) # 이미 생성된 2번 그래프창을 지정합
plt.clf() # 2번 그래프 창에 그려진 모든 그래프를 지움
plt.plot(x, y1) # 지정된 그래프 창에 그래프를 그림

plt.show()


# # 그래프 영역 나누기   
#   - plt.subplot(m,n,p)
#   - m X n 행렬의 그래프 영역 중 p 번쨰 위치
#   - p는 왼쪽 -> 오른쪽 ,위 -> 아래
#   

# In[119]:


x = np.arange(0, 10, 0.1)
y1 = 0.3*(x-5) **2 +1
y2 = -1.5*x +3
y3 = np.sin(x)**2 # Numpy에서 sin()은 np.sin()
y4 = 10*np.exp(-x) +1 # exp() 는 np.exp() 지수함수


# In[120]:


# 2 x 2 행렬로 이루어진 하위 그래프에서 p 에따라 위치를 지정

plt.subplot(2,2,1)  # p는 1
plt.plot(x,y1)

plt.subplot(2,2,2)  # p는 2
plt.plot(x,y2)

plt.subplot(2,2,3)  # p는 3
plt.plot(x,y3)

plt.subplot(2,2,4)  # p는 4
plt.plot(x,y4)

plt.show()


# In[121]:


x = np.linspace(-4, 4, 100) # [-4, 4] 범위에서 100개의 값 생성
y1 = x**3
y2 = 10*x**2 - 2

plt.plot(x, y1, x, y2)
plt.show()


# In[123]:


# 겹치는 부분의 데이터를 잘 확인할 수 있게해줌

plt.plot(x, y1, x, y2)
#x, y에 limit을 줘서 그부분만 확대 할수 있음
plt.xlim(-1, 1)
plt.ylim(-3, 3)
plt.show()


# ## 포맷 문자열 '[color][line_style][marker]'

# In[129]:


x = np.arange(0, 5, 1)
y1 = x
y2 = x + 1
y3 = x + 2
y4 = x + 3

plt.plot(x, y1, x, y2, x, y3, x, y4)
plt.show()


# In[130]:


plt.plot(x, y1, '>--r', x, y2, 's-g', x, y3, 'd:b', x, y4,'-.Xc')
plt.show()


# In[127]:


plt.plot(x,y1)
plt.xlabel('X-axis')
plt.ylabel('Y-axis')
plt.title('Graph title')
plt.grid()
plt.show()


# In[128]:


x = np.arange(0, 5, 1)
y1 = x
y2 = x + 1
y3 = x + 2
y4 = x + 3


# In[132]:


# 그래프의 이름 표시
plt.plot(x, y1, '>--r', x, y2, 's-g', x, y3, 'd:b', x, y4,'-.Xc')
plt.legend(['data1', 'data2', 'data3', 'data4'], loc = 'lower right') #loc 로 위치 조정가능
plt.show()


# In[136]:


plt.plot(x, y1, '>--r', x, y2, 's-g', x, y3, 'd:b', x, y4,'-.Xc')
plt.legend(['data1', 'data2', 'data3', 'data4'], loc=4)
plt.xlabel('X-axis')
plt.ylabel('Y-axis')
plt.title('Graph title')
plt.grid(True)
plt.show()


# In[142]:


plt.plot(x, y1, '>--r', x, y2, 's-g', x, y3, 'd:b', x, y4,'-.Xc')
plt.legend(['데이터1', '데이터2', '데이터3', '데이터4'], loc=4)
plt.xlabel('X-axis')
plt.ylabel('Y-axis')
plt.title('Graph title')
plt.grid(True)
plt.show()


# In[140]:


from matplotlib import rc # 한글출력할 수 있게 하는 임포트


# In[141]:


rc('font', family='AppleGothic')


# In[143]:


import platform
from matplotlib import font_manager, rc # 운영체제에 따라 구분
path = "c:/Windows/Fonts/malgun.ttf"
if platform.system() == 'Darwin':
    rc('font', family='AppleGothic')
elif platform.system() == 'Windows':
    font_name = font_manager.FontProperties(fname=path).get_name()
    rc('font', family = font_name)
else:
    print("Unknown system ..")


# In[147]:


plt.plot(x, y1, '>--r', x, y2, 's-g', x, y3, 'd:b', x, y4,'-.Xc')

# x, y 좌표를 지정해 그 위치에 문자열 출력 가능

plt.text(0, 6, "문자열 출력 1")
plt.text(0, 5, "문자열 출력 2")
plt.text(3, 1, "문자열 출력 3")
plt.text(3, 0, "문자열 출력 4")

plt.show()


# In[148]:


height = [165, 177, 160, 178, 185, 155, 172]
weight = [62, 67, 55, 74, 90, 43, 64]


# In[149]:


#scatter 그래프 그리기 => 지정위치에 점을 표현
plt.scatter(height, weight)
plt.xlabel('Height(m)')
plt.ylabel('weight(kg)')
plt.title('Height & Weight')
plt.grid(True)
plt.show()


# In[151]:


# 마커의 큭기와 색깔 설정
plt.scatter(height, weight, s=50, c='r')
plt.xlabel('Height(m)')
plt.ylabel('weight(kg)')
plt.title('Height & Weight')
plt.grid(True)
plt.show()


# In[152]:


#사이즈와 색을 변수에 담아 각자 다르게 출력하기

size = 100 * np.arange(1,8)
colors = ['r', 'g', 'b', 'c', 'm', 'k', 'y']
plt.scatter(height, weight, s=size, c=colors)
plt.xlabel('Height(m)')
plt.ylabel('weight(kg)')
plt.title('Height & Weight')
plt.grid(True)
plt.show()


# In[153]:


city = ['서울', '인천', '대전', '대구', '울산', '부산', '광주']
# 위도(latitude)와 경도(longitude)
lat = [37.56, 37.45, 36.35, 35.87, 35.53, 35.18, 35.16]
lon = [126.97, 126.70, 127.38, 128.60, 129.31, 129.07, 126.85]

# 인구 밀도(명/km^2): 2017년 통계청 자료
pop_den = [16154, 2751, 2839, 2790, 1099, 4454, 2995]


# In[154]:


size = np.array(pop_den) * 0.2
colors = ['r', 'g', 'b', 'c', 'm', 'k', 'y']


# In[155]:


plt.scatter(lon, lat, s= size, c=colors, alpha =0.5)
plt.xlabel('경도(longitude)')
plt.ylabel('밀도(latitude)')
plt.title('지역별 인구 밀도 (2017)')

for x, y, name in zip(lon, lat, city):
    plt.text(x, y, name) # 위도와 경도에 맞는 도시이름 출력
    
plt.show()


# In[158]:


#휘트니스 클럽 회원 4명의 운동 시작 전, 시작 한 달 후 윗몸 일으키키 횟수

member_IDs = ['m_01', 'm_02', 'm_03', 'm_04'] # 회원 ID
before_ex = [27, 35, 40, 33] # 운동 시작 전
after_ex = [30, 38, 42, 37] # 운동 한 달 후


# In[159]:


# 막대 그래프로 표시

n_data = len(member_IDs)  # 회원이 네명이르모 데이터 수는 4
index = np.arange(n_data) # numpy를 이용해 배열 생성 [0,1,2,3]
plt.bar(index, before_ex) # bar(x, y)에서 x=index, height=before_ex로 지정
plt.show()


# In[160]:


n_data = len(member_IDs)  
index = np.arange(n_data) 
plt.bar(index, before_ex, tick_label= member_IDs) # x축의 해당 멤버이름울 설정
plt.show()


# In[161]:


n_data = len(member_IDs)  
index = np.arange(n_data) 
colors = ['r','g','b','y']
plt.bar(index, before_ex, tick_label = member_IDs, color = colors) 
plt.show()


# In[162]:


n_data = len(member_IDs)  
index = np.arange(n_data) 
colors = ['r','g','b','y']
plt.bar(index, before_ex, tick_label = member_IDs, color = colors, width =0.6) 
plt.show()


# In[163]:


n_data = len(member_IDs)  
index = np.arange(n_data) 
colors = ['r','g','b','y']
plt.barh(index, before_ex, tick_label = member_IDs, color = colors) #bar horizontal 가로로 
plt.show()


# In[165]:


n_data = len(member_IDs)  
index = np.arange(n_data) 
colors = ['r','g','b','y']
barWidth = 0.4
plt.bar(index, before_ex, color='c', align='edge', width= barWidth, label='before')
plt.bar(index+barWidth, after_ex, color='m', align='edge', width= barWidth, label='after')

plt.xticks(index+barWidth, member_IDs)
plt.legend()
plt.xlabel('회원 아이디')
plt.ylabel('윗몸일으키기 횟수')
plt.title('운동시작 전과 후의 근지구력 변화 비교')

plt.show()


# ## 히스토그램
# 
# - plt.hist(x[,bins=bins_n 또는 'auto])
# - x 는 변량
# - bins 는 계급의 개수, 입력하지 않으면 기본값 10 (x축)
# - 'auto' 가 입력되면 x 에맞게 자동으로 할당 

# In[169]:


math = [76, 82, 84, 83, 90, 86, 85, 92, 72, 71, 100, 87, 81, 76, 94, 78, 81, 60, 79, 69, 74, 87, 82, 68, 79]
plt.hist(math)
plt.show()


# In[170]:


plt.hist(math, bins =8)
plt.show()


# In[171]:


plt.hist(math, bins=8)
plt.xlabel('시험점수')
plt.ylabel('도수(frequency)')
plt.title('수학시험의 히스토그램')
plt.grid()
plt.show()


# In[175]:


# 학생 20명의 선호과일
# 3시를 기준으로 반시계방향으로 진행
fruit = ['사과','바나나','딸기','오렌지','포도']
result = [7, 6, 3, 2, 2]
plt.pie(result)
plt.title('학생 20명의 선호과일')
plt.show()


# In[176]:


plt.pie(result, labels=fruit, autopct='%.1f%%')
plt.show()


# In[180]:


plt.pie(result, labels=fruit, autopct='%.1f%%', startangle=90, counterclock=False) #시작점을 12시에서 시계방향으로 
plt.show()


# In[186]:


explode_value = (0.1, 0, 0, 0, 0) # 인덱스에맞는 수 만큼 분리
plt.pie(result, labels=fruit, autopct='%.1f%%', startangle=90, counterclock=False, explode=explode_value, shadow=True)
plt.show()


# In[187]:


print(matplotlib.rcParams['figure.figsize'])


# In[188]:


print(matplotlib.rcParams['figure.dpi'])


# In[189]:


explode_value = (0.1, 0, 0, 0, 0)
plt.pie(result, labels=fruit, autopct='%.1f%%', startangle=90, counterclock=False, explode=explode_value, shadow=True)
plt.title('Save figures')
plt.savefig('/Users/user/java-web-project0208/python-basic/data/saveFigTest', dpi = 100) # 저장하기
plt.show()


# In[190]:


#사이즈 조정
plt.figure(figsize=(6,5))
plt.pie(result, labels=fruit, autopct='%.1f%%', startangle=90, counterclock=False, explode=explode_value, shadow=True)
plt.title('Save figures')
plt.savefig('/Users/user/java-web-project0208/python-basic/data/saveFigTest', dpi = 200)
plt.show()


# In[191]:


# pandas 로 그래프 그리기 ==> matplotlib 를 지원한다.
s1 = pd.Series([1,2,3,4,5,6,7,8,9,10])
print(s1)


# In[192]:


s1.plot()
plt.show()


# In[199]:


s2 = pd.Series([1,2,3,4,5,6,7,8,9,10], index = pd.date_range('2021-01-01', periods=10))
s2.plot(grid=True)
plt.show()


# In[203]:


df_rain = pd.read_csv('/Users/user/java-web-project0208/python-basic/data/sea_rain1.csv', index_col="연도")
df_rain.plot()
plt.show()


# In[206]:



rain_plot = df_rain.plot(grid=True, style=['r--*', 'g-o', 'b:*', 'm-.p'])
rain_plot.set_xlabel('연도')
rain_plot.set_ylabel('강수량')
rain_plot.set_title('연간 강수량')
plt.show()


# In[207]:


#연도별 1인당 주거면적
year = [2006, 2008, 2010, 2012, 2014, 2016] # 연도
area = [26.2, 27.8, 28.5, 31.7, 33.5, 33.2] # 1인당 주거면적
table = {'연도':year, '주거면적':area}


# In[208]:


df_area = pd.DataFrame(table, columns=['연도', '주거면적'])
print(df_area)


# In[209]:


df_area.plot(x='연도', y='주거면적', grid=True, title='연도별 1인당 주거면적')
plt.show()


# In[ ]:




