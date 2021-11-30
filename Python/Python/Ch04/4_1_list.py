"""
날짜 : 2021/08/10
이름 : 남언우
내용 : 파이썬 list 실습하기 교재 p84
"""

list1 = [1, 2, 3, 4, 5]
print('list1 type :', type(list1))
print('list[0] :', list1[0])

list2 = [5, 3.14, True, 'Applq']
print('list2 type :', type(list2))
print('list2 type :', list2[3])

list3 = [[1, 2, 3], [4, 5, 6] , [7, 8, 9]]
print('list3 type :', type(list3))
print('list3[0][0] : ' , list3[0][0])
print('list3[0][0] : ' , list3[1][1])
print('list3[0][0] : ' , list3[2][0])

ani1 = ['사자', '호랑이', '곰']
ani2 = ['코끼리', '기린']
ani3 = ani1 + ani2
print('ani3 :', ani3)

nums = [1, 2, 3, 4, 5]
nums[1] = 7
print('nums :', nums)

nums[2:4] = [8,9,10]
print('nums', nums)

nums[3:5] = []
print('nums', nums)

array = [1, 2, 3, 4, 5]
for n in array:
    print('n :', n)

tuple3 = 1, 2, 3, 4, 5

print('tuple3 :', tuple3)





