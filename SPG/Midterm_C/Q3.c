/* 비트 찾기: 주어진 값의 비트열에 포함된 1의 개수를 출력하는 함수를 작성하시오. */

#include <stdio.h>

int find1(int);

int main(void) {
    int num;
    scanf("%d", &num);
    printf("1의 개수: %d\n", find1(num));
    return 0;
}

int find1(int n) {
    int count = 0;
    while(n != 0) {
        if(n % 2 == 1) count++;
        n = n / 2;
    }
    return count;
}