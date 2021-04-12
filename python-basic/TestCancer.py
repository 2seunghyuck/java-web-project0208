from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense
from sklearn.model_selection import train_test_split

import pandas as pd
import numpy as np
import tensorflow as tf

df = pd.read_csv(
    "/Users/user/java-web-project0208/python-basic/dataset/breast-cancer-wisconsin.csv")

tmp = df[df['Bare Nuclei'] == '?'].index
df.drop(tmp)

dataset = df.values
X = dataset[:, 0:32]
Y = dataset[:, 32]

model = Sequential()
model.add(Dense(16, input_dim=32, activation='relu'))
model.add(Dense(32, activation='relu'))
model.add(Dense(1, activation='sigmoid'))

model.compile(loss='binary_crossentropy',
              optimizer='adam', metrics=['accuracy'])

model.fit(X, Y, epochs=200, batch_size=8)