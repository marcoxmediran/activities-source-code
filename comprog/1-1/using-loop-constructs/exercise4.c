/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void){
    // declare variables
    float sum = 0, toAdd;

    // will take input from user until '0' is entered
    do{
        printf("Enter a number: ");
        scanf("%f", &toAdd);
        sum += toAdd;
    }
    while (toAdd != 0);

    // program ran successfully
    printf("Sum: %.2f\n", sum);
    return 0;
}