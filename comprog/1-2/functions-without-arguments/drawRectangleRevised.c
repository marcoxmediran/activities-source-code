/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

#define width 16
#define height 5

// Function Prototypes
void drawParallel();
void drawBase();
void drawRectangle();

int main(void) {
    drawRectangle();
    return 0;
}

void drawParallel() {
    for (int i = 0; i < height - 2; i++) {
        printf("#");
        for (int i = 0; i < width - 2; i++) {
            printf(" ");
        }
        printf("#");
        printf("\n");
    }
}

void drawBase() {
    for (int i = 0; i < width; i++) {
        printf("#");
    }
    printf("\n");
}

void drawRectangle() {
    drawBase();
    drawParallel();
    drawBase();
}