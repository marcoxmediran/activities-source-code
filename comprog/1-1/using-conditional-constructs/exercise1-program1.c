/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void) {
	// declare and take input
	double value;
	printf("Input a double: ");
	scanf("%lf", &value);

	// if statements
	if (value < 0) {
		printf("NEGATIVE\n");
	}
	if (value > 0) {
		printf("POSITIVE\n");
	}
	return 0;
}
