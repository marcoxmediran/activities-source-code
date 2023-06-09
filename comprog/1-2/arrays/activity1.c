/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Activity 1
// Write a program that calculates the sum of all elements
// in a given 2D array of size 4x4

#include <stdio.h>
#define SIZE 4

int main(void) {
    // declare variables
    int matrix[SIZE][SIZE] = {{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 6, 9, 12}, {4, 8, 12, 16}};
    int sum;

    // calculate sum
    // iterate over each row
    for (int i = 0; i < SIZE; i++) {
        // iterate over each column
        for (int j = 0; j < SIZE; j++) {
            sum += matrix[i][j];
        }
    }

    // print answer
    printf("The sum of all the elements in the 2D array is %i\n", sum);

    // program ran successfully
    return 0;
}