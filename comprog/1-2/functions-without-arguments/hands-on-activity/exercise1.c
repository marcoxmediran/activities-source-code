/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Exercise 1
// Create a function to print the Fibonacci sequence

#include <stdio.h>

// Function Prototypes
void printFibonacci(void);

int main(void) {
    // Call function
    printFibonacci();

    // Program ran successfully
    return 0;
}

void printFibonacci(void) {
    int current = 1, prev = 0, next = 1;
    for (int i = 0; i < 10; i++) {
        printf("%i\n", current);
        next = prev + current;
        prev = current;
        current = next;
    }
}