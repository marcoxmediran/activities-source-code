/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

// global variables
#define MAX_LENGTH 100
#define MAX_MENU_ITEMS 5
typedef struct {
    char name[MAX_LENGTH]; 
    char address[MAX_LENGTH];
    float average_cost;
    char menu[MAX_MENU_ITEMS][MAX_LENGTH];
} restaurant;

int main(void) {
    // declare variables and take input
    int i;
    restaurant a = {"Jollibee General Trias Bayan", \
    "Sampalucan St. (Brgy. 2), 4107 General Trias Cavite", \
    125.50, {"Yumburger", "ChickenJoy", \
    "Fries", "Peach Mango Pie", "Ice Cream Sundae"}};
    
    // demo
    printf("This is my go-to restaurant whenever I am hungry:\n");
    printf("Name: %s\n", a.name);
    printf("Location: %s\n", a.address);
    printf("Average Cost: %.2f\n", a.average_cost);
    printf("Menu:\n");
    for (i = 0; i < MAX_MENU_ITEMS; i++) {
        printf("%s\n", a.menu[i]);
    }

    // program ran successfully
    return 0;
}