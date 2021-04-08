from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense
from tensorflow.keras.callbacks import ModelCheckpoint, EarlyStopping

import pandas as pd
import numpy as np
import tensorflow as tf
import os
import matplotlib.pyplot as plt

df_pre = pd.read_csv("/Users/user/java-web-project0208/python-basic/dataset/wine.csv", header=None)
df = df_pre.sample(frac=0.30)

dataset = df.values
X = dataset[:, 0:12].astype(float)
Y = dataset[:, 12]

model = Sequential()
model.add(Dense(30, input_dim=12, activation='relu'))
model.add(Dense(12, activation='relu'))
model.add(Dense(8, activation='relu'))
model.add(Dense(1, activation='sigmoid'))

model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])

MODEL_DIR = '/Users/user/java-web-project0208/python-basic/model'
if not os.path.exists(MODEL_DIR):
    os.mkdir(MODEL_DIR)

modelpath = "/Users/user/java-web-project0208/python-basic/model/{epoch:02d}-{val_loss:.4f}.hdf5"
checkpointer = ModelCheckpoint(filepath=modelpath, monitor='val_loss', verbose=1, save_best_only=True)

history = model.fit(X, Y, validation_split=0.33, epochs=3500, batch_size=500)

#y_vloss에 테쇼ㅡ트셋으로 실험결과의 오차랎을 저장
y_vloss = history.history['val_loss']
#y_acc에 정확도 값을 저장
y_acc = history.history['accuracy']

# x 값을 지정하고 정확도를 파란색으로, 오차를 빨간색으로 표시
x_len = np.arange(len(y_acc))
plt.plot(x_len, y_vloss, "o", c="red", markersize='3')
plt.plot(x_len, y_acc, "x", c="blue", markersize='3')