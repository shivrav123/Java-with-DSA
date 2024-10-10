public class DoubleLL {
    public static class Node {
        int data;
        Node next;
        Node prev;   //extra added

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add in doubly ll
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;  //extra added
        head = newNode;
    }

    //remove
    public int removeFirst() {

        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;  //extra
        size--;
        return val;
    }

    public void print() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;  //extra line added
            prev = curr;
            curr = next;
        }

        head = prev;
    }
    public static void main(String args[]) {
        DoubleLL ll = new DoubleLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.print();
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);
        ll.reverse();
        ll.print();

    }
}
