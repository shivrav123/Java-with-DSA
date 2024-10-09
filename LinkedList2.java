
//Detect a loop/cycle in a linked list (floyd's cycle finding alogorithm) type 1

// public class LinkedList2 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public boolean isCycle() { 
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast == slow) {
//                 return true;  //cycle exist
//             }
//         }
//         return false; //cycle doesn't exist
//     }
//     public static void main(String args[]) {
//         LinkedList2 ll = new LinkedList2();

//         ll.head = new Node(1);
//         ll.head.next = new Node(2);
//         ll.head.next.next = new Node(3);
//         ll.head.next.next.next = ll.head;
//         //1->2->3->1

//         System.out.print(ll.isCycle());
//     }
// }




//Detect a loop/cycle in a linked list (floyd's cycle finding alogorithm) type 2

// public class LinkedList2 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public static boolean isCycle() {
//         Node fast = head;
//         Node slow = head;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast == slow) {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]) {
//         head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = head;

//         System.out.println(isCycle());
//     }
// }




//Remove a loop/cycle in a ll

// public class LinkedList2 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public static boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while(fast != null & fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void removeCycle() {
        
//         //detect cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if(fast == slow) {
//                 cycle = true;
//                 break;
//             }
//         }

//         if(cycle == false) {
//             return;
//         }

//         //find meeting point
//         slow = head; //make it slow again on head;
//         Node prev = null;  //last node
//         while(slow != fast) {
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         //remove cycle  -> last.next = null
//         prev.next = null;

//     }

//     public static void main(String args[]) {
//         head = new Node(1);
//         head.next = new Node(2);
//         Node temp = new Node(3);
//         head.next.next = temp;
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = temp;
//        // 1->2->3->4->3

//        System.out.println(isCycle());
//        removeCycle();
//        System.out.println(isCycle());

//     }
// }




//LL in collections framework

// import java.util.LinkedList;

// public class LinkedList2 {
//     public static void main(String args[]) {
//         //creation
//         LinkedList<Integer> ll = new LinkedList();

//         //add
//         ll.addFirst(1);
//         ll.addFirst(0);
//         ll.addLast(2);
//         ll.addLast(3);

//         //print
//         System.out.println(ll);

//         //remove

//         ll.removeFirst();
//         ll.removeLast();

//         System.out.println(ll);
//     }
// }




//merge sort on a linked list

// public class LinkedList2 { 
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public void addFirst(int data) {

//         Node newNode = new Node(data);

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {

//         Node newNode = new Node(data);


//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         Node temp = head;

//         while(temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public Node getMidNode(Node head) {
//         Node slow = head;
//         Node fast = head.next; //as middle is on the last node of first side

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;  // mid node
//     }

//     public Node merge(Node head1, Node head2) {
//         Node temp = new Node(-1);
//         Node tempPointer = temp;

//         while(head1 != null && head2 != null) {
//             if(head1.data <= head2.data) {
//                 temp.next = head1;
//                 head1 = head1.next;
//             } else {
//                 temp.next = head2;
//                 head2 = head2.next;
//             }
//             temp = temp.next;

//         }

//         while(head1 != null) {
//             temp.next = head1;
//             head1 = head1.next;
//             temp = temp.next;
//         }

//         while(head2 != null) {
//             temp.next = head2;
//             head2 = head2.next;
//             temp = temp.next;
//         }

//         return tempPointer.next;  //coz 1st node is dummy as it is -1;
//     }

//     public Node mergeSort(Node head) {

//         //base case
//         if(head == null || head.next == null) {
//             return head;
//         }

//         //find mid
//         Node midNode = getMidNode(head);

//         //left and right merge sort
//         Node rightHead = midNode.next;
//         midNode.next = null;   //seperates from right size after mid

//         Node newLeft = mergeSort(head);   //merge left side
//         Node newRight = mergeSort(rightHead);  // merge right side

//         //merge
//         return merge(newLeft, newRight);
//     }
//     public static void main(String args[]) {
//         LinkedList2 ll = new LinkedList2();
//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(3);
//         ll.addFirst(4);
//         ll.addFirst(5);

//         ll.print();
//         ll.head = ll.mergeSort(ll.head);
//         ll.print();
        
//     }
// }




//zig zag linked list

import java.util.LinkedList;

public class LinkedList2 {
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

    public void addFirst(int data) {

                Node newNode = new Node(data);
        
                if(head == null) {
                    head = tail = newNode;
                    return;
                }
        
                newNode.next = head;
                head = newNode;
            }
        
            public void addLast(int data) {
        
                Node newNode = new Node(data);
        
        
                if(head == null) {
                    head = tail = newNode;
                    return;
                }
        
                tail.next = newNode;
                tail = newNode;
            }
        
            public void print() {
                Node temp = head;
        
                while(temp != null) {
                    System.out.print(temp.data + "->");
                    temp = temp.next;
                }
                System.out.println("null");
            }
        

    public Node midNode(Node head) {
        Node slow = head;
        Node fast = head.next;   // fast on 2nd node

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void zigZag() {
        //find mid
        Node mid = midNode(head);

        //reverse 2nd half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;   //to disconnect the both linked list in right and left
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;   //for next node of left and right

        //zig zag merge
        while(right != null && left != null) {
            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String args[]) {
        LinkedList2 ll = new LinkedList2();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        // System.out.println(ll);
        
        ll.zigZag();

        ll.print();
    }
}