#날짜 : 2021/09/28
#이름 : 남언우
#내용 : 제어문과 함수 - 반복문 교재 p115

x <- 50; y <- 4 ; z<- x*y
if(x*y >=40){
  cat("x*y의 결과는40이상 입니다.\n")
  cat("x*y=",z)
}else{cat("x*y의 결과는 40미만입니다. x*y=",z,"\n")}


score <- scan()

score
result <- "노력력"
if(score>=80){
  result <- "우수"
}
cat("당신의 학점은",result,score)

score <- scan()

if(score>=90){
  result="A"
}else if(score>=80){
  result="B"
}else if(score>=70){
  result="C"
}else{
  result="F"
}
cat("당신의 학점은",result)







