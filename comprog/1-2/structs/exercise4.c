/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>
#include <string.h>

// global variables
#define MAX_LENGTH 50

int main(void) {
    // declare variables and take input
    int alpha = 0;
    int digits = 0;
    int special = 0;
    int i, true_length;
    char str[MAX_LENGTH];
    printf("Enter a string up to %i characters: ", MAX_LENGTH);
    fgets(str, MAX_LENGTH, stdin);

    // count character and identifiy
    for (i = 0, true_length = strlen(str) - 1; i < true_length; i++) {
        if ((str[i] >= 65 && str[i] <= 90) || (str[i] >= 97) && (str[i] <= 122)) {
            alpha += 1;
        }
        else if (str[i] >= 48 && str[i] <= 57) {
            digits += 1;
        }
        else {
            special += 1;
        }
    }

    // print results
    printf("Number of alphabets in string: %i\n", alpha);
    printf("Number of digits in string: %i\n", digits);
    printf("Number of special characters in string: %i\n", special);

    // program ran successfully
    return 0;
}