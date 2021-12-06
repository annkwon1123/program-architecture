// 배열을 이용한 피보나치 수열
#include <stdio.h>
#define MAX 200
#define INPUT "N을 입력하세요: "
#define OUTPUT "%d번째 피보나치 수는 %d입니다.\n"

int main(void) {
    int fib[MAX];
    fib[0] = 1;
    fib[1] = 1;

    int n = 0;
    printf(INPUT);
    scanf("%d", &n);
    for(int i = 2; i < n; i++) {
        fib[n] = fib[n-1] + fib[n-2];
    }

    printf(OUTPUT, n, fib[n]);
}