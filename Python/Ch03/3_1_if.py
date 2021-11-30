"""
날짜 : 2021/08/10
이름 : 남언우
내용 : 파이썬 if문 실습하기 교재 p60
"""

#if
num1, num2 = 1,2
if num1 > 0:
    print('num1은 0보다 크다')

if num1 > num2:
    print('num1은 num2보다 크다')

if num1> 0:
    if num2 > 1:
        print('num1은 0보다 크고, num2는 1ㅂ다 크다')
# if ~ else
num3, num4 = 3, 4
if num3 > num4:
    print('nu,3은 num4보다 크다')
else:
    print('num3은 num4보다 작다')
#if ~ elif ~ else
if num1 > num2:
    print('num1은 n um2보다 크다')
elif num2 > num3:
    print('num2은 n um3보다 크다')
elif num3 > num4:
    print('num3은 n um4보다 크다')
else:
    print('4가 가장크다')
#연습문제
score = int(input('점수입력 : '))
print('입력 점수 : ',score)
if score > 90:
    print('A입니다')
elif score> 80 and score<=90:
    print('B 입니다')
elif score > 70 and score <=80:
    print('C 입니다')
elif score > 60 and score <=70:
    print('D 입니다')
else:
    print('F 입니다')
#while
num = 1
while num < 5:
    print('%d회만큼 반복' %num)
    num += 1
tot,k = 0, 1
while k<=10:
    tot +=k
    k +=1
print ('1부터 10까지 합: ',tot)
total , j = 0, 2
while j<=10:
    total += j
    j += 2

print('1부터 10까지 짝수합 : ', total)

i = 1
while True:
    if i % 5 == 0 and i % 7 == 0:
        break

    i += 1
#continue
sum , n = 0 ,1

while n <= 10:
    n += 1
    if n % 2 ==1:
        continue
    sum += n

    

