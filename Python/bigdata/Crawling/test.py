from selenium import webdriver
from datetime import datetime

browser = webdriver.Chrome('./chromedriver.exe')
browser.get('https://www.weather.go.kr/w/obs-climate/land/city-obs.do')


# 파일생성
file = open('./weather/{:%Y-%m-%d}'.format(datetime.now()), 'w', encoding='utf-8')

input = browser.find_elements_by_css_selector('#weather_table > tbody > tr > td')
i = 0
for td in input:

    file.write(td.text)
    i += 1
    if (i==13):
        i=0
        file.write(('\n'))
file.close()
print('완료')

