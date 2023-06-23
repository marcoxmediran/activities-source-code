/*
 * Marcox C. Mediran
 * BSCS1_4
 * Activity 4
*/

#include <stdio.h>
#include <string.h>

// global variables
#define MAX_LENGTH 100
typedef struct {
    int id;
    char name[MAX_LENGTH];
    int salary;
} employee;

// function prototypes
int get_int(char *message);
void printMenu(void);

int main(void) {
    // declare variables and take input
    int choice;
    int i;
    int last_employee = 0;
    float average_salary = 0;
    const int MAX_EMPLOYEES = get_int("Enter the number of employees: ");
    employee company[MAX_EMPLOYEES];
    char temp_name[MAX_LENGTH];

    // main loop
    printf("\nEmployee Management System\n");
    do {
        printMenu();
        choice = get_int("Enter your choice: ");
        switch (choice) {
            case 1:
                if (last_employee < MAX_EMPLOYEES) {
                    company[last_employee].id = get_int("\nEnter employee ID: ");
                    printf("Enter employee name: ");
                    fgetc(stdin);
                    fgets(temp_name, MAX_LENGTH, stdin);
                    strcpy(company[last_employee].name, temp_name);
                    company[last_employee].salary = get_int("Enter employee salary: "); 
                    last_employee += 1;
                    break;
                }
                printf("Maximum employees reached!\n");
                break;
            case 2:
                printf("Employee Details:\n");
                for (i = 0; i < last_employee; i++) {
                    printf("ID: %i\n", company[i].id);
                    printf("Name: %s", company[i].name);
                    printf("Salary: %i\n\n", company[i].salary);
                }
                break;
            case 3:
                for (i = 0, average_salary = 0; i < last_employee; i++) {
                    average_salary += company[i].salary;
                }
                average_salary /= last_employee;
                printf("\nAverage Salary: %.2f\n", average_salary);
                break;
            case 4:
                printf("\nExiting the program...\n");
                break;
            default:
                printf("Wrong choice!\n");
                break;
        }
    } while (choice != 4);

    // program ran successfully
    return 0;
}

int get_int(char *message) {
    int i;
    printf("%s", message);
    scanf("%d", &i);
    return i;
}

void printMenu(void) {
    printf("\nMenu:\n\n");
    printf("\t1. Add an employee\n");
    printf("\t2. Display employee details\n");
    printf("\t3. Calculate Average Salary\n");
    printf("\t4. Exit\n\n");
}