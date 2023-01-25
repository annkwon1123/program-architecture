/* 주차 요금 계산: 주차 시간을 분으로 입력받아 주차 요금을 계산하고 출력하는 프로그램을 작성하시오. 
    최초 30분 까지 2,000원
    최초 30분 초과 시 10분당 1,000원
    하루 최대 금액은 25,000원 */

#include <stdio.h>
#define INPUT "주차 시간(분): "
#define OUTPUT1 "주차 요금: %d원\n"
#define OUTPUT2 "주차 시간은 최대 24시간(14440분)을 넘을 수 없습니다.\n"

int main(void) {
    int min = 0;
    int price = 0;

    printf(INPUT);
    scanf("%d", &min);

    while(min != 0) {
        if(min >= 0 && min <= 30) {
            price = 2000;
            printf(OUTPUT1, price);
        }
        else if (min > 30 && min <= 10 * 23) {
            price = 2000 + 1000 * (int)((min - 30)/10.0 +1);
            printf(OUTPUT1, price);
        }
        else if (min > 10 * 23 && min < 24 * 60){
            price = 25000;
            printf(OUTPUT1, price);
        }
        else {
            printf(OUTPUT2);
        }
        printf(INPUT);
        scanf("%d", &min);
    }
	return 0;
}