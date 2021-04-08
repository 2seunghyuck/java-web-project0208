from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense
from sklearn.model_selection import train_test_split

import pandas as pd
import numpy as np
import tensorflow as tf

df = pd.read_csv("/Users/user/java-web-project0208/python-basic/dataset/housing.csv",
                 delim_whitespace=True, header=None)

dataset = df.values
X = dataset[:, 0:13].astype(float)
Y = dataset[:, 13]

X_train, X_test, Y_train, Y_test = train_test_split(X, Y, test_size=0.3)

model = Sequential()
model.add(Dense(30, input_dim=13, activation='relu'))
model.add(Dense(6, activation='relu'))
model.add(Dense(1))
model.compile(loss='mean_squared_error', optimizer='adam')
model.fit(X_train, Y_train, epochs=200, batch_size=10)

Y_predicition = model.predict(X_test).flatten()
for i in range(10):
    label = Y_test[i]
    prediction = Y_predicition[i]
    print("실제 가격: {:.3f}, 예상가격:{:.3f}".format(label, prediction))