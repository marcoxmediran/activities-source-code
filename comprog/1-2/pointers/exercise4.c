/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Write a C program to store n elements in an array
// and print the elements using pointers

#include <stdio.h>

int main(void) {
    // declare variables and take input
    int arraySize;
    printf("Input the number of elements to store in the array: ");
    scanf("%d", &arraySize);
    int elements[arraySize];

    // store elements in the array
    for (int i = 0; i < arraySize; i++) {
        printf("element-%i: ", i);
        scanf("%d", elements + i);
    }
    printf("\n");

    // print all elements in the array
    printf("The elements you entered are:\n");
    for (int i = 0; i < arraySize; i++) {
        printf("element-%i: %i\n", i, *(elements + i));
    }

    // program ran successfully
    return 0;
}