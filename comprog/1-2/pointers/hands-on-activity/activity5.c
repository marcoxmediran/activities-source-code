/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Activity 5: Calculate Average

#include <stdio.h>
#define ARRAY_SIZE 10

// Function prototypes
float getAverage(int *start);

int main(void) {
    // declare variables
    int numbers[ARRAY_SIZE];
    printf("Input %i numbers for the array:\n", ARRAY_SIZE);
    for (int i = 0; i < ARRAY_SIZE; i++) {
        printf("number[%i]: ", i);
        scanf("%d", numbers + i);
    }

    // calculate average
    float average = getAverage(numbers);
    printf("The average value of the array is %.2f\n", average);

    // program ran successfully
    return 0;
}

float getAverage(int *start) {
    int sum = 0;
    for (int i = 0; i < ARRAY_SIZE; i++) {
        sum += *(start + i);
    }
    return sum / 10;
}