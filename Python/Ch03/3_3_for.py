"""
날짜 : 2021/08/10
이름 : 남언우
내용 : 파이썬 for문 실습하기 교재 p70
"""

#for
for i in range(5):
    print('{}회 반복 '.format(i))

for i in range(10,15):
    print('%d회 반복' % i)

for i in range(5, 0 , -1):
    print(i, '회 반복')
total = 0
for k in range(11):
    total += k
print('1부터 10까지 합 :', total)

eSum = 0
for k in range(11):
    if k % 2 ==0:
        eSum+=k
print('1부터 10까지 짝수 합:',eSum)

for a in range(3):
    print('a :', a)

    for b in range(5):
        print('b :', b)

for x in range(2,10):
    print('%d단' %x)
    for y in range(1, 10):
        z = x * y
        print('%d x %d = %d '% (x,y,z))

for a in range(11):

    for b in range(10-a):
        print('★', end ='')
    print()

