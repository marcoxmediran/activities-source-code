/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void) {
    // declare and take input
    int num1, num2;
    printf("Print 2 integers (separated by a space): ");
    scanf("%d %d", &num1, &num2);

    // if statements
    if (num1 < num2) {
        printf("NUMBER1 IS SMALLER\n");
    }
    if (num1 > num2) {
        printf("NUMBER2 IS SMALLER\n");
    }
    if (num1 == num2) {
        printf("NUMBER1 AND NUMBER2 ARE EQUAL\n");
    }
    return 0;
}