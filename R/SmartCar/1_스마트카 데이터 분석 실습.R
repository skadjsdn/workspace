#날짜 : 2021/11/04
#이름 : 남언우
#내용 : 스마트카 데이터분석 실습하기

install.packages("DBI")
install.packages("RJDBC")
install.packages("log4r")

# 패키지 로드
library("DBI")
library("rJava")
library("RJDBC")

#r-hive path 설정
hive.class.path = list.files(path=c("../lib"),pattern="jar",full.names = T);
hadoop.lib.path = list.files(path=c("../lib"),pattern="jar",full.names = T);
hadoop.class.path = list.files(path=c("../lib"),pattern="jar",full.names = T);
class.path=c(hive.class.path, hadoop.lib.path, hadoop.class.path);
.jinit(classpath = class.path)

# 하이브 JDBC 로드
drv <- JDBC("org.apache.hive.jdbc.HiveDriver",
            "../lib/hive-jdbc-2.1.1-cdh6.3.2.jar",
            identifier.quote = "`")
# 하이브 접속
conn <- dbConnect(drv,
                  "jdbc:hive2://192.168.56.101:10000/default",
                  "hive",
                  "1234")
# 테이블 목록 조회
dbListTables(conn)

# SmartCar_Master2Income 테이블 조회
data <- dbGetQuery(conn, "SELECT * FROM smartcar_master2icome")
View(data)

# 스마트카 배기량에 따른 운전자의 연소득 예측 회귀분석
model <- lm(smartcar_master2icome.income ~ data$smartcar_master2icome.car_capacity, data=data)
summary(model)

# 모델 테스트
test_data <- read.csv('../file/CarMaster2Income_Test.txt',
                       sep= '|',
                       header=T,
                       encoding= 'UTF-8')
predict(model, test_data, interval = 'prediction')


