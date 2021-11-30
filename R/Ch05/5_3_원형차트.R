#날짜 : 2021/09/28
#이름 : 남언우
#내용 : 데이터 시각화 - 원형상자 p147

season <- c('winter','summer','spring','summer','summer',
            'autumn','autumn','summer','spring','spring')
season

result <- table(season)

pie(result, main = 'season')









