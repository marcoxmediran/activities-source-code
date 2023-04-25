/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Exercise 5
// Create a function to print a pyramid pattern

#include <stdio.h>

// Function Prototypes
void printPyramidPattern(void);

int main(void) {
    // Call function
    printPyramidPattern();

    // Program ran successfully
    return 0;
}

void printPyramidPattern(void) {
    /*
        *       // 4 spaces, 1 stars
       ***      // 3 spaces, 3 stars
      *****     // 2 spaces, 5 stars
     *******    // 1 spaces, 7 stars
    *********   // 0 spaces, 9 stars
    */

    const int HEIGHT = 5;
    // Iterates over each row of the pyramid
    for (int i = 0; i < HEIGHT; i++) {
        // Prints spaces
        for (int spaces = 0; spaces < HEIGHT - i - 1; spaces++) {
            printf(" ");
        }
        // Prints stars
        for (int stars = 0, count = 1 + i * 2; stars < count; stars++) {
            printf("*");
        }

        printf("\n");
    }
}