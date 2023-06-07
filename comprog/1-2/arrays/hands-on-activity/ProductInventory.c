/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>
#include <string.h>
#define MAX_LENGTH 20

// function prototypes
void printMenu();

int main(void) {
	// declare variables and take input
	int size;
	printf("Enter the maximum number of products in the inventory: ");
	scanf("%d", &size);
	int quantity[size];
	char names[size][MAX_LENGTH];
	
	// main loop
	int choice, chosen_item, i, last_item = 0;
	char item_input[MAX_LENGTH];
	int isRunning = 1;
	while (isRunning) {
		printMenu();
		printf("Enter our choice: ");
		scanf("%d", &choice);
		switch (choice) {
			case 1:
				printf("Enter the name of the product: ");
				scanf("%s", names[last_item]);
				printf("Enter the quantity: ");
				scanf("%d", &quantity[last_item]);
				last_item++;
				break;
			case 2:
				printf("Enter the name of the product: ");
				scanf("%s", item_input);
				for (i = 0; i < size; i++) {
					if (strcmp(item_input, names[i]) == 0) {
						printf("Enter new quantity: ");
						scanf("%d", &quantity[i]);
					}
				}
				break;
			case 3:
				printf("Current Inventory:\n");
				for (i = 0; i < size; i++) {
					printf("%s: ", names[i]);
					printf("%i\n", quantity[i]);
				}
				break;
			case 4:
				isRunning = 0;
				break;
			default:
				printf("Wrong input\n");
		}
	}
	
	// program ran successfully
	return 0;
}

void printMenu(){
	printf("\nMenu:\n");
	printf("  1. Add a new product\n");
	printf("  2. Update a product quantity\n");
	printf("  3. Display inventory\n");
	printf("  4. Exit\n\n");
}
