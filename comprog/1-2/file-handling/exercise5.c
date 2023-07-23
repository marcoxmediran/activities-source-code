/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise 5
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
int get_int(string message);

int main(void) {
    // local variables
    string file_name = get_string("Input the file name to be opened: ");
    string read_line = malloc(MAX_LENGTH);
    const int APPEND_LINE_COUNT = get_int("Input the number of lines to be writted: ");
    FILE *fp = fopen(file_name, "a");
    fgetc(stdin);

    printf("These lines are:\n");
    for (int i = 0; i < APPEND_LINE_COUNT; i++) {
        fprintf(fp, "%s\n", get_string(""));
    }
    fclose(fp);
    fp = fopen(file_name, "r");
    printf("\nThe content of the file %s is:\n", file_name);
    while(!feof(fp)) {
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

int get_int(string message) {
    int i;
    printf("%s", message);
    scanf("%d", &i);
    return i;
}