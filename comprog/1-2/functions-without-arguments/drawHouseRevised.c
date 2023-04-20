/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

#define width 20
#define height 5

// Function Prototypes
void drawCone();
void drawParallel();
void drawBase();
void drawRectangle();
void drawHouse();

int main(void) {
    drawHouse();
    return 0;
}

void drawCone() {
    int max_space = width / 2;
    int correction = max_space / height;
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < max_space - i * correction - 1; j++) {
            printf(" ");
        }
        printf("#");
        for (int j = 0; j < i * 2 * correction; j++) {
            printf(" ");
        }
        printf("#");
        printf("\n");
    }
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

void drawHouse() {
    drawCone();
    drawRectangle();
}