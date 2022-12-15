/*
 * Marcox C. Mediran
 * BSCS1_4
 *
*/

#include <stdio.h>

int main(void){
	float gross_income = 1000, income_tax = 120, sss_contrib = 120, med_insurance = 200;
	float net_income = gross_income - (income_tax + sss_contrib + med_insurance);
	printf("Net income: %f\n", net_income);
	return 0;
}
