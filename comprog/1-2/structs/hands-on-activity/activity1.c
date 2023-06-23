/*
 * Marcox C. Mediran
 * BSCS1_4
 * Activity 1
*/

#include <stdio.h>
#include <string.h>

// global variables
#define MAX_LENGTH 100

// function prototypes
void checkPalindrome(char *string);

int main(void) {
    // declare variables and take input
    char s[MAX_LENGTH];
    printf("Enter string of length %i: ", MAX_LENGTH);
    fgets(s, MAX_LENGTH, stdin);

    // check if string is palindrome
    checkPalindrome(s);

    // program ran successfully
    return 0;
}

void checkPalindrome(char *string) {
    // iterate over each character and check
    int i;
    int length = strlen(string) - 1;
    int check_size = length / 2; // only check until the half
    char a, b;
    for (i = 0; i < check_size; i++) {
        a = string[i];
        b = string[length - i - 1];
        if (a != b) {
            printf("Not a palindrome\n");
            return;
        }
    } 
    printf("Palindrome\n");
    return;
}