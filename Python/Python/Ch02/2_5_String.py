"""
날짜 : 2021/08/09
이름 : 남언우
내용 : 파이썬 문자열 실습하기 교재 p48
"""
#문자열 더하기
str1 = 'Hello'
str2 = 'Korea'
str3 = str1 + str2
print('str3:', str3)
#문자열 곱하기
message = 'Hello!'
result = message * 3
print('result :', result)

#문자열 길이
sample = 'Hello World'
print('sample 길이 :', len(sample))

#문자열 인덱스
print('sample 1번째 문자:', sample[0])
print(' sample 7번째 문자:', sample[6])
print(' sample -1번째 문자:', sample[-1])

#문자열 자르기
print('sample 0~5까지 문자열 :', sample[0:5])

#문자열 분리
people = '김슈신^김춘추^장보고^강감찬'
p1, p2, p3, p4 = people.split('^')
print('p1 :', p1)
print('p2 :', p2)
print('p3 :', p3)
print('p4 :', p4)

#문자열 분리
print('안녕! \n 파이썬')




