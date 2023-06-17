/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>
#include <string.h>

// global variables
#define MAX_LENGTH 10
#define MAX_MONTHS 12
typedef struct {
    int order;
    char name[MAX_LENGTH];
    int day_count; 
} month;

int main(void) {
    // declare variables and take input
    int i;
    month calendar[MAX_MONTHS];
    char names[MAX_MONTHS][MAX_LENGTH] = {\
    "January", "February", "March", "April", "May", "June", \
    "July", "August", "September", "October", "November", "December"};
    int days[MAX_MONTHS] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    // populate and print calendar
    printf("Calendar:\n");
    for (i = 0; i < MAX_MONTHS; i++) {
        calendar[i].order = i + 1;
        strcpy(calendar[i].name, names[i]);
        calendar[i].day_count = days[i];
        printf("%i. %s: %i days\n", calendar[i].order, calendar[i].name, calendar[i].day_count);
    }

    // program ran successfully
    return 0;
}