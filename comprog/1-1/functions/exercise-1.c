/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

// function prototypes
int getSum(int x, int y);

int main(void){
    // declare variables and take input
    int a, b;
    printf("Input two integers separated by a space: ");
    scanf("%d %d", &a, &b); 

    // program ran successfully
    printf("The total is %i\n", getSum(a, b));
    return 0;
}

// returns the sum of two integers
int getSum(int x, int y){
    return x + y;
}