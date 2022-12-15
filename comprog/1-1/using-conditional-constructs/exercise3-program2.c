/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void) {
    // declare and take input
    const int FREE_QUOTA = 200;
    int message_count;
    printf("How many messages were sent? ");
    scanf("%d", &message_count);
    float charge = 0;

    // if statements
    if (message_count >= 0 && message_count <= 200) {
        printf("The charge for %d messages would be %.0f\n", message_count, charge);
    }
    else if (message_count > 200) {
        charge = (message_count - 200) * 0.5;
        printf("The charge for %d messages would be %.2f\n", message_count, charge);
    }
    else {
        printf("INPUT ERROR\n");
        return 1;
    }
    return 0;
}