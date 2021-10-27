/* 반올림 함수: 정수와 자릿수를 입력받아 반올림한 결과를 출력하는 round_pos()를 작성하시오. */

#include <stdio.h>
#include <math.h>

int round_pos(int num, int pos);

int main(void) {
	int num, pos;
	scanf("%d%d", &num, &pos);
	printf("%d를 %d번째 자리에서 반올림한 결과: %d\n", num, pos, round_pos(num, pos));
  return 0;
}

int round_pos(int num, int pos) {
  int result = num;
  for (int i = 1; i < pos; i++){
    if(result % (int)pow(10, i) >= 5) {
      result = result + pow(10, i);
    }
  }
  return result;
}