from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense
from sklearn.preprocessing import LabelEncoder
from tensorflow.python.keras.callbacks import TensorBoard
from time import time

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import numpy as np
import tensorflow as tf
import os


df = pd.read_csv("/Users/user/java-web-project0208/python-basic/dataset/iris.csv",
                 names = ["sepal_length", "sepal_width", "petal_length", "petal_width", "species"])


sns.pairplot(df, hue='species');

MODEL_DIR = '/Users/user/java-web-project0208/python-basic/logs'
if not os.path.exists(MODEL_DIR):
    os.mkdir(MODEL_DIR)

tensorboard = TensorBoard(log_dir="logs\{}".format(time()))

# 데이터 분류
dataset = df.values
X = dataset[:, 0:4].astype(float)
Y_obj = dataset[:, 4]
# 문자열을 숫자로 변환
e = LabelEncoder()
e.fit(Y_obj)
Y = e.transform(Y_obj)

Y_encoded = tf.keras.utils.to_categorical(Y)
# 모델의 설정
model = Sequential()
model.add(Dense(16, input_dim=4, activation='relu'))
model.add(Dense(3, activation='softmax'))

model.compile(loss='categorical_crossentropy', optimizer='adam', metrics=['accuracy'])

model.fit(X, Y_encoded,epochs=50, batch_size=1, callbacks=[tensorboard])