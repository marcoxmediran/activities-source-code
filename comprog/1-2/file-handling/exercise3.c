/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise 3
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
int count_words(string line);
int count_characters(string line);

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
        word_count += count_words(read_line);
        character_count += count_characters(read_line);
    }

    printf("\n");
    printf("The number of words in the file %s are: %i\n", file_name, word_count);
    printf("The number of characters in the file %s are: %i\n", file_name, character_count);

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

int count_words(string line) {
    int count = 1;  // it starts with 1 since every line will have 1 word, unless it's null
    if (line == NULL) {
        return 0;
    }
    for (int i = 0; i < strlen(line); i++) {
        if (*(line + i) == 32) {
            count += 1;
        }
    }
    return count;
}

int count_characters(string line) {
    int count = 0;
    int current_character;
    if (line == NULL) {
        return count;
    }
    for (int i = 0; i < strlen(line); i++) {
        current_character = *(line + i);
        if (isalnum(current_character)) {
            count += 1;
        }
    }
    return count;
}