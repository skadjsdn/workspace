"""
날짜 : 2021/08/31
이름 : 남언우
내용 : 파이썬 가상 브라우저 뉴스 크롤링 실습
"""
import datetime
import time
from selenium import webdriver
from pymongo import MongoClient as mongo
import logging


# 로거생성
logger = logging.getLogger('naver_news_logger')
logger.setLevel(logging.INFO)

# 로그 포맷 설정
formatter = logging.Formatter("%(asctime)s - %(name)s - %(levelname)s - %(message)s")

# 로그 핸들러
fileHandler = logging.FileHandler('./naver_log.log')
fileHandler.setLevel(logging.INFO)
fileHandler.setFormatter(formatter)
logger.addHandler(fileHandler)

# 가상 브라우저 실행
chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument('--headless')
chrome_options.add_argument('--no-sandbox')
chrome_options.add_argument('--disable-dev-shm-usage')
browser = webdriver.Chrome('./chromedriver.exe', options=chrome_options)

# 네이버 뉴스 이동
browser.get('https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid1=105&sid2=230')

i, page = 0, 1
j = 0

# 1단계 - MongoDB 접속
conn = mongo('mongodb://skadjsdn:1234@192.168.56.101:27017')
# 2단계 - DB 선택
db = conn.get_database('skadjsdn')

collecton = db.get_collection('NaverNews')



while True:

    # 수집하는 페이지 날짜 출력
    viewday = ''
    span_viewday = browser.find_element_by_css_selector('#main_content > div.pagenavi_day > span.viewday')
    viewday = span_viewday.text
    logger.info('%s 수집시작' % viewday)

    while True:
        try:
            # 뉴스 목록 가져오기
            tags_a = browser.find_elements_by_css_selector('#main_content > div.list_body.newsflash_body > ul > li > dl > dt:not(.photo) > a')

            for index, tag in enumerate(tags_a):
                collecton.insert_one({'index':index,
                                      'title':tag.text,
                                      'href':tag.get_attribute('href'),
                                      'rdate':datetime.datetime.now()})
            # 다음 페이지 클릭
            pages_a = browser.find_elements_by_css_selector('#main_content > div.paging > a')
            pages_a[i].click()
            logger.info('%d 페이지 완료...' % page)

            i += 1
            page += 1

            if page % 10 == 1:
                i = 1

        except:
            logger.info('%s 데이터 수집 끝...' % viewday)
            page = 1
            i = 0

            # 전일로 이동
            pages_day = browser.find_elements_by_css_selector('#main_content > div.pagenavi_day > a')
            pages_day[j].click()

            if j < 2:
                j += 1

            break
conn.close()

# 브라우저 종료
browser.quit()