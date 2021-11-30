#날짜 : 2021/09/27
#이름 : 남언우
#내용 : 데이터유형과 구조 - vector 실습하기 교재 p58


#Vector - R에서 가장 많이 사용하는 자료구조
var1 <- c(1,2,3,4,5)
var1
var1[4]

var2 <- 1:5
var2
var2[2]

#Vector 연산
x <- 1:4
y <- 5:8

x+y
x-y
x*y

#seq() 함수로 벡터생성
var3 <- seq(1, 10, by=2)
var3 

#벡터의 합과 평균
sum_var1 <- sum(var1)
sum_var2 <- sum(var2)
mean_var1 <- mean(var1)
mean_var2 <- mean(var2)

sum_var1
sum_var2
mean_var1
mean_var2


