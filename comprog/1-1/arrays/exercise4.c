/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void){
    // declare arrays, sizes, and take inputs from user
    const int SIZE0, SIZE1;
    printf("Input the number of elements to be stored in the first array: ");
    scanf("%d", &SIZE0);
    int array0[SIZE0];
    for (int i = 0; i < SIZE0; i++){
        printf("element - %i: ", i);
        scanf("%d", &array0[i]);
    }
    printf("Input the number of elements to be stored in the second array: ");
    scanf("%d", &SIZE1);
    int array1[SIZE1];
    for (int i = 0; i < SIZE1; i++){
        printf("element - %i: ", i);
        scanf("%d", &array1[i]);
    }

    // solution
    // merge the first two arrays
    const int MERGEDSIZE = SIZE0 + SIZE1;
    int mergedArray[MERGEDSIZE];
    for (int i = 0; i < SIZE0; i++){
        mergedArray[i] = array0[i];
    }
    for (int i = 0; i < SIZE1; i++){
        mergedArray[i + SIZE0] = array1[i];
    }

    // sort the new array
    // iterate over each element in the merged array
    for (int i = 0; i < MERGEDSIZE; i++){
        for (int j = i + 1; j < MERGEDSIZE; j++){
            // compares adjacent elements
            if (mergedArray[i] < mergedArray[j]){
                // sort in descending order
                int buffer = mergedArray[i];
                mergedArray[i] = mergedArray[j];
                mergedArray[j] = buffer;
            }
        }
    }

    // program ran successfully
    for (int i = 0; i < MERGEDSIZE; i++){
        printf("%i ", mergedArray[i]);
    }
    printf("\n");
    return 0;
}