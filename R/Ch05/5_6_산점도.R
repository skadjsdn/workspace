#날짜 : 2021/09/28
#이름 : 남언우
#내용 : 데이터 시각화 - 산점도 p163

mtcars

View(mtcars)
wt <- mtcars$wt
mpg <- mtcars$mpg

plot(wt, mpg)
plot(wt, mpg, col = 'red', pch =7)

iris

iris[,3:4]

df_iris <- iris[,3:4]
df_iris

group <- as.numeric(iris$Species)
group
plot(df_iris)



