/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Write a C program to add three numbers using pointers

#include <stdio.h>

int main(void) {
    // declare variables and pointers
    int a, b, c, sum, *pa, *pb, *pc;

    // take input from user
    printf("Input the first number: ");
    scanf("%d", &a);
    printf("Input the second number: ");
    scanf("%d", &b);
    printf("Input the third number: ");
    scanf("%d", &c);

    // point to addresses
    pa = &a;
    pb = &b;
    pc = &c;

    // calculate sum
    sum = *pa + *pb + *pc;
    
    // program ran successfully
    printf("The sum of the entered numbers is: %i\n", sum);
    return 0;
}