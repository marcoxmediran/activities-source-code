/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise 4
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
    string input_line = get_string("Input the content of the new line: ");
    string read_line = malloc(MAX_LENGTH);
    int selected_line = get_int("Input the line number you want to replace: ");
    int current_line = 0;
    FILE *fp = fopen(file_name, "r");
    FILE *fp_new = fopen("temp.txt", "w");

    while (!feof(fp)) {
        fgets(read_line, MAX_LENGTH, fp);
        current_line += 1;
        if (current_line == selected_line) {
            fprintf(fp_new, "%s\n", input_line);
        } else {
            fprintf(fp_new, "%s", read_line);
        }
    }

    // program ran successfully
    printf("Replacement done successfully..!!\n");
    free(file_name);
    free(input_line);
    free(read_line);
    fclose(fp);
    fclose(fp_new);
    remove("test-replace.txt");
    rename("temp.txt", "test-replace.txt");
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