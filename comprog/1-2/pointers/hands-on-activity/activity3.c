/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Activity 3: Swapping Two Pointers

#include <stdio.h>

// Function Prototypes
void swapPointers(int *first, int *second);

int main(void) {
    // declare variables
    int a = 5, b = 10, *ptrA = &a, *ptrB = &b;    
    printf("Initial values:\tptrA = %i\tptrB = %i\n", *ptrA, *ptrB);

    // swap a and b
    swapPointers(ptrA, ptrB);
    printf("New values:\tptrA = %i\tptrB = %i\n", *ptrA, *ptrB);

    // program ran successfully
    return 0;
}

void swapPointers(int *first, int *second) {
    int temp = *first;
    *first = *second;
    *second = temp;
    return;
}