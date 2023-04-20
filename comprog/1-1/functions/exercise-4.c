/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

// function prototypes
void toBinary(int x);

int main(void){
    // declare variables and take input
    int a;
    printf("Input any decimal number: ");
    scanf("%d", &a);

    // program ran successfully
    printf("The binary value is: ");
	toBinary(a);
	return 0;
}

// prints the binary equivalent of the given integer
void toBinary(int x){
    // checks if the case is an exception(zero) and no conversion is needed.
    if (x == 0){
        printf("0\n");
        return;
    }

    // calculate how many digits the binary will have
    int array_size = 0;
    int x_copy = x;
    for (int i = 0; x_copy != 0; i++){
        x_copy /= 2;
        array_size++;
    }

    // declares an array of integers to represent the binary given the calculated number of digits
    int binary[array_size];
    // continuous division method of converting decimal to binary
    for (int i = 0; x != 0; i++){
        // determines bit
        int bit = x % 2; 
        x /= 2;
        // assigns bit starting from the Least Significant Bit
        binary[array_size - i - 1] = bit;
    }

    // prints each character of the binary
    for (int i = 0; i < array_size; i++){
        printf("%i", binary[i]);
    }
    
    // prints a new line to finish the function
    printf("\n");
}
