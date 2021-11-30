#날짜 : 2021/09/29
#이름 : 남언우
#내용 : dplyr 패키지 실습하기 교재 p169

install.packages('dplyr')
library(dplyr)

df_exam <- read.csv('../file/exam.csv')
df_exam

#select


df_math <- df_exam %>% select(math)
df_math




#filter

df_class1 <- df_exam %>% select(everything()) %>% filter(class == 1)
df_class1

df_class2 <- df_exam %>% select(everything()) %>% filter(english >=60 , english <80)
df_class2

df_exam %>% filter(science >= 60 | science<=80)
df_exam
#arrange





#mutate
#summarise
#group_by
#inner_join














