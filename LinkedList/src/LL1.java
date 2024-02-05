import java.util.*;
class LL1{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
//    creating head and tail
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
//        step-1 = create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step-2 newNode next=head
        newNode.next=head;//link

        //step-3 head=newNode
        head=newNode;
    }

    public void addLast(int data){
//        step-1 = create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
//    adding in between
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

//    for printing
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

    public void Add(int idx,int data){
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

    public int removeFirst(){
        int val= head.data;;
        head=head.next;
        return val;
    }
    public static void main(String []args){
    LL1 linkedList=new LL1();
//    linkedList.print();
    linkedList.addFirst(2);
//        linkedList.print();
    linkedList.addFirst(1);
//        linkedList.print();
    linkedList.addLast(3);
//        linkedList.print();
    linkedList.addLast(4);
//        linkedList.print();
//   linkedList.add(2,9);
   linkedList.Add(3,10);
   linkedList.print();
 linkedList.removeFirst();
 linkedList.print();

    }
}