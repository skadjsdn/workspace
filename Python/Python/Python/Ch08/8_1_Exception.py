"""
날짜 : 2021/08/12
이름 : 남언우
내용 : 파이썬 예외처리 실습하기 교재 p212
"""

num1 , num2 = 1, 2

r1 = num1 + num2
r2 = num1 - num2
r3 = num1 * num2
r4 = 0
try:
    r4 = num1 / num2
except:
    print('예외 발생')
print('r1 :', r1)
print('r2 :', r2)
print('r3 :', r3)
print('r4 :', r4)

# try ~ except ~ finally
try:
    pass
except:
    pass
finally:
    pass
