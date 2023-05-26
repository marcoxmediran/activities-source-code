/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Activity 2: Passing Pointers to Functions

#include <stdio.h>
#define ARRAY_SIZE 5

// Function prototypes
void multiplyByTwo(int *start);

int main(void) {
    // declare variables
    int numbers[ARRAY_SIZE] = {1, 3, 5, 7, 9};
    printf("The initial elements of the array are:\n");
    for (int i = 0; i < ARRAY_SIZE; i++){
        printf("numbers[%i] = %i\n", i, numbers[i]);
    }

    // multiply and print the same array
    multiplyByTwo(numbers);
    printf("The new elements of the array are:\n");
    for (int i = 0; i < ARRAY_SIZE; i++) {
        printf("numbers[%i] = %i\n", i, numbers[i]);
    }

    // program ran successfully
    return 0;
}

void multiplyByTwo(int *start) {
    for (int i = 0; i < ARRAY_SIZE; i++) {
        *(start + i) *= 2;
    }
}