/* 좌표 판독: 점의 좌표(x, y)를 입력받아 스크린 상의 선택 영역 내의 점인지 검사하는 함수를 작성하시오. */

#include <stdio.h>
#define OUTPUT1 "in\n"
#define OUTPUT2 "out\n"

void recog(int, int, int, int , int, int);

int main(void) {
    int top_left_x, top_left_y, bottom_right_x, bottom_right_y, x, y;
    scanf("%d%d", &top_left_x, &top_left_y);
    scanf("%d%d", &bottom_right_x, &bottom_right_y);
    scanf("%d%d", &x, &y);

    recog(top_left_x, top_left_y, bottom_right_x, bottom_right_y, x, y);
    return 0;
}

void recog(int top_left_x, int top_left_y, int bottom_right_x, int bottom_right_y, int x, int y) {
    if ((x >= top_left_x && y >= top_left_y) && (x <= bottom_right_x && y <= bottom_right_y)) {
        printf(OUTPUT1);
    }
    else printf(OUTPUT2);
    return;
}