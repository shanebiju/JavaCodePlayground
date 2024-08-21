class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;
        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void addInBetween(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        if (prevNode.next != null) {
            prevNode.next.prev = newNode;
        }
        prevNode.next = newNode;
    }

    public void append(int newData) {
        Node newNode = new Node(newData);
        Node last = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(6);
        list.push(7);
        list.push(1);
        list.append(4);
        list.addInBetween(list.head.next, 8);
        System.out.println("Created Doubly Linked list is: ");
        list.printList();
    }
}

