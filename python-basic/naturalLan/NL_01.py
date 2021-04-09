from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense, Flatten,Embedding
from tensorflow.keras.preprocessing.text import Tokenizer
from tensorflow.keras.preprocessing.sequence import pad_sequences
from tensorflow.keras.preprocessing.text import text_to_word_sequence
from numpy import array
from tensorflow.keras.utils import to_categorical

#전 처리할 텍스트 정하기
text = '해보지 않으면 해낼 수 없다'

#해당 텍스트 토큰화
result = text_to_word_sequence(text)
print("\n원문: \n", text)
print("\n토큰 화: \n", result)

# 전처리 하려는 세개의 문장 정하기
docs = ['먼저 텍스트의 각 단어를 나누어 토큰화 합니다.',
       '텍스트의 단어로 토큰화 해야 딥러닝에서 인식됩니다.',
       '토큰화 한 결과는 딥러닝에서 사용 할 수 있습니다.',
       ]

#토큰화 함수를 이용해 전처리 하는과정
token = Tokenizer() # 토큰화 함수 지정
token.fit_on_texts(docs) # 토큰화 함수에 문장 적용하기

#각 옵션에 맞춰 단어의 빈도ㄹ수를 계산한 결과 출력
print("\n단어 카운트 : ", token.word_counts)

#출력 순서는 랜덤
print("\n문장 카운트 : ", token.document_count)
print("\n각 단어가 몇개의 문장에 포함되어 있는가 : ", token.word_docs)
print("\n각 단어에 매겨진 인덱스 값 : ", token.word_index)

text = "오랫동안 꿈꾸는 이는 그 꿈을 닮아간다"

token = Tokenizer()
token.fit_on_texts([text])
print(token.word_index)

x = token.texts_to_sequences([text])
print(x)

#원 핫 인코딩
word_size = len(token.word_index) +1
x = to_categorical(x, num_classes=word_size)

# 텍스트 리뷰 자료를 지정합니다.
docs = ["너무 재밌네요","최고예요","참 잘 만든 영화예요","추천하고 싶은 영화입니다","한번 더 보고싶네요",
        "글쎄요","별로예요","생각보다 지루하네요","연기가 어색해요","재미없어요"]

# 긍정리뷰는 1, 부정리뷰는 0으로 클래스를 지정합니다.
classes = array([1,1,1,1,1,0,0,0,0,0])

token = Tokenizer()
token.fit_on_texts(docs)
print(token.word_index)
x = token.texts_to_sequences(docs)
print("\n리뷰 텍스트, 토큰화 결과\n", x)

# 학습을 하기위해선 데이터의 길이를 맞춰줘야한다.
padded_x = pad_sequences(x, 4)
print("\n 패딩 결과:\n ", padded_x)

# 임베딩에 입력될 단어의 수를 지정합니다.
word_size = len(token.word_index) +1
model = Sequential()
model.add(Embedding(word_size, 8 , input_length=4))
model.add(Flatten())
model.add(Dense(1, activation='sigmoid'))
model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])
model.fit(padded_x, classes, epochs=20)

print("\n Accuracy :%.4f" % (model.evaluate(padded_x, classes)[1]))