a = input().split()
N = a[0]
K = a[1]
W = []
V = []
print(N)
x = 1
for i in range(int(N)):
    b = input().split()
    W = int(b[0])
    V = int(b[1])

    x *= 2
x= x-1
for i in range(x):

