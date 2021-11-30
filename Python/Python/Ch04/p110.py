list = [10, 1, 5, 2]
print(list)
list2 = list + list
print(list2)
list3 = list2 + [list2[0]*2]
print(list3)
i = 0
for n in list3:

    if (i % 2) == 1:

        print(list3[i])
    i += 1

j = int(input('vector수 :'))
list4= []
print(j)
for n in range(j):
    list4.append(int(input()))


print('vector 크기:', len(list4))

