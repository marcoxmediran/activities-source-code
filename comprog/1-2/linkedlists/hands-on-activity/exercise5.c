/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise 5
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// global variables
#define MAX_LENGTH 50
#define MAX_STUDENTS 100
typedef struct llist {
    int value;
    char name[MAX_LENGTH];
    int age;
    float gpa;
    struct llist *next;
} node;

node *head = NULL;

// function prototypes
void printMenu(void);
node *addNode(int value, char name[MAX_LENGTH], int age, float gpa);
void printNodes(void);
void searchNode(int value);
int get_int(char *message);
float get_float(char *message);

int main(void) {
    // declare variables and take input
    int choice = 0;
    int i;
    int temp_value, temp_age;
    float temp_gpa;
    char temp_name[MAX_LENGTH];

    // main loop
    printf("\nStudent Enrollment System\n\n");
    while (choice != 4) {
        printMenu();
        choice = get_int("");
        switch (choice) {
            case 1:
                temp_value = get_int("Enter Roll Number: ");
                printf("Enter Name: ");
                fgetc(stdin);
                fgets(temp_name, MAX_LENGTH, stdin);
                temp_name[strcspn(temp_name, "\n")] = 0;
                temp_age = get_int("Enter Age: ");
                temp_gpa = get_float("Enter GPA: ");
                addNode(temp_value, temp_name, temp_age, temp_gpa);
                break;
            case 2:
                printNodes();
                break;
            case 3:
                temp_value = get_int("Enter roll number to search: ");
                searchNode(temp_value);
                break;
            case 4:
                printf("\n\nThank you for using the Student Enrollment System!\n");
                break;
            default:
                printf("Wrong input!\n");
                break;
        }
    }

    // program ran successfully
    return 0;
}

void printMenu(void) {
    printf("\n1. Add a new student");
    printf("\n2. Display enrolled students");
    printf("\n3. Search for a student by roll number");
    printf("\n4. Exit\n");
    printf("\nEnter your choice: ");
    return;
}

node *addNode(int value, char name[MAX_LENGTH], int age, float gpa) {
    node *new = NULL;
    if (head == NULL) {
        new = malloc(sizeof(node));
        if (new == NULL) {
            return NULL;
        }
        new->value = value;
        strcpy(new->name, name);
        new->age = age;
        new->gpa = gpa;
        head = new;
        new->next = NULL;
    } else {
        node *current = head;
        while (current->next != NULL) {
            current = current->next;
        }
        new = malloc(sizeof(node));
        if (new == NULL) {
            return NULL;
        }
        new->value = value;
        strcpy(new->name, name);
        new->age = age;
        new->gpa = gpa;
        new->next = NULL;
        current->next = new;
    }
    return new;
}

int removeNode(int value) {
    node *current = head;
    node *prev = head;
    while (current != NULL) {
        if (current->value == value) {
            if (current == head) {
                head = current->next;
            } else {
                prev->next = current->next;
            }
            return 1;
        }
        prev = current;
        current = current->next;
    }
    return 0;
}

void printNodes(void) {
    node *current = head;
    printf("Enrolled Students:\n");
    while (current != NULL) {
        printf("Roll Number: %i | Name: %s | Age: %i | GPA : %.1f\n", current->value, current->name, current->age, current->gpa);
        current = current->next;
    }
    return;
}

void searchNode(int value) {
    node *current = head;
    int is_found = 0;
    while (current != NULL) {
        if (current->value == value) {
            is_found = 1;
            printf("\nStudent Found:\n");
            printf("Roll Number: %i | Name: %s | Age: %i | GPA : %.1f\n", current->value, current->name, current->age, current->gpa);
        }
        current = current->next;
    }
    if (!is_found) {
        printf("\nStudent not Found.\n");
    }
    return;
}

int get_int(char *message) {
    int i;
    printf("%s", message);
    scanf("%d", &i);
    return i;
}

float get_float(char *message) {
    float f;
    printf("%s", message);
    scanf("%f", &f);
    return f;
}