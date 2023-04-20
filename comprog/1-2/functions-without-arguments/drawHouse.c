/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

// Function Prototypes
void drawCone();
void drawParallel();
void drawBase();
void drawRectangle();

int main(void) {
    drawRectangle();
    return 0;
}

void drawCone() {
    printf("   ##   \n");
    printf("  #  #  \n");
    printf(" #    # \n");
    printf("#      #\n");
}

void drawParallel() {
    printf("#      #\n");
    printf("#      #\n");
}

void drawBase() {
    printf("########\n");
}

void drawRectangle() {
    drawCone();
    drawBase();
    drawParallel();
    drawBase();
}