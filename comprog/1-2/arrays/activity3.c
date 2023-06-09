/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Activity 3
// Write a program that takes a 4x4 matrix as input from user
// and then calculates the product of the diagonal elements

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

    // print the matrix input by user for visualization
    printf("Here is the created matrix:\n");
    for (int i = 0; i < MATRIX_SIZE; i++) {
        for (int j = 0; j < MATRIX_SIZE; j++) {
            printf("%i\t", matrix[i][j]);
        }
        printf("\n");
    }

    // calculate the product of the elements from the 1st diagonal
    int product0 = 1;
    printf("\n");
    printf("The product of the diagonal, ");
    for (int i = 0; i < MATRIX_SIZE; i++) {
        printf("%i, ", matrix[i][i]);
        product0 *= matrix[i][i];
    }
    printf("is %i\n", product0);

    // program ran successfully
    return 0;
}