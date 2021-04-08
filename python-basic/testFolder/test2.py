from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense

import numpy as np
import tensorflow as tf

data_set = np.loadtxt("/Users/user/java-web-project0208/python-basic/dataset/ThoraricSurgery.csv", delimiter=",")
X = data_set[:, 0:8]
Y = data_set[:, 8]

print(X)

model = Sequential()
model.add(Dense(12, input_dim=8, activation='relu'))
model.add(Dense(8, activation='relu'))
model.add(Dense(1, activation='sigmoid'))

model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])
model.fit(X, Y, epochs=200, batch_size=10)

