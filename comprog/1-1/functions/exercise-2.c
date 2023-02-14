/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

// function prototypes
float square(float x);

int main(void){
    // declare variables and take input
    float f;
    printf("Input any number to square: ");
    scanf("%f", &f);

    // program ran successfully
    printf("The square of %.2f is: %.2f\n", f, square(f));
    return 0;
}

// returns the square of a float
float square(float x){
    return x * x;
}