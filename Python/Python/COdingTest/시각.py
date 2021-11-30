h = int(input())

count = 0
x,y,z =0,0,0
for i in range(h+1):
    if i%10==3:
        x +=1


    for j in range(60):
        if j%10 ==3 or int(j/10) == 3:
            y +=1

        for k in range(60):
            if int(k/10) == 3 or k%10 == 3:
                z+=1
            if z>0 or y>0 or x > 0:
                print(i,j,k)
                count+=1
                z=0
        y = 0
    x = 0
print(count)

