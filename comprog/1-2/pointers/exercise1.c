/*
 * Marcox C. Mediran
 * BSCS1_4
*/

// Write a C program to demonstrate the use of
// & and * operators

#include <stdio.h>

// function prototypes
void printSeparator();

int main(void) {
    // declare variables and pointers
    int m = 300, *pm = &m;
    float fx = 300.600006, *pfx = &fx;
    char cht = 'z', *pcht = &cht;

    printf("Pointer: Demonstrate the use of & and * operator:\n");
    printSeparator();

    printf("Using & operator\n");
    printSeparator();
    printf("address of m = %x\n", &m);
    printf("address of fx = %x\n", &fx);
    printf("address of cht = %x\n", &cht);
    printf("\n");

    printf("Using & and * operator\n");
    printSeparator();
    printf("address of m = %i\n", *&m);
    printf("address of fx = %f\n", *&fx);
    printf("address of cht = %c\n", *&cht);
    printf("\n");

    printf("Using only pointer variable\n");
    printSeparator();
    printf("address of m = %x\n", pm);
    printf("address of fx = %x\n", pfx);
    printf("address of cht = %x\n", pcht);
    printf("\n");

    printf("Using only pointer operator\n");
    printSeparator();
    printf("address of m = %i\n", *pm);
    printf("address of fx = %f\n", *pfx);
    printf("address of cht = %c\n", *pcht);
    printf("\n");

    // program ran successfully
    return 0;
}

void printSeparator() {
    printf("-------------------------------------------------\n");
}