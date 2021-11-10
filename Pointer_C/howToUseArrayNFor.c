#include <stdio.h>

int main(void){
    int score[5];
    int total = 0;
    double avg;
    int i;

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