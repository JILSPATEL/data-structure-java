package practice;

public class LinkedList1 {

    node head;
    private int size;

    LinkedList1() {
        this.size = 0;
    }

    class node {

        node next;
        String data;

        node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add-first
    public void addFirst(String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add-last
    public void addLast(String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print list
    public void printList() {
        node currNode = head;

        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        node secondLast = head;
        node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println("Size of List Is :" + list.getSize());
        list.addFirst("First");
        System.out.println("Size Of List Is :" + list.getSize());
    }

}
