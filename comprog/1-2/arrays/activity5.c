/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Activity 5
// Write a program that takes a matrix of size 3x3 as input from user
// and then calculates the sum of each row and each column
// Display the row sums and column sums

#include <stdio.h>
#define MATRIX_SIZE 3

int main(void) {
    // declare variables and take input
    int matrix[MATRIX_SIZE][MATRIX_SIZE] = {};
    int row0_sum = 0, row1_sum = 0, row2_sum = 0;
    int col0_sum = 0, col1_sum = 0, col2_sum = 0;
    for (int i = 0; i < MATRIX_SIZE; i++) {
        for (int j = 0; j < MATRIX_SIZE; j++) {
            printf("Enter an integer for matrix[%i][%i]: ", i, j);
            scanf("%d", &matrix[i][j]);
        }
    }

    // print the created matrix
    printf("The created matrix is:\n");
    for (int i = 0; i < MATRIX_SIZE; i++) {
        for (int j = 0; j < MATRIX_SIZE; j++) {
            printf("%i\t", matrix[i][j]);
        }
        printf("\n");
    }

    // calculate sum for each row and column
    row0_sum = matrix[0][0] + matrix[0][1] + matrix[0][2];
    row1_sum = matrix[1][0] + matrix[1][1] + matrix[1][2];
    row2_sum = matrix[2][0] + matrix[2][1] + matrix[2][2];
    col0_sum = matrix[0][0] + matrix[1][0] + matrix[2][0];
    col1_sum = matrix[0][1] + matrix[1][1] + matrix[2][1];
    col2_sum = matrix[0][2] + matrix[1][2] + matrix[2][2];

    // print the answers
    printf("The sum of 1st row is %i, 2nd row is %i, and 3rd row is %i\n", row0_sum, row1_sum, row2_sum);
    printf("The sum of 1st column is %i, 2nd column is %i, and 3rd column is %i\n", col0_sum, col1_sum, col2_sum);

    // program ran successfully
    return 0;
}