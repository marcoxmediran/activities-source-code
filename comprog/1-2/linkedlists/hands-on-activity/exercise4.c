/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise 4
*/

#include <stdio.h>
#include <stdlib.h>

// global variables
typedef struct llist {
    int value;
    struct llist *next;
} node;

node *head = NULL;
node *odd = NULL;
node *even = NULL;

// function prototypes
node *addNode(int value);
node *assignNode(int value);
void printNodes(void);
int get_int(char *message);

int main(void) {
    // declare variables and take input
    int size = get_int("Enter the number of nodes: ");
    int i;

    // main loop
    for (i = 0; i < size; i++) {
        printf("Enter integer for node %i: ", i + 1);
        addNode(get_int(""));
    }
    node *current = head;
    while (current != NULL) {
        assignNode(current->value);
        current = current->next;
    }

    // solution
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

node *assignNode(int value) {
    node *new = malloc(sizeof(node));
    if (new == NULL) {
        return NULL;
    }
    if (value % 2 == 1) {   // if odd
        if (odd == NULL) {
            new->value = value;
            odd = new;
            new->next = NULL;
        } else {
            node *current = odd;
            while (current->next != NULL) {
                current = current->next;
            }
            new->value = value;
            new->next = NULL;
            current->next = new;
        }
    } else {               // else, even
        if (even == NULL) {
            new->value = value;
            even = new;
            new->next = NULL;
        } else {
            node *current = even;
            while (current->next != NULL) {
                current = current->next;
            }
            new->value = value;
            new->next = NULL;
            current->next = new;
        }
    }
    return new;
}

void printNodes(void) {
    node *current = NULL;
    printf("Odd Linked List:\n");
    current = odd;
    while (current != NULL) {
        printf("Data = %d\n", current->value);
        current = current->next;
    }
    printf("Even Linked List:\n");
    current = even;
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