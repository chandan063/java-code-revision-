import java.util.LinkedList;

public class LL4 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // creating head and tail
    public static Node head;
    public static Node tail;

    public int iteSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(1);
        list.addFirst(9);
        System.out.println(list);
        System.out.println(list.iteSearch(3));
    }
}
