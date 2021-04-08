from tensorflow.keras.datasets import mnist
from tensorflow.keras import utils

import numpy as np
import sys
import tensorflow as tf
import matplotlib.pyplot as plt

(X_train, Y_class_train), (X_test, Y_class_test) = mnist.load_data()

print("학습셋 이미지 갯수, : %d개 " % (X_train.shape[0]))
print("테스트셋 이미지 갯수, : %d개 " % (X_test.shape[0]))

plt.imshow(X_train[0], cmap='Greys')
plt.show()

for x in X_train[0]:
    for i in x:
        sys.stdout.write('%d\t' % i)
    sys.stdout.write('\n')

X_train = X_train.reshape(X_train.shape[0], 784)
X_train = X_train.astype('float64')
X_train = X_train / 255

X_test = X_test.reshape(X_test.shape[0], 784).astype('float64') / 255

print("class : %d" % (Y_class_train[0]))

Y_train = utils.to_categorical(Y_class_train, 10)
Y_test = utils.to_categorical(Y_class_test, 10)

print(Y_train[0])