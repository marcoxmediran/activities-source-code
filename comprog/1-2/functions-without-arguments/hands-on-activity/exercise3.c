/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Exercise 3
// Create a function to calculate a factorial of a number

#include <stdio.h>

// Function Prototypes
void calculateFactorial(void);

int main(void) {
    // Call function
    calculateFactorial();

    // Program ran successfully
    return 0;
}

void calculateFactorial(void) {
    int number, factorial = 1;
    printf("Enter a number: ");
    scanf("%d", &number);

    for (int i = 1; i <= number; i++) {
        factorial *= i;
    }

    printf("%i! is %i\n", number, factorial);
}