/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

// function prototypes
char * checkParity(int x);

int main(void){
    // declare variables and take input
    int a;
    printf("Input any number: ");
    scanf("%d", &a);

    // program ran successfully
    printf("The entered number is %s\n", checkParity(a));
    return 0;
}

// parity is an element of a number which dictates whether it is odd or even
// this checks a number's parity through a modulo operator
// this function returns a string of characters of either "even" or "odd"
char * checkParity(int x){
    if (x % 2 == 0){
        return "even";
    }
    else{
        return "odd";
    }
}