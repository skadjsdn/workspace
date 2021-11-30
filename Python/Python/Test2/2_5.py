class King:
    def __init__(self ,name='태조' ,year='1392'):
        self.name = name
        self.year = year

    def show(self):
        print('name :', self.name)
        print('year :', self.year)

if __name__ == '__main__':

    king1 = King()
    King2 = King('태종')
    King3 = King('세종대왕', '1418')

    king1.show()
    King2.show()
    King3.show()


