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
        // o(n)
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(2);
        ll.addlast(1);
        ll.addinmiddle(2, 3);
        // System.out.println("The size Of Linked List is "+ ll.size);
        // ll.removefirst();
        // ll.removelast();
        // ll.printlinklist();
        //System.out.println(ll.toString());
        // ll.revrsell();
        // ll.printlinklist();
        // // System.out.println(ll.search(3));
        // // System.out.println(ll.searchrecursion(3));
        // ll.removefromlast(3);
        // ll.printlinklist();
        System.out.println(ll.chekpalindrome());

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
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("Linked List is Already Empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Previous = size - 2;
        Node previous = head;
        for (int i = 0; i < size - 2; i++) {
            previous = previous.next;

        }
        int val = previous.next.data;
        previous.next = null;
        tail = previous;
        size--;
        return val;

    }

    public int search(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            } else {
                temp = temp.next;
                index++;

            }
        }
        return -1;
    }

    public int searchrecursion(int key) {
        return helper(head, key);

    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public void revrsell() {
        // 3 Variables and 4 Step Remmber o(n)
        Node cureent = tail = head;
        Node next;
        Node previous = null;

        while (cureent != null) {
            next = cureent.next;
            cureent.next = previous;
            previous = cureent;
            cureent = next;
        }
        head = previous;
    }

    public void removefromlast(int n) {
        // N Is Node Index Where I Need To remove From Last
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next;
            return;
        }
        // size - n
        int i = 1;
        int tofind = size - n;
        Node privious = head;
        while (i < tofind) {
            privious = privious.next;
            i++;
        }
        privious.next = privious.next.next;
        return;
    }

    public boolean chekpalindrome(){
        if (head == null  || head.next == null) {
            return true;
        }
        //find mid
        Node mid =  findmiddle(head);
        //Revrse Second Half
        Node prev = null;
        Node curr = mid;
        Node next ;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left =  head;


        //Chek The left Half And Right Half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
        
 }
       

    
    public Node findmiddle(Node head)
    {
             Node slow = head;
         Node fast = head;
         while (fast != null  && fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;
         }
        return slow;
    }
    

}
