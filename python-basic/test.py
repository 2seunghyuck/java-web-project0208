from collections import Counter

print(-1 % 5)


cities = ['서울', '부산', '인천', '대구', '대전', '광주', '울산', '수원']
print(cities[-7:3])


a = [1, 10, 5, 7, 6]
a.sort(reverse=True)
print(a)

a = 10
b = a * 10 if a % 2 == 0 else a + 10
print(b)

print("{1} {0} {2}".format('abc', 'def', 'ghi'))

c = Counter('scientist')
print(c)
print(c['n'])
