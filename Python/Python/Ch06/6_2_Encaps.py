"""
날짜 : 2021/08/12
이름 : 남언우
내용 : 파이썬 캡슐화 실습하기 교재 p161
"""

from Ch06.sub1.Account import Account
num1 = 1
var1 = True

kb = Account('국민은행', '101-111-1123','김유신',10000)

kb.deposit(4000)
kb.withdraw(3000)
kb.balance -=1
kb.show()

