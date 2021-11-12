#include <stdio.h>

void func(int (*fp)(int, int));

int sum(int a, int b);
int mul(int a, int b);
int max(int a, int b);

int main(void) {
    int sel;
    printf("01 sum\n");
    printf("02 mul\n");
    printf("03 max\n");
    printf("select op: ");
    scanf("%d", &sel);
    switch(sel) {
        case 1: func(sum); break;
        case 2: func(mul); break;
        case 3: func(max); break;
    }
    return 0;
}

void func(int (*fp)(int, int)){
    int a, b,res;
    printf("two integers: ");
    scanf("%d %d", &a, &b);
    res = fp(a, b);
    printf("result: %d\n", res);
}

int sum(int a, int b){
    return a+b;
}
int mul(int a, int b){
    return a-b;
}
int max(int a, int b){
    if(a > b) return a;
    else return b;
}