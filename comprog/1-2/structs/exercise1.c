/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>
#include <string.h>

// global variables
#define MAX_LENGTH 50

typedef struct {
    char first_name[MAX_LENGTH];
    char last_name[MAX_LENGTH];
} full_name;

typedef struct {
    int id;
    full_name name;
    int total_units;
    float average_grade;
} student;

int main(void) {
    // declare variables
    student a = {10001, {"Marcox", "Mediran"}, 25, 1.12};
    student b;
    b.id = 10010;
    strcpy(b.name.first_name, "David");
    strcpy(b.name.last_name, "Malan");
    b.total_units = 24;
    b.average_grade = 1.01;

    // demo
    printf("Student %i is %s %s with  an average grade of %.2f for %i units.\n", \
    a.id, a.name.first_name, a.name.last_name, a.average_grade, a.total_units);
    printf("Student %i is %s %s with  an average grade of %.2f for %i units.\n", \
    b.id, b.name.first_name, b.name.last_name, b.average_grade, b.total_units);

    // program ran successfully
    return 0;
}