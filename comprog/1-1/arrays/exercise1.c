/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void){
    // declare arrays, size, and take input from user
    const int ARRAY_SIZE = 11;
    int inputArray[ARRAY_SIZE];
    int sumArray[ARRAY_SIZE - 1];
    printf("Enter 11 numbers\n");
    for (int i = 0; i < ARRAY_SIZE; i++){
        printf("Enter number %i: ", i);
        scanf("%d", &inputArray[i]);
        if (i > 0){
            sumArray[i - 1] = inputArray[i] + inputArray[i - 1];
        }
    }

    // program ran successfully
    for (int i = 0; i < ARRAY_SIZE - 1; i++){
        printf("%i ", sumArray[i]);
    }
    printf("\n");
    return 0;
}