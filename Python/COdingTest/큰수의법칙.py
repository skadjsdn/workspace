n, m, k = map(int, input().split())
data = list(map(int, input().split()))


data.sort(reverse=True)

first = data[0]
second = data[1]

result = 0
for i in range(m):
    if i % (k+1) == k:
        result += second
    else:
        result += first


print(result)


