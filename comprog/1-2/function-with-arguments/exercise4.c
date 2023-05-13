/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>
#include <math.h>

// Function Prototypes
double calculateBMI(double height, double weigth);

int main(void) {
    // declare variables and take input
    double height, weight;
    printf("Enter height in meters: ");
    scanf("%lf", &height);
    printf("Enter weight in kilograms: ");
    scanf("%lf", &weight);

    // calculate BMI and print answer
    double bmi = calculateBMI(height, weight);
    printf("Your BMI is: %.2lf.\n", bmi);

    // program ran successfully
    return 0;
}

double calculateBMI(double height, double weight) {
    double bmi = weight / pow(height, 2);
    return bmi;
}