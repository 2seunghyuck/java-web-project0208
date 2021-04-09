from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense
from tensorflow.keras.callbacks import  EarlyStopping

import pandas as pd
import numpy as np
import tensorflow as tf

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

early_stopping_callback = EarlyStopping(monitor='val_loss', patience=100)

model.fit(X, Y, validation_split=0.2, epochs=2000, batch_size=500, callbacks=[early_stopping_callback])