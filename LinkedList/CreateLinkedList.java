import java.util.LinkedList;

public class CreateLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static void main(String[] args) {
        CreateLinkedList ll = new CreateLinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        ll.addinmiddle(2, 3);
        // System.out.println("The size Of Linked List is "+ ll.size);
        ll.removefirst();
        ll.removelast();
        ll.printlinklist();

    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;// Link A New Node TO Head
        head = newNode;
    }

    public void addlast(int data) {
        Node newmNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newmNode;
            return;
        }
        tail.next = newmNode;
        tail = newmNode;
    }

    public void printlinklist() {
        // o(n)
        if (head == null) {
            System.out.print("Linked List Is Empty");
            return;
        }
        System.out.println();
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;

        }
        System.out.println("Null");
    }

    public void addinmiddle(int index, int data) {
        if (index == 0) {
            addfirst(9);
            return;
        }
        // O(n)
        Node newnNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {

            temp = temp.next;
            i++;

        }
        newnNode.next = temp.next;
        temp.next = newnNode;

    }

    public int removefirst() {
        if (size == 0) {
            System.out.println("Linked List Is Already Empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if (size==0) {
            System.out.println("Linked List is Already Empty");
            return Integer.MAX_VALUE;
        }else if (size==1) {
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
       
        //Previous = size - 2;
        Node previous = head;
        for (int i = 0; i < size-2; i++) {
            previous = previous.next;

        }
         int val = previous.next.data;
        previous.next = null;
        tail = previous;
        size--;
        return val;

    }

}