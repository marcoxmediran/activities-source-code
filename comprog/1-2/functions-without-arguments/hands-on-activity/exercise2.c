/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Exercise 2
// Create a function to print the multiplication table of a number

#include <stdio.h>

// Function Prototypes
void printMultiplicationTable(void);

int main(void) {
    // Call function
    printMultiplicationTable();

    // Program ran successfully
    return 0;
}

void printMultiplicationTable(void) {
    // For this exercise, I choose number 3
    const int MULTIPLE = 3;
    printf("Multiples of %i:\n", MULTIPLE);
    for (int i = 1; i <= 10; i++) {
        printf("%i: %i\n", i, MULTIPLE * i);
    }
}