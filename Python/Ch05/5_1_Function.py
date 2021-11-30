"""
날짜 : 2021/08/11
이름 : 남언우
내용 : 파이썬 함수 활용 p114
"""

# 함수
def f(x):
    y = 2 * x + 3
    return y

# 함수 호출
y1 = f(1)
y2 = f(2)
y3 = f(3)

print('y1 :', y1)
print('y2 :', y2)
print('y3 :', y3)

def type2(item):
    tot = 0


type2([1 ,2 ,3 ,4 ,5])
type2([1, 3, 5, 7, 9])

def type3():
    total = 0
    for k in range(11):
        total +=k
    return total
r3 = type3()
print('r3 :', r3)

def type4():
    print('type4() :', type3())

type4()

def rnrn():
    for i in range(2,10):
        print('%d 단'  %i)
        for j in range(1,10):
            print(' %d x %d = %d ' %(i,j,i*j))

rnrn()
