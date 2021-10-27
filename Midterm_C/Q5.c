/* 년월일 판정: 연, 월, 일을 인자로 전달받아 유효한 날짜인지 검사하는 check_date() 함수를 작성하시오. */

#include <stdio.h>

int is_leap_year(int year);
int get_days_of_month(int year, int month);
int check_date(int year, int month, int day);

int main(void) {
	int year, month, day;
	do{
		scanf("%d%d%d", &year, &month, &day);
		if(!check_date(year, month, day)){
			printf("잘못된 날짜입니다.\n");
		} else {
			printf("%d년 %d월 %d일\n", year, month, day);
			return 0;
		}
	}while(1);
	return 0;
}

int is_leap_year(int year) {
  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return 1;
  else return 0;
}

int get_days_of_month(int year, int month) {
  if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
  return 31;
  else if (month == 4 || month == 6 || month == 9 || month == 11 ) return 30;
  else if (month == 2){
    if (is_leap_year(year) == 1) return 29;
    else return 28;
  }
  else return 0;
}

int check_date(int year, int month, int day) {
  if (day >= 1 && day <= get_days_of_month(year, month))   return 1;
  else return 0;
}
