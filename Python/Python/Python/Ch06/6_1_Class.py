import Ch06.sub1.Account
from Ch06.sub1.Car import  Car
from Ch06.sub1.Account import Account

# 객체 생성
bmw = Car('520d', ' 흰생', 5000)
bmw.speedUp()
bmw.speedDwon()
bmw.show()

benz = Car('벤츠', '검정', 50000)
benz.speedUp()
benz.show()

kb = Account('국민은행', '101-12-1111', '김유신', 10000)
kb.deposit(100000)
kb.withdraw(5000)
kb.show()
