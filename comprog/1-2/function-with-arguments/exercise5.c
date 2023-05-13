/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>
#include <ctype.h>

// Function Prototypes
void checkCategory(char letter);

int main(void) {
    // declare variables and take input
    char letter;
    printf("Enter a character: ");
    scanf("%c", &letter);

    // run function and check if vowel or consonant
    checkCategory(letter);

    // program ran successfully
    return 0;
}

void checkCategory(char letter) {
    // manually checks if the letter is a vowel
    // if not, then it is a consonant
    // this uses a function from ctype.h to reduce the amount of checks needed
    char l = tolower(letter);
    if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
        printf("The entered character is a vowel.\n");
        return;
    }
    else {
        printf("The entered character is a consonant.\n");
        return;
    }
}