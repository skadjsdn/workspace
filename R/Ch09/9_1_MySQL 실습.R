#날짜 : 2021/09/30
#이름 : 남언우
#내용 : 정형과 비정형 데이터 처리 - MySQL 데이터 차리 교재 p292

install.packages('RMySQL')
library(RMySQL)
library(dplyr)
library(ggplot2)

#데이터 베이스 접속
conn <- dbConnect(MySQL(), 
                  host='3.35.171.144', 
                  user='root', 
                  password='rjqnrdl12#', 
                  dbname='skadjsdn1')
#쿼리 실행
df_user <- dbGetQuery(conn, statement = 'SELECT * FROM `USER1`')
Encoding(df_user$name) <- 'UTF-8'
df_user

#매출 데이터 불러오기
df_sale <- dbGetQuery(conn, statement = 'SELECT * FROM `orders`')
View(df_sale)

#직원별 매출 현황
df_resilt <- df_sale %>% group_by(custid) %>% summarise(saleprice - sum(bookid)) %>% arrange(desc(total))
df_r

