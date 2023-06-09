/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Activity 4
// Write a program that takes a matrix of size 4x4 from the user
// and then swaps the first and last row of the matrix
// Display the modified matrix

#include <stdio.h>
#define MATRIX_SIZE 4

int main(void) {
    // declare variables and take input
    int matrix[MATRIX_SIZE][MATRIX_SIZE];
    for (int i = 0; i < MATRIX_SIZE; i++) {
        for (int j = 0; j < MATRIX_SIZE; j++) {
            printf("Enter integer for matrix[%i][%i]: ", i, j);
            scanf("%d", &matrix[i][j]);
        }
    }

    // print the initial matrix
    printf("The initial matrix is:\n");
    for (int i = 0; i < MATRIX_SIZE; i++) {
        for (int j = 0; j < MATRIX_SIZE; j++) {
            printf("%i\t", matrix[i][j]);
        }
        printf("\n");
    }

    // swap the 1st and 4th column of the matrix
    int buffer;
    for (int i = 0; i < MATRIX_SIZE; i++) {
        buffer = matrix[0][i];
        matrix[0][i] = matrix[MATRIX_SIZE - 1][i];
        matrix[MATRIX_SIZE - 1][i] = buffer;
    }

    // print the modified matrix
    printf("The modified matrix is:\n");
    for (int i = 0; i < MATRIX_SIZE; i++) {
        for (int j = 0; j < MATRIX_SIZE; j++) {
            printf("%i\t", matrix[i][j]);
        }
        printf("\n");
    }

    // program ran successfully
    return 0;
}