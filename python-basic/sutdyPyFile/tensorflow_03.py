from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense
from sklearn.preprocessing import LabelEncoder

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import numpy as np
import tensorflow as tf

df = pd.read_csv("/Users/user/java-web-project0208/python-basic/dataset/iris.csv",
                 names = ["sepal_length", "sepal_width", "petal_length", "petal_width", "species"])

print(df.head(5))

print(df.tail(5))

sns.pairplot(df, hue='species');
plt.show()

