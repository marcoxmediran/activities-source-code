/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void) {
    // declare and take input
    int day;
    printf("Type a number from 1-7 (Monday to Sunday): ");
    scanf("%d", &day);

    // if statements
    if (day >= 1 && day <= 5) {
        printf("WEEKDAY\n");
    }
    else {
        printf("WEEKEND\n");
    }
    return 0;
}