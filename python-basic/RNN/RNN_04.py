from keras_preprocessing.image import ImageDataGenerator
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense, Activation, Dropout, Flatten, Conv2D, MaxPooling2D
from tensorflow.keras.preprocessing.image import ImageDataGenerator
from tensorflow.keras import optimizers, initializers, regularizers, metrics

import tensorflow as tf
import numpy as np
import matplotlib.pyplot as plt

b_size = 5

train_datagen = ImageDataGenerator(rescale=1./255,
                                   horizontal_flip=True, # 수평대칭 이미지를 50% 확률로 만들어 추가
                                   width_shift_range=0.1, # 전체 크기의 10% 범위에서 좌우로 이동.
                                   height_shift_range=0.1, # 마찬가지로 위 , 아래로 이동
                                   # rotation_range=5,
                                   # shear_range=0.7,
                                   # zoom_range=[0.9, 2.2],
                                   # vertical_flip=True
                                   fill_mode='nearest')

train_generator = train_datagen.flow_from_directory('/Users/user/java-web-project0208/python-basic/dataset/MRI/train',
                                                    target_size=(150, 150),
                                                    batch_size=b_size,
                                                    class_mode='binary')

test_datagen = ImageDataGenerator(rescale=1./255)

test_generator = test_datagen.flow_from_directory('/Users/user/java-web-project0208/python-basic/dataset/MRI/test',
                                                  target_size=(150, 150),
                                                  batch_size=b_size,
                                                  class_mode='bianry')

model = Sequential()
model.add(Conv2D(32, (3, 3), input_shape=(150, 150, 3)))
model.add(Activation('relu'))
model.add(MaxPooling2D(pool_size=(2, 2)))

model.add(Conv2D(32, (3, 3)))
model.add(Activation('relu'))
model.add(MaxPooling2D(pool_size=(2, 2)))

model.add(Conv2D(64, (3, 3)))
model.add(Activation('relu'))
model.add(MaxPooling2D(pool_size=(2, 2)))

model.add(Flatten())
model.add(Dense(64))
model.add(Activation('relu'))
model.add(Dropout(0.5))
model.add(Dense(2))
model.add(Activation('softmax'))

model.compile(loss='sparse_categorical_crossentropy', optimizer=optimizers.Adam(learning_rate=0.0002),
              metrics=['accuracy'])

steps_train = len(train_generator)
steps_test = len(test_generator)

history = model.fit(
    train_generator,
    steps_per_epoch = steps_train,
    epochs=20,
    validation_data=test_generator,
    validation_steps=steps_test
)

acc = history.history['accuracy']
val_acc = history.history['val_accuracy']
y_vloss = history.history['val_loss']
y_loss = history.history['loss']

x_len = np.arange(len(y_loss))
plt.plot(x_len, acc, marker =".", c ="red", label="Trainset_acc")
plt.plot(x_len, val_acc, marker =".", c ="lightcoral", label="Testset_acc")
plt.plot(x_len, y_vloss, marker =".", c ="cornflowerblue", label="Testset_loss")
plt.plot(x_len, y_loss, marker =".", c ="blue", label="Trainset_loss")

plt.legend(loc='upper right')
plt.grid()
plt.xlabel('epoch')
plt.ylabel('loss/acc')
plt.show()