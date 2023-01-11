/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void){
    // declare variables and take input from user
    int start, end, step;
    printf("Start: ");    
    scanf("%d", &start);
    printf("End: ");    
    scanf("%d", &end);
    printf("Step: ");    
    scanf("%d", &step);

    // loop
    for (int i = start; i <= end; i += step){
        printf("%i\n", i);
    }

    // program ran successfully
    return 0;
}