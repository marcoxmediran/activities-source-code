/*
 * Marcox C. Mediran
 * BSCS1_4
 * Activity 3
*/

#include <stdio.h>
#include <string.h>

// global variables
#define MAX_LENGTH 100

// function prototypes
int countCharacter(char *string, char character);

int main(void) {
    // declare variables and take input
    char s[MAX_LENGTH];
    char c;
    printf("Enter a string of length %i: ", MAX_LENGTH);
    fgets(s, MAX_LENGTH, stdin);
    printf("Enter a character to count: ");
    scanf("%c", &c);

    // count occurence and print answer
    int occurence = countCharacter(s, c);
    printf("Occurence of %c: %i\n", c, occurence);

    // program ran successfully
    return 0;
}

int countCharacter(char *string, char character) {
    int counter = 0;
    int i;
    int length = strlen(string) - 1;
    for (i = 0; i < length; i++) {
        if (string[i] == character) {
            counter += 1;
        }
    }
    return counter;
}