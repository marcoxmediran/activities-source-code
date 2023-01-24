/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void){
    // declare arrays, size, take input from user
    const int ARRAY_SIZE;
    printf("Input the number of elements to be stored in the array: ");
    scanf("%d", &ARRAY_SIZE);
    int origArray[ARRAY_SIZE];
    int copyArray[ARRAY_SIZE];
    printf("Input %i elements in the array:\n", ARRAY_SIZE);
    for (int i = 0; i < ARRAY_SIZE; i++){
        printf("element - %i: ", i);
        scanf("%d", &origArray[i]);
        // solution
        copyArray[i] = origArray[i];
    }

    // program ran successfully
    printf("The elements stored in the first array are:\n");
    for (int i = 0; i < ARRAY_SIZE; i++){
        printf("%i ", origArray[i]);
    }
    printf("\n");
    printf("The elements stored in the second array are:\n");
    for (int i = 0; i < ARRAY_SIZE; i++){
        printf("%i ", copyArray[i]);
    }
    printf("\n");
    return 0;
}