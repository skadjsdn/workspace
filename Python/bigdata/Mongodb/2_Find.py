"""
날짜 : 2021/09/07
이름 : 남언우
내용 : 파이썬 MongoDB Find 실습하기
"""
from pymongo import MongoClient as mongo

# 1단계 - MongoDB 접속
conn = mongo('mongodb://skadjsdn:1234@192.168.56.101:27017')
# 2단계 - DB 선택
db = conn.get_database('skadjsdn')

# 3단계 - Collection 선택
collecton = db.get_collection('Member')
# 4단계 - 쿼리 실행
rs = collecton.find()
for row in rs:
    print('--------------------------')
    print('%s, %s ,%s ,%s ,%s, %s' %(row['uid'],row['name'],row['hp'],row['pos'],row['dep'],row['rdate']))

# 5단계 - MongoDB 종료




