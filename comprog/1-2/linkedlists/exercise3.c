/*
 * Marcox C. Mediran
 * BSCS1_4
 * Exercise 3
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
void printNodes(void);
int get_int(char *message);
int countNodes(void);

int main(void) {
    // declare variables and take input
    int size = get_int("Input the number of nodes: ");
    int i;

    // main loop
    for (i = 0; i < size; i++) {
        printf("Input data for node %i: ", i + 1);
        addNode(get_int(""));
    }

    // print linked list
    printf("Data entered in list:\n");
    printNodes();

    // count total nodes
    printf("\nTotal number of nodes = %i\n", countNodes());

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

int countNodes(void) {
    int count = 0;
    node *current = head;
    while (current != NULL) {
        count += 1;
        current = current->next;
    }
    return count;
}