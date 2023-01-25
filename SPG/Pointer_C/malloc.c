#include <stdio.h>
#include <stdlib.h>

int* get_number() {
    int* p = (int*)malloc(sizeof(int)); // 포인터 변수p를 동적할당을 통해 초기화함
    if(p == NULL){
        printf("Nomore memory available. \n");
        exit(1);
    }
    *p = 20;
    return p;
}

int main(void) {
    int i, *ptr;
    ptr = get_number();
    printf("%d.\n", *ptr);
    free(ptr); //malloc의 반대는 free()
    ptr = NULL;
    return 0;
}