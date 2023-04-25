/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Exercise 4
// Create a function to print a pattern of stars

#include <stdio.h>

// Function Prototypes
void printStarPattern(void);

int main(void) {
    // Call function
    printStarPattern();

    // Program ran successfully
    return 0;
}

void printStarPattern(void) {
    const int HEIGHT = 5;
    // Iterates over each row
    for (int row = 1; row <= HEIGHT; row++) {
        // Iterates over each character to be printed
        for (int i = 1; i <= row; i++) {
            printf("*");
        }
        printf("\n");
    }
}