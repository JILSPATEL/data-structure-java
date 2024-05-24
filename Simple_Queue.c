/* Queue Implementation Using Array */

#include <stdio.h>
#include <conio.h>
#define SIZE 5

int queue[SIZE];
int front = -1;
int rear = -1;

void enQueue(int element)
{
    if (rear == SIZE - 1)
    {
        printf("Overflow\n");
        return;
    }
    if (front == -1)
    {
        front = rear = 0;
    }
    else
    {
        rear = rear + 1;
    }
    queue[rear] = element;
}

int deQueue()
{
    int temp;
    if (front == -1)
    {
        printf("Underflow\n");
        return -1;
    }
    else if (front == rear)
    {
        temp = queue[front];
        front = rear = -1;
    }
    else
    {
        temp = queue[front];
        front = front + 1;
    }
    return temp;
}

void printQueue()
{
    if (front == -1)
    {
        printf("Queue is empty\n");
        return;
    }
    for (int i = front; i <= rear; i++)
    {
        printf("%d ", queue[i]);
    }
    printf("\n");
}

void main()
{
    int option, value, deletedElement;
    while (1)
    {
        printf("\n1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Print Queue\n");
        printf("4. Exit\n");
        printf("Enter Your Option: ");
        scanf("%d", &option);

        switch (option)
        {
        case 1:
            printf("Enter element to enqueue: ");
            scanf("%d", &value);
            enQueue(value);
            break;
        case 2:
            deletedElement = deQueue();
            if (deletedElement != -1)
            {
                printf("Deleted Element: %d\n", deletedElement);
            }
            break;
        case 3:
            printQueue();
            break;
        case 4:
            return;
        default:
            printf("Invalid option\n");
        }
    }
}

