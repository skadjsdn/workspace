"""
날짜 : 2021/08/12
이름 : 남언우
내용 : 파이썬  파일 입출력 실습하기 교재 p217
"""

# 파일 읽기
file1 = open('Text1.txt', 'r')
line = file1.readline()

print(line)
file1.close()

file2 = open('./Text1.txt', 'r')

while True:
    line = file2.read()
    if not line:
        break

    print( line)
file2.close()

# 파일 쓰기
file3 = open('./Test2.txt', 'w')
file3.write('안녕하세요\n')
file3.write('asdsadq\n')
file3.write('ㄴㅁㅇㅂㅈㄷ\n')
file3.close()


