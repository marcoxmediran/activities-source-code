/*
 * Marcox C. Mediran
 * BSCS1_4
 * Activity 2
*/

#include <stdio.h>
#include <string.h>
#include <ctype.h>

// global variables
#define MAX_LENGTH 100

// function prototypes
int countVowels(char *string);

int main(void) {
    // declare variables and take input
    char s[MAX_LENGTH];
    printf("Enter a string of length %i: ", MAX_LENGTH);
    fgets(s, MAX_LENGTH, stdin);

    // count vowels and print answer
    int vowels = countVowels(s);
    printf("Number of vowels: %i\n", vowels);

    // program ran successfully
    return 0;
}

int countVowels(char *string) {
    int counter = 0;
    int i;
    int length = strlen(string) - 1;
    char c;
    for (i = 0; i < length; i++) {
        c = tolower(string[i]); 
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            counter += 1;
        }
    }
    return counter;
}