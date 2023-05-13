/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>
#include <math.h>

// Function Prototypes
void getChoice(int *choice);
void calculate(int choice);

int main(void) {
    // declare variables and take input
    int choice;
    getChoice(&choice);

    // run calculations
    calculate(choice);

    // program ran successfully
    return 0;
}

void getChoice(int *choice) {
    // print prompt and take input
    // this function uses pointers to change the value of a variable from the main function
    int a;
    printf("Select the shape to calculate the area of:\n");
    printf("1. Rectangle\n");
    printf("2. Circle\n");
    printf("3. Triangle\n");
    printf("4. Square\n");
    printf("Enter your choice: ");
    scanf("%d", &a);
    *choice = a;
}

void calculate(int choice) {
    // for this solution, I chose to use a switch statement
    switch (choice) {
        case 1:
            // rectangle case
            int length, width, rectangleArea;
            printf("Enter the length of the rectangle: ");
            scanf("%d", &length);
            printf("Enter the width of the rectangle: ");
            scanf("%d", &width);
            rectangleArea = length * width;
            printf("The area of the rectangle is %i.\n", rectangleArea);
            break;
        case 2:
            // circle case
            const float PI = 3.1416;
            float radius, circleArea;
            printf("Enter the radius of the circle: ");
            scanf("%f", &radius);
            circleArea = PI * pow(radius, 2);
            printf("The area of the circle is %.2f.\n", circleArea);
            break;
        case 3:
            // triangle case
            int base, height;
            float triangleArea;
            printf("Enter the base of the triangle: ");
            scanf("%d", &base);
            printf("Enter the height of the triangle: ");
            scanf("%d", &height);
            triangleArea = base * height / 2;
            printf("The area of the triangle is %.2f.\n", triangleArea);
            break;
        case 4:
            // square case
            int side, squareArea;
            printf("Enter the side of the square: ");
            scanf("%d", &side);
            squareArea = pow(side, 2);
            printf("The area of the square is %i\n", squareArea);
            break;
        default:
            printf("Invalid choice.\n");
            break;
    }
}