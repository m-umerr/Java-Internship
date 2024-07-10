package Collections;

public class LinkedListSorting {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void sortList() {
        Node current;
        Node index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                }
            }
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListSorting sList = new LinkedListSorting();

        sList.addNode(4);
        sList.addNode(23);
        sList.addNode(1);
        sList.addNode(40);
        sList.addNode(5);
        sList.addNode(19);
        sList.addNode(25);
        sList.addNode(3);
        sList.addNode(9);
        sList.addNode(12);

        System.out.println("Original list:");
        sList.display();

        sList.sortList();

        System.out.println("Sorted list:");
        sList.display();
    }
}
