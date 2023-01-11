/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void){
    // iterates each number from 1 to 100
    for (int i = 1; i <= 100; i++){
        // checks if i is odd by using a modulo operator
        if (i % 2 != 0){
            // prints the odd number
            printf("%i ", i);
        }
    }

    // program ran successfully
    printf("\n");
    return 0;
}