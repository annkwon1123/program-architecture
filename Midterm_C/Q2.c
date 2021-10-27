/* 면적 계산: 면적을 입력받아 평은 제곱미터로, 제곱미터는 평으로 변환하는 프로그램을 작성하시오. */

#include <stdio.h>
#define INPUT "넓이: "
#define OUTPUT1 "%.2f 제곱미터 == %.2f 평\n"
#define OUTPUT2 "%.2f 평 == %.2 제곱미터\n"
#define OUTPUT3 "잘못된 입력입니다.\n"
#define M2P 0.3025
#define P2M 3.305785

int main(void) {
    double initial_input = 0;
    double output = 0;
    char c;

    printf(INPUT);
    scanf("%lf %c", &initial_input, &c);
    if (c == 'm') {
        output = initial_input * M2P;
        printf(OUTPUT1, output);
    }
    else if (c == 'p') {
        output = initial_input * P2M;
        printf(OUTPUT2, output);
    }
    else printf(OUTPUT3);
    return 0;
}