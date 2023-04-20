/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

// Function Prototypes
void drawParallel();
void drawBase();
void drawRectangle();

int main(void) {
    drawRectangle();
    return 0;
}

void drawParallel() {
    printf("#      #\n");
    printf("#      #\n");
}

void drawBase() {
    printf("########\n");
}

void drawRectangle() {
    drawBase();
    drawParallel();
    drawBase();
}