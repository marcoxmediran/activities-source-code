/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>
#include <string.h>

// global variables
#define MAX_LENGTH 50

// function prototypes
void sortString(char *string, int true_size);

int main(void) {
    // declare variables and take input
    char str[MAX_LENGTH];
    printf("Enter a string of length %i: ", MAX_LENGTH);
    fgets(str, MAX_LENGTH, stdin);

    // sort string and print sorted string
    sortString(str, strlen(str) - 1);
    printf("After sorting, the string appears like:\n");
    puts(str);

    // program ran successfully
    return 0;
}

void sortString(char *string, int true_size) {
    char temp, current, next;
    for (int i = 0; i < true_size - 1; i++) {
        for (int j = 0; j < true_size - 1; j++) {
            current = *(string + j);
            next = *(string + j + 1);
            if (current > next) {
                temp = current;
                *(string + j) = next;
                *(string + j + 1) = temp;
            }
        }
    }
    return;
}