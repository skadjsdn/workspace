"""
날짜 : 2021/09/02
이름 : 남언우
내용 : 네이버 Open API를 활용한 크롤링
"""

import  datetime, json
import  urllib.request

client_id = 'TZ4BBjZzXkk0pqpiGf3c'
client_secret  = 'Ca37NzdJFg'

def getRequestURL(url):
    request = urllib.request.Request(url)
    request.add_header("X-Naver-Client-Id", client_id)
    request.add_header("X-Naver-Client-Secret", client_secret)

    try:
        response = urllib.request.urlopen(request)
        if response.getcode() == 200:
            print('[%s] Url Request Success' % datetime.datetime.now())
            return response.read().decode('utf-8')
    except Exception as e:
        print(e)
        print('[%s] Error for Url : %s' %(datetime.datetime.now(), url))
        return None

def getNaverSearch(node, srcText, start, display):
    base = "https://openapi.naver.com/v1/search"
    node = "/%s.json" % node
    parameters = "?query=%s&start=%s&display=%s" %((urllib).parse.quote(srcText), start, display)

    url = base + node + parameters
    responseDecode = getRequestURL(url)

    if responseDecode == None:
        return None
    else:
        return json.loads(responseDecode)

def getPostData(post, jsonResult, cnt):
    title = post['title']
    descroption = post['description']
    org_link = post['originallink']
    link = post['link']

    pDate = datetime.datetime.strptime(post['pubDate'], '%a, %d %b %Y %H:%M:%S +0900')
    pDate = pDate.strftime('%Y-%m-%d %H:%M:%S')
    jsonResult.append(({'cnt':cnt,
                        'title': title,
                        'description':descroption,
                        'org_link': org_link,
                        'link':link,
                        'pDate':pDate}))
    return

def main():
    node = 'news'
    srcText = input('검색어 입력 : ')
    cnt = 0
    jsonResult = []
    jsonResponse = getNaverSearch(node, srcText, 1, 100)
    total = jsonResponse['total']

    while jsonResponse != None and jsonResponse['display'] != 0:
        for post in jsonResponse['items']:
            cnt += 1
            getPostData(post, jsonResult, cnt)
        start = jsonResponse['start'] + jsonResponse['display']
        jsonResponse = getNaverSearch(node, srcText, start , 100)
    print('전체 검색 건수 : %d' % total)

    # 검색 결과 파일 생성
    with open('./%s_naver_%s.json'  % (srcText, node), mode='w', encoding='utf-8') as outfile:
        jsonFile = json.dumps(jsonResult, indent=4, sort_keys=True, ensure_ascii=False)
        outfile.write(jsonFile)

    print('가져온 데이터: %d건' % cnt)

    print('%s_naver_%s.json 파일 생성완료...' % (srcText, node))

if __name__=='__main__':
    main()







