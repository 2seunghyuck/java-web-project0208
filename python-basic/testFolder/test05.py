from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense
from tensorflow.keras.callbacks import ModelCheckpoint, EarlyStopping

import pandas as pd
import numpy as np
import tensorflow as tf
import os

df_pre = pd.read_csv("/Users/user/java-web-project0208/python-basic/dataset/wine.csv", header=None)
df = df_pre.sample(frac=1)

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
# checkpointer = ModelCheckpoint(filepath=modelpath, monitor='val_loss', verbose=1)
# 앞서 저장한 것 보다 나은 값들만을 저장하기위해, save bestonly 를 지정해준다
checkpointer = ModelCheckpoint(filepath=modelpath, monitor='val_loss', verbose=1, save_best_only=True)

model.fit(X, Y, validation_split=0.2, epochs=200, batch_size=200, verbose=0, callbacks=[checkpointer])