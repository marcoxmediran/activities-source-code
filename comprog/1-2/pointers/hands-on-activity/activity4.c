/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Activity 4: Function Pointers

#include <stdio.h>

// Function prototypes
float calculate(void);
float getFloat(void);
float add(float a, float b);
float subtract(float a, float b);
float multiply(float a, float b);
float divide(float a, float b);

int main(void) {
    // program ran successfully
    float answer = calculate();
    printf("The answer is: %.2f\n", answer);
    return 0;
}

float calculate(void) {
    int choice;
    float (*chosen_operation)(float, float);
    printf("[1] Addition\n");
    printf("[2] Subraction\n");
    printf("[3] Multiplication\n");
    printf("[4] Division\n");
    printf("Pick your favored operation: ");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            chosen_operation = &add;
            break;
        case 2:
            chosen_operation = &subtract;
            break;
        case 3:
            chosen_operation = &multiply;
            break;
        case 4:
            chosen_operation = &divide;
            break;
    }
    float a = getFloat();
    float b = getFloat();
    return chosen_operation(a, b);
}

float getFloat(void) {
    float f;
    printf("Input any float: ");
    scanf("%f", &f);
    return f;
}

float add(float a, float b) {
    return a + b;
}

float subtract(float a, float b) {
    return a - b;
}

float multiply(float a, float b) {
    return a * b;
}

float divide(float a, float b) {
    return a / b;
}