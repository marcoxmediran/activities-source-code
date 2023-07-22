/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise 1
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
    FILE *fp = fopen("test.txt", "w");
    string input = get_string("Input a sentence for the file: ");
    fprintf(fp, "%s", input);

    // program ran successfully
    printf("The file test.txt was created successfully...!!\n");
    free(input);
    fclose(fp);
    return 0;
}

string get_string(string message) {
    string s = malloc(MAX_LENGTH);
    printf("%s", message);
    fgets(s, MAX_LENGTH, stdin);
    s[strcspn(s, "\n")] = 0;
    return s;
}