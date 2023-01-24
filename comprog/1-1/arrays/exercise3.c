/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void){
    // declare arrays, size, and take inputs from user
    const int ARRAY_SIZE;
    printf("Input the number of elements in the array: ");
    scanf("%d", &ARRAY_SIZE);
    int inputArray[ARRAY_SIZE];
    printf("Input %i elements in the array:\n");
    for (int i = 0; i < ARRAY_SIZE; i++){
        printf("element - %i: ", i);
        scanf("%d", &inputArray[i]);
    }

    // solution
    int duplicates = 0;
    // iterate over each element in the array
    for (int i = 0; i < ARRAY_SIZE; i++){
        // compares each element to every other element
        for (int j = i + 1; j < ARRAY_SIZE; j++){
            if (inputArray[i] == inputArray[j]){
                duplicates++;
                break;
            }
        }
    }

    // program ran successfully
    printf("Total number of duplicate elements found in the array is: %i\n", duplicates);
    return 0;
}