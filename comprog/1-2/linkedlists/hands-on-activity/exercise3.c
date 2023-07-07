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
int removeNode(int value);
void printNodes(void);
int get_int(char *message);
int getCheckSize(void);
void getMedian(int check_size);

int main(void) {
    // declare variables and take input
    int size = get_int("Enter the number of nodes: ");
    int i;

    // main loop
    for (i = 0; i < size; i++) {
        printf("Enter value for node %i: ", i + 1);
        addNode(get_int(""));
    }
    getMedian(getCheckSize());

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

int getCheckSize(void) {
    int check_size = 0;
    node *current = head;
    while (current != NULL) {
        check_size += 1;
        current = current->next;
    }
    check_size /= 2;
    check_size += 1;
    return check_size;
}

void getMedian(int check_size) {
    node *current = head;
    int i, iterations;
    for (i = 0, iterations = check_size - 1; i < iterations; i++) {
        current = current->next;
    }
    printf("The median of the linked list is %i\n", current->value);
    return;
}