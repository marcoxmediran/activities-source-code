/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void) {
	// declare variables and take input
	int size;
	int subjects;
	printf("Enter the number of students: ");
	scanf("%d", &size);
	printf("Enter the number of subjects: ");
	scanf("%d", &subjects);
	
	int grades[size][subjects];
	
	// get grades per subject per student
	int i, j;
	for (i = 0; i < size; i++) {
		printf("Student %i:\n", i + 1);
		for (j = 0; j < subjects; j++) {
			printf("Enter grade for subject %i: ", j + 1);
			scanf("%d", &grades[i][j]);
		}
	}
	
	// print student grades
	printf("Student grades:\n");
	for (i = 0; i < size; i++) {
		printf("Student %i:", i + 1);
		for (j = 0; j < subjects; j++) {
			printf(" %i", grades[i][j]);
		}
		printf("\n");
	}
	
	// print student grades
	float average = 0;
	printf("Average grades:\n");
	for (i = 0; i < size; i++) {
		printf("Student %i:", i + 1);
		for (j = 0; j < subjects; j++) {
			average += grades[i][j];
		}
		average /= subjects;
		printf("%.2f\n", average);
		average = 0;
	}
	
	// program ran successfully
	return 0;
}
