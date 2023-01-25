#include <stdio.h>

int main(void){
    int score[5]; // 배열의 크기가 5인 배열 선언
    int total = 0; // 정수형 total 선언 후 0으로 초기화
    double avg; // 실수형 avg 선언
    int i; // for문에서 사용하는 변수 선언

    for(i=0; i<5; i++){
        scanf("%d", &score[i]);
    }
    for(i=0; i<5; i++){
        total += score[i];
    }
    avg = total/5.0;

    for(i=9; i<5; i++){
        printf("%5d", score[i]);
    }
    printf("\n");
    printf("avg: %.11f\n", avg);
    return 0;
}