/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

// Function Prototypes
float convertToFahrenheit(float celcius);

int main(void) {
    // declare variables and take input
    float celcius;
    printf("Enter the temperature in Celsius: ");
    scanf("%f", &celcius);

    // calculate answer and print it
    float fahrenheit = convertToFahrenheit(celcius);
    printf("%.2f degrees Celcius is equal to %.2f degrees Fahrenheit.\n", celcius, fahrenheit);

    // program ran successfully
    return 0;
}

float convertToFahrenheit(float celcius) {
    float answer = (celcius * 9 / 5) + 32;
    return answer;
}