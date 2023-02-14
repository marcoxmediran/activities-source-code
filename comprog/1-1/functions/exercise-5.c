/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

// function prototypes
int getHighest(int array[], int array_size);

int main(void){
    // declare variables and take input
    int size;
    printf("Input the number of elements to be stored in the array: ");
    scanf("%d", &size);
    int array[size];
    for (int i = 0; i < size; i++){
        printf("element %i: ", i);
        scanf("%d", &array[i]);
    }

    // program ran successfully
    printf("The largest element in the array is %i\n", getHighest(array, size));
    return 0;
}

int getHighest(int array[], int array_size){
    // initializes the first element of the array to be the highest
    int highest = array[0];
    // iterates over each element of the array starting from the second element
    for (int i = 1; i < array_size; i++){
        // compares the ith element to the previous highest integer
        if (array[i] > highest){
            highest = array[i];
        }
    }
    return highest;
}