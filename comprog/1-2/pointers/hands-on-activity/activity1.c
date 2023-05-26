/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Activity1: Pointer Arithmetic

#include <stdio.h>

int main(void) {
    // declare variables
    int numbers[5] = {2, 4, 6, 8, 10};
    int *p = &numbers[0];
    printf("The contents of the array are:\n");
    for (int i = 0; i < 5; i++) {
        printf("%i ", numbers[i]);
    }
    printf("\n");

    // problem a
    printf("Third element of the array: %i\n", *(p + 2)); 

    // problem b
    p += 2;
    printf("Pointer incremented by 2 positions: %i\n", *p);

    // problem c
    printf("%i minus 1 is %i\n", *p, *p - 1);

    // problem d
    p = &numbers[0];
    printf("The first element: %i\n", *p);

    // program ran successfully
    return 0;
}