
x, y = 1, 1
n = int(input())
plans = input().split()

for count in range(len(plans)):

    if(x>1):
        if(plans[count] == 'L'):
            x-=1
    if(x<n):
        if(plans[count]== 'R'):
            x+=1
    if(y>1):
        if(plans[count]== 'U'):
            y-=1
    if(y<n):
        if(plans[count]== 'D'):
            y+=1

    print(y, x)


