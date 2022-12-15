/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void) {
    // declare and take input
    int years;
    float salary, bonus;

    printf("For how many years did the employee work? ");
    scanf("%d", &years);

    printf("How much is their salary? ");
    scanf("%f", &salary);

    // switch statement
    switch (years) {
        case 0 ... 5:
            bonus = 0.20;
            break;
        case 6 ... 10:
            bonus = 0.25;
            break;
        case 11 ... 15:
            bonus = 0.30;
            break;
        case 16 ... 20:
            bonus = 0.35;
            break;
        default:
            bonus = 0.50;
    }

    // print the employee's salary
    bonus = salary * bonus;
    printf("For an employee that is working for %i years and has a salary of %.2f, their bonus would be %.2f\n", years, salary, bonus);
    return 0;
}