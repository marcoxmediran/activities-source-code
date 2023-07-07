/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise 1
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// global variables
#define MAX_LENGTH 50
typedef struct llist {
    int value;
    char *name;
    struct llist *next;
} node;

node *head = NULL;

// function prototypes
node *addNode(int value, char *name);
void printNodes(void);
void findHighest(void);
int get_int(char *message);

int main(void) {
    // declare variables and take input
    addNode(10, "Marcox");
    addNode(9, "David");
    addNode(10, "Mac");
    printNodes();
    findHighest();

    // program ran successfully
    return 0;
}

node *addNode(int value, char *name) {
    node *new = NULL;
    if (head == NULL) {
        new = malloc(sizeof(node));
        if (new == NULL) {
            return NULL;
        }
        new->value = value;
        new->name = name;
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
        new->name = name;
        new->next = NULL;
        current->next = new;
    }
    return new;
}

void printNodes(void) {
    node *current = head;
    while (current != NULL) {
        printf("%s = %d\n", current->name, current->value);
        current = current->next;
    }
    return;
}

void findHighest(void) {
    node *current = head;
    int highest = current->value;
    // find highest score
    while (current != NULL) {
        if (current->value > highest) {
            highest = current->value;
        }
        current = current->next;
    }

    // print all students with the highest scores
    current = head;
    printf("\nHere are the top scorers:\n");
    while (current != NULL) {
        if (current->value == highest) {
            printf("%s:%i points\n", current->name, current->value);
        }
        current = current->next;
    }

    return;
}

int get_int(char *message) {
    int i;
    printf("%s", message);
    scanf("%d", &i);
    return i;
}