# 딥러닝을 구동하는데 필요한 케라스 함수를 불러옴
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense

import numpy as np
import tensorflow as tf

# 실행할 때마다 같은 결과를 출력하기 위해 설정하는 부분입니다.
np.random.seed(3)
tf.random.set_seed(3)

# 준비된 수술환자 데이터를 불러들입니다.
Data_set = np.loadtxt(
    "/Users/user/java-web-project0208/python-basic/dataset/ThoraricSurgery.csv", delimiter=",")

print(Data_set[:11, :])

# 환자의 기록과 수술 결과를 X와 Y로 구분하여 저장
X = Data_set[:, 0:17]
Y = Data_set[:, 17]

# 딥러닝 구조를 결정(모델을 설정하고 실행)
model = Sequential()
model.add(Dense(30, input_dim=17, activation='relu'))
model.add(Dense(1, activation='sigmoid'))
# 딥러닝 실행cd .

# 모델 분류가 2개이므로 binary_crossentropy를 사용, globalminimum 찾는 방식 - adam, mertics - 정확도 산출
model.compile(loss='binary_crossentropy',
              optimizer='adam', metrics=['accuracy'])
model.fit(X, Y, epochs=100, batch_size=10)
