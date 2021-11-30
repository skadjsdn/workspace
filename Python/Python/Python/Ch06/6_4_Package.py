"""
날짜 : 2021/08/12
이름 : 남언우
내용 : 파이썬 패키지 모듈 실습하기 교재 p175
"""
import Ch06.sub2.calc as c
from Ch06.sub2.calc import *

print('프로그램 시작1')

if __name__ == '__main__':
    print('프로그램 시작')

r1 = plus(1, 2)
r2 = minus(2, 3)
r3 = c.minus(3, 4)
r4 = c.div(4, 2)

print('r1 r2 r3 r4', r1,r2,r3,r4)


