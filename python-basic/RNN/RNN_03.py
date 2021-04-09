from tensorflow.keras.datasets import mnist
from tensorflow.keras.models import Sequential, Model
from tensorflow.keras.layers import Input, Dense, Conv2D, MaxPooling2D, UpSampling2D, Flatten, Reshape
import matplotlib.pyplot as plt
import numpy as np


(X_train, _), (X_test, _) = mnist.load_data()
X_train = X_train.reshape(X_train.shape[0], 28, 28, 1).astype('float32') / 255
X_test = X_test.reshape(X_test.shape[0], 28, 28, 1).astype('float32') / 255

# 생성자 모델 만들기
autoencoder = Sequential()

# 인코딩 부분
autoencoder.add(Conv2D(16, kernel_size=3, padding='same', input_shape=(28, 28, 1), activation='relu'))
autoencoder.add(MaxPooling2D(pool_size=2, padding='same'))
autoencoder.add(Conv2D(8, kernel_size=3, activation='relu', padding='same'))
autoencoder.add(MaxPooling2D(pool_size=2, padding='same'))
autoencoder.add(Conv2D(8, kernel_size=3, strides=2, padding='same', activation='relu'))

# 디코딩 부분
autoencoder.add(Conv2D(8, kernel_size=3, padding='same', activation='relu'))
autoencoder.add(UpSampling2D())
autoencoder.add(Conv2D(8, kernel_size=3, padding='same', activation='relu'))
autoencoder.add(UpSampling2D())
autoencoder.add(Conv2D(16, kernel_size=3, activation='relu'))
autoencoder.add(UpSampling2D())
autoencoder.add(Conv2D(1, kernel_size=3, padding='same', activation='sigmoid'))

autoencoder.compile(optimizer='adam', loss='binary_crossentropy')
autoencoder.fit(X_train, X_train, epochs=50, batch_size=128, validation_data=(X_test, X_test))

random_test = np.random.randint(X_test.shape[0], sfor i, image_idx in enumerate(random_test): # 랜덤하게 뽑은 이미지를 차례로 나열
    ax = plt.subplots(2, 7, i+1)
    plt.imshow((X_test[image_idx].reshape(28,28))) # 테스트할 이미지를 먼저 그대로 보여줌
    ax.axis('off')
    ax = plt.subplots(2, 7, 7+i+1)
    plt.imshow(ae_imgs[image_idx].reshape(28, 28)) # 오토 인코딩 결과를 다음열 에 출력
    ax.axis('off')
plt.show()ize=5) # 테스트할 이미지를 랜덤하게 불러오기
ae_imgs = autoencoder.predict(X_test) # 앞서 만든 오토인코더 모델에 주입

plt.figure(figsize=(7, 2)) # 출력될 이미지의 크기를 정함