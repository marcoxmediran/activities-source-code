/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Activity 2
// Write a program that takes a 5x5 matrix
// as input from user and then finds the largest
// element in the matrix along with its row and
// column index

#include <stdio.h>
#define SIZE 5

int main(void) {
    // declare variables and take input
    int largest, i_pos, j_pos;
    int matrix[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            // get integer from user for every element
            printf("Enter integer for matrix[%i][%i]: ", i, j);
            scanf("%d", &matrix[i][j]);
            // compares the last largest number to the
            // current iterated element taken from input
            if (matrix[i][j] > largest) {
                largest = matrix[i][j];
                i_pos = i;
                j_pos = j;
            }
        }
    }

    // display answer
    printf("The largest element in the 2D array is %i, located at matrix[%i][%i]\n", largest, i_pos, j_pos);

    // program ran successfully
    return 0;
}