/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise 1
*/

#include <stdio.h>
#include <stdlib.h>

// global variables
typedef struct llist {
    int value;
    struct llist *next;
} node;

node *head = NULL;

// function prototypes
node *addNode(int value);
int removeNode(int value);
void printNodes(void);
int get_int(char *message);

int main(void) {
    // declare variables and take input

    // program ran successfully
    return 0;
}

node *addNode(int value) {
    node *new = NULL;
    if (head == NULL) {
        new = malloc(sizeof(node));
        if (new == NULL) {
            return NULL;
        }
        new->value = value;
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
    while (current != NULL) {
        printf("Data = %d\n", current->value);
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