/* 
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void) {
    // declare and take input
    char letter;
    printf("Input a character: ");
    scanf("%c", &letter);

    // if statements
    // lowercase characters in ascii are from 97-122 while uppercase characters are from 65-90
    int letter_ascii = (int) letter;    // type casts the char variable to an int
    if (letter_ascii >= 97 && letter_ascii <= 122) {
        printf("LOWER CASE\n");
    }
    else {
        printf("UPPER CASE\n");
    }
    return 0;
}