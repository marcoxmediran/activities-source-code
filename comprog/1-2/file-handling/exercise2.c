/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise 2
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
    string file_name = get_string("Input the file name to be opened: ");
    string read_line = malloc(MAX_LENGTH);
    FILE *fp = fopen(file_name, "r");
    int word_count = 0;
    int character_count = 0;

    printf("The content of the file %s is:\n", file_name);
    while (!feof(fp)) {
        fgets(read_line, MAX_LENGTH, fp);
        printf("%s", read_line);
    }

    // program ran successfully
    free(file_name);
    free(read_line);
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