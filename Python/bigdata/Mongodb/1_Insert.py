"""
날짜 : 2021/09/07
이름 : 남언우
내용 : 파이썬 MongoDB Insert 실습하기
"""

from pymongo import MongoClient as mongo
from datetime import datetime

# 1 단계 -mongodb 접속
conn = mongo('mongodb://skadjsdn:1234@192.168.56.101:27017')

# 2 단계 - DB 선택
db = conn.get_database('skadjsdn')

# 3 단계 - Collection 선택
collecton = db.get_collection('Member')

# 4 단계 - 쿼리 실행
collecton.insert_one({'uid': 'a101',
                      'name':'김유신',
                      'hp':'010-1234-1111',
                      'pos':'사원',
                      'dep':101,
                      'rdate':datetime.now()})

# 5 단계 - 섭속 종료
conn.close()
print('Insert 완료 ')





