#날짜 : 2021/09/29
#이름 : 남언우
#내용 : reshape2 패키지 실습하기 교재 p184

install.packages('reshape2')
library(reshape2)

df_student <- read.csv('../file/student4.txt')

melt_result1 <- melt(df_student, id.vars = '번호')
View(melt_result1)

# dcast - 행을 열으로, 세로로 긴 형태의 데이터를 가로로 길게 전환하는 함수
dcast_result <- dcast(melt_result1, 번호 ~ variable)
dcast_result


