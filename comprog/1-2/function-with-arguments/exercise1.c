/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

// Function Prototypes
void calculate(int first, int second);

int main(void) {
    // declare variables and take input
    int a, b;
    printf("Enter the first integer: ");
    scanf("%d", &a);
    printf("Enter the second integer: ");
    scanf("%d", &b);

    // run function with argument
    calculate(a, b);

    // program ran successfully
    return 0;
}

void calculate(int first, int second) {
    // calculate answers
    int sum = first + second;
    int product = first * second;

    // print answers
    printf("The sum of %i and %i is %i\n", first, second, sum);
    printf("The product of %i and %i is %i\n", first, second, product);
}