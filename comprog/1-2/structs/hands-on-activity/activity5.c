/*
 * Marcox C. Mediran
 * BSCS1_4
 * Activity 5
*/

#include <stdio.h>
#include <string.h>

// global variables
#define MAX_NAME_LENGTH 100
#define MAX_LEVEL_LENGTH 5
#define MAX_SUBJECTS 5
typedef struct {
    int id;
    char name[MAX_NAME_LENGTH];
    int age;
    char level[MAX_LEVEL_LENGTH];
    int grades[MAX_SUBJECTS];
} student;

// function prototypes
int get_int(char *message);
void printMenu(void);
void printStudentDetails(student *s);

int main(void) {
    // declare variables and take input
    int choice;
    int i, j;
    int last_student = 0;
    int temp_id;
    const int MAX_STUDENTS = get_int("Enter max number of students: ");
    student sdm[MAX_STUDENTS];
    char temp_name[MAX_NAME_LENGTH];
    char temp_level[MAX_LEVEL_LENGTH];

    // main loop
    printf("\nStudent Database Management\n\n");
    do {
        printMenu();
        choice = get_int("Enter your choice: ");
        switch (choice) {
            case 1:
                if (last_student < MAX_STUDENTS) {
                    sdm[last_student].id = get_int("Enter student ID: ");
                    printf("Enter student name: ");
                    fgetc(stdin);
                    fgets(temp_name, MAX_NAME_LENGTH, stdin);
                    strcpy(sdm[last_student].name, temp_name);
                    sdm[last_student].age = get_int("Enter student age: ");
                    printf("Enter student grade: ");
                    fgetc(stdin);
                    fgets(temp_level, MAX_NAME_LENGTH, stdin);
                    strcpy(sdm[last_student].level, temp_level);
                    printf("Enter marks for 5 subjects:\n");
                    for (i = 0; i < MAX_SUBJECTS; i++) {
                        printf("Subject %i", i + 1);
                        sdm[last_student].grades[i] = get_int(": ");
                    }
                    last_student += 1;
                    break;
                }
                printf("\nMaximum students reached!\n\n");
                break;
            case 2:
                temp_id = get_int("Enter student ID to search: ");
                for (i = 0; i < last_student; i++) {
                    if (temp_id == sdm[i].id) {
                        printStudentDetails(sdm + i);
                        break;
                    }
                }
                break;
            case 3:
                printf("\nStudent Details:\n\n");
                for (i = 0; i < last_student; i++) {
                    printStudentDetails(sdm + i);
                }
                break;
            case 4:
                printf("Exiting program...\n");
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
    int input;
    printf("%s", message);
    scanf("%d", &input);
    return input;
}

void printMenu(void) {
    printf("Menu:\n\n");
    printf("\t1. Add a student\n");
    printf("\t2. Search a student\n");
    printf("\t3. Display all students\n");
    printf("\t4. Exit\n\n");
    return;
}

// implements a function involving a pointer
// of a struct since cases 2 and 3 have
// similar solutions
void printStudentDetails(student *s) {
    int i;
    printf("ID: %i\n", s->id);
    printf("Name: %s", s->name);
    printf("Age: %i\n", s->age);
    printf("Grade: %s", s->level);
    printf("Marks:");
    for (i = 0; i < MAX_SUBJECTS; i++) {
        printf(" %i", s->grades[i]);
    }
    printf("\n\n");
    return;
}