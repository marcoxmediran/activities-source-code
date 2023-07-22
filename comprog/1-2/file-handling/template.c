/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise n
*/

// libraries
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// global variables
#define MAX_LENGTH 100
typedef char* string;

// function prototypes
string get_string(string message);

int main(void) {
    // local variables

    // program ran successfully
    return 0;
}

string get_string(string message) {
    string s = malloc(MAX_LENGTH);
    printf("%s", message);
    fgets(s, MAX_LENGTH, stdin);
    s[strcspn(s, "\n")] = 0;
    return s;
}