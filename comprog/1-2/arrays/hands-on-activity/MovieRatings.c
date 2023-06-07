/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void) {
	// declare variables and take input
	int size;
	int ratings;
	printf("Enter the number of movies: ");
	scanf("%d", &size);
	printf("Enter the number of ratings per movie: ");
	scanf("%d", &ratings);
	
	int movies[size][ratings];
	
	// get ratings per movie
	int i, j;
	for (i = 0; i < size; i++) {
		printf("Movie %i:\n", i + 1);
		for (j = 0; j < ratings; j++) {
			printf("Enter rating %i: ", j + 1);
			scanf("%d", &movies[i][j]);
		}
	}
	
	// print movie ratings
	printf("Movie ratings:\n");
	for (i = 0; i < size; i++) {
		printf("Movie %i:", i + 1);
		for (j = 0; j < ratings; j++) {
			printf(" %i", movies[i][j]);
		}
		printf("\n");
	}
	
	// print average ratings
	float average = 0;
	printf("Average ratings:\n");
	for (i = 0; i < size; i++) {
		printf("Movie %i:", i + 1);
		for (j = 0; j < ratings; j++) {
			average += movies[i][j];
		}
		average /= ratings;
		printf("%.2f\n", average);
		average = 0;
	}
	
	// program ran successfully
	return 0;
}
