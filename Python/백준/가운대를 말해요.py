import time

i=[]
N = int(input())
start = time.time()

for j in range(N):
    i.append(int(input()))
    i.sort()

    if j % 2 ==0:

        e = int(j/2)
        print(i[e])
    else:


        e = int(j/2)
        print(i[e])
print(time.time() - start)