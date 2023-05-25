/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Write a C program to sort an array using pointers

#include <stdio.h>

// function prototypes

void sortArray(int *start, int arraySize);

int main(void) {
    // declare variables and take input
    int arraySize;
    printf("Input the number of elements to store in the array: ");
    scanf("%d", &arraySize);
    int elements[arraySize];

    // store elements
    printf("Input %i elements in the array:\n", arraySize);
    for (int i = 0; i < arraySize; i++) {
        printf("element-%i: ", i);
        scanf("%d", elements + i);
    }

    // sort array and print elements
    sortArray(elements, arraySize);
    printf("The elements in the array after sorting:\n");
    for (int i = 0; i < arraySize; i++) {
        printf("element-%i: %i\n", i, *(elements + i));
    }

    // program ran successfully
    return 0;
}

void sortArray(int *start, int arraySize) {
    int buffer, current, next;
    // this loops arraySize - 1 times since it cannot compare
    // the last element to an element outside the array
    for (int i = 0; i < arraySize - 1; i++) {
        for (int j = 0; j < arraySize - 1; j++) {
            current = *(start + j);
            next = *(start + j + 1);
            // swapping using pointers
            if (current > next) {
                buffer = current;
                *(start + j) = next;
                *(start + j + 1) = buffer;
            }
        }
    }
    return;
}