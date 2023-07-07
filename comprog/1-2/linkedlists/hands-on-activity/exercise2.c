/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise 2
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// global variables
typedef struct llist {
    int value;
    struct llist *next;
} node;

node *head = NULL;

// function prototypes
node *addNode(int value);
int removeNode(int value);
void removeDuplicates(void);
void printNodes(void);
int get_int(char *message);

int main(void) {
    // declare variables and take input
    addNode(0);
    addNode(1);
    addNode(3);
    addNode(3);
    addNode(2);
    addNode(3);
    addNode(2);

    // solution
    printf("The original linked list:\n");
    printNodes();
    printf("\nThe altered linked list after removing duplicates:\n");
    removeDuplicates();
    printNodes();

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

void removeDuplicates(void) {
    node *current = head;
    node *iteration = NULL;
    node *temp = NULL;
    while (current != NULL) {
        temp = current;
        iteration = current->next;
        while (iteration != NULL) {
            if (current->value == iteration->value) {
                temp->next = iteration->next;
            }
            else {
                temp = iteration;
            }
            iteration = iteration->next;
        }
        current = current->next;
    }
    return;
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