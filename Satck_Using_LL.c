#include <stdio.h>
#include <stdlib.h>

// Define the node structure
struct node {
    int data;
    struct node *next;
};

// Function to insert a node at the beginning
void insertAtBeg(struct node **head, int e) {
    struct node *temp = malloc(sizeof(struct node));

    if (temp == NULL) {
        printf("Memory allocation failed\n");
        return;
    }

    temp->data = e;
    temp->next = *head;
    *head = temp;
}

// Function to print the linked list
void printList(struct node *node) {
    while (node != NULL) {
        printf("%d -> ", node->data);
        node = node->next;
    }
    printf("NULL\n");
}

// Function to delete the top element from the stack (the head of the list)
void deleteTop(struct node **head) {
    if (*head == NULL) {
        printf("Stack is empty\n");
        return;
    }

    struct node *temp = *head;
    *head = (*head)->next;
    free(temp);
}

int main() {
    int c, e;
    struct node *head = NULL;

    while (1) {
        printf("\nMenu:\n");
        printf("1. Insert element\n");
        printf("2. Print stack\n");
        printf("3. Delete top element from stack\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &c);

        switch (c) {
            case 1:
                printf("Enter element which you want to insert: ");
                scanf("%d", &e);
                insertAtBeg(&head, e);
                break;
            case 2:
                printf("Linked list: ");
                printList(head);
                break;
            case 3:
                deleteTop(&head);
                break;
            case 4:
                printf("Exiting...\n");
                exit(0);
            default:
                printf("Invalid choice! Please try again.\n");
        }
    }

    return 0;
}
