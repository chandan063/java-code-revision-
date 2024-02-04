import java.util.*;
 class LL2 {

    public void add(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String []args){
    LL2 LinkedList=new LL2();
    LinkedList.addFirst(1);
    LinkedList.print();
    LinkedList.addFirst(2);
    LinkedList.addFirst(3);
    LinkedList.addFirst(4);
    LinkedList.add(2,9);

//    LinkedList.print();
    }
}