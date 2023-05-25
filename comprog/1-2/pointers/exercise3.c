/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Write a C program to add numbers
// using call by reference

#include <stdio.h>

// function prototypes
int getSum(int *a, int *b);

int main(void) {
    // declare variables and take input
    int a, b, sum;
    printf("Input the first number: ");
    scanf("%d", &a);
    printf("Input the second number: ");
    scanf("%d", &b);

    // call function by reference and calculate sum
    sum = getSum(&a, &b);

    // program ran successfully
    printf("The sum of %i and %i is %i\n", a, b, sum);
    return 0;
}

int getSum(int *a, int *b) {
    return *a + *b;
}