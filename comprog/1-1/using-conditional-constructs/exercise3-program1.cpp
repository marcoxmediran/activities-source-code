/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void) {
    // declare and take input
    int day;
    printf("Input a day in numeric form (1-7): ");
    scanf("%d", &day);

    // if statements
    if (day == 1) {
        printf("That day is %s.\nHave a nice day!\n", "Monday");
    }
    else if (day == 2) {
        printf("That day is %s.\nHave a nice day!\n", "Tuesday");
    }
    else if (day == 3) {
        printf("That day is %s.\nHave a nice day!\n", "Wednesday");
    }
    else if (day == 4) {
        printf("That day is %s.\nHave a nice day!\n", "Thursday");
    }
    else if (day == 5) {
        printf("That day is %s.\nHave a nice day!\n", "Friday");
    }
    else if (day == 6) {
        printf("That day is %s.\nHave a nice day!\n", "Saturday");
    }
    else if (day == 7) {
        printf("That day is %s.\nHave a nice day!\n", "Sunday");
    }
    else {
        printf("INVALID INPUT\n");
        return 1;
    }
    return 0;
}