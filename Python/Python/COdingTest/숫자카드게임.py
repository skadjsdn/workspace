n, m = map(int, input().split())
mins = []
result = 0

for i in range(n):
    data = list(map(int,input().split()))
    data.sort()
    min = data[0]
    mins.append(min)
result = max(mins)

print(result)