/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>
#include <math.h>

// Function Prototypes
void instruct();

int main(void) {
    // Declare variables and take input
    int radius;
    const float PI = 3.14159;
    float area, circumference;
    instruct();
    scanf("%d", &radius);

    // Calculate answers
    area = PI * pow(radius, 2);
    circumference = 2 * PI * radius;

    // Program ran successfully
    printf("Area: %.2f\n", area);
    printf("Circumference: %.2f\n", circumference);
    return 0;
}

void instruct() {
    printf("This program computes the area and circumference of a circle.\n");
    printf("To use this program, enter the raidus of a circle after the prompt: Enter radius => ");
}