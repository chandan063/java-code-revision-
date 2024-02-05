

public class LL2 {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void add(int idx, int data) {
        Node newNode = new Node(data);

        if (idx == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int i = 0;

        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL2 ll = new LL2();
        ll.add(0, 1);
        ll.print();
        ll.add(0, 2);
        ll.add(0, 3);
        ll.add(0, 4);
        ll.add(2, 9);

        ll.print();
    }
}
