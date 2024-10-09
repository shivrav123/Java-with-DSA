//for creating a single node

public class LinkedList {
    public static class Node {     //node class creation
        int data;   //property 1
        Node next;  //property 2

        public Node(int data) {    //construction
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]) {

    }
}



//for creating head and tail (add first and last node)

public class LinkedList {
    public static class Node {     
        int data;  
        Node next;

        public Node(int data) {    
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;   //property 1
    public static Node tail;   //property 2

    public void addFirst(int data) {
        //step 1 = create a new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step 2 = newNode next = head
        newNode.next = head; //LInk

        //step 3 == head = newNode
        head = newNode; 
    }

    public void lastAdd(int data) {
        Node newNode = new Node(data);
        
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList(); //object creation

        ll.addFirst(1);
        ll.addFirst(2);
        ll.lastAdd(3);
        ll.lastAdd(4);

    }
}




print a linked list

public class LinkedList {
        public static class Node {     
            int data;  
            Node next;
    
            public Node(int data) {    
                this.data = data;
                this.next = null;
            }
        }
    
        public static Node head;   //property 1
        public static Node tail;   //property 2
    
        public void addFirst(int data) {
            //step 1 = create a new node
            Node newNode = new Node(data);
    
            if(head == null) {
                head = tail = newNode;
                return;
            }
    
            //step 2 = newNode next = head
            newNode.next = head; //LInk
    
            //step 3 == head = newNode
            head = newNode; 
        }
    
        public void lastAdd(int data) {
            Node newNode = new Node(data);
            
            if(head == null) {
                head = tail = newNode;
                return;
            }
    
            tail.next = newNode;
    
            tail = newNode;
        }

        public void print() {
            // if(head == null) {
            //     System.out.println("LL is empty");
            //     return;
            // }

            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    
        public static void main(String args[]) {
            LinkedList ll = new LinkedList(); //object creation
            
            ll.print();

            ll.addFirst(2);
            ll.print();

            ll.addFirst(1);
            ll.print();

            ll.lastAdd(3);
            ll.print();

            ll.lastAdd(4);
            ll.print();
        }
    }



add in the middle

public class LinkedList {
        public static class Node {     
            int data;  
            Node next;
    
            public Node(int data) {    
                this.data = data;
                this.next = null;
            }
        }
    
        public static Node head;   //property 1
        public static Node tail;   //property 2
    
        public void addFirst(int data) {
            //step 1 = create a new node
            Node newNode = new Node(data);
    
            if(head == null) {
                head = tail = newNode;
                return;
            }
    
            //step 2 = newNode next = head
            newNode.next = head; //LInk
    
            //step 3 == head = newNode
            head = newNode; 
        }
    
        public void lastAdd(int data) {
            Node newNode = new Node(data);
            
            if(head == null) {
                head = tail = newNode;
                return;
            }
    
            tail.next = newNode;
    
            tail = newNode;
        }

        public void print() {
            // if(head == null) {
            //     System.out.println("LL is empty");
            //     return;
            // }

            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void addInMiddle(int idx, int data) {    //add in middle

            if(idx == 0) {               //for 0th index (base case)
                addFirst(data);
                return;
            }

            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;

            while(i < idx - 1) {
                temp = temp.next;
                i++;
            }

            //i == idx - 1; temp = prev
            newNode.next = temp.next;
            temp.next = newNode;
        }
    
        public static void main(String args[]) {
            LinkedList ll = new LinkedList(); //object creation
            
            ll.print();

            ll.addFirst(2);
            ll.print();

            ll.addFirst(1);
            ll.print();

            ll.lastAdd(3);
            ll.print();

            ll.lastAdd(4);
            ll.print();

            ll.addInMiddle(2, 9);
            ll.print();

        }
    }



size of a linked list

public class LinkedList {
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
    public static int size; //size var

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;  //1st

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;     //2nd

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

    public void addInMiddle(int idx, int data) {

        if(idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;     //3rd

        Node temp = head;
        int i = 0;

        while(i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addInMiddle(3, 4);
        ll.print();
        
        System.out.println(ll.size);  //size
    
    }
}



remove first

public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

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

    public void addInMiddle(int idx, int data) {

        if(idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        
        for(int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {

        //if size is 0 then
        if(size == 0) {                          
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } 

        else if(size == 1) {     //when head and tail are same
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        int value = head.data; 
        head = head.next;  //remove
        size --;
        return value;
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addInMiddle(3, 4);
        ll.print();

        ll.removeFirst();   //remove first
        ll.print();
        System.out.println(ll.size);
    }
}




remove last

public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

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

    public void addInMiddle(int idx, int data) {

        if(idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        
        for(int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {

        //if size is 0 then
        if(size == 0) {                          
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } 

        else if(size == 1) {     //when head and tail are same
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        int value = head.data; 
        head = head.next;  //remove
        size --;
        return value;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        for(int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        int val = tail.data;  //int val = temp.next.value
        temp.next = null; 
        tail = temp;
        size--;
        return val;
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addInMiddle(3, 4);
        ll.print();

        ll.removeFirst();   //remove first
        ll.print();
        System.out.println(ll.size);

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}



Search (Iterative)

public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
        }

        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
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

    public void addInMiddle(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        
        Node temp = head;
        Node newNode = new Node(data);
        size++;
        

        for(int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {

        if(size == 0) {
            System.out.println("LL is null");
            return Integer.MIN_VALUE;
        }

        else if(size == 1) {
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

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }


        Node temp = head;

        for(int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }

    public int search(int key) {
        Node temp = head;
        int i = 0;
        
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return - 1;
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();

        ll.addInMiddle(1, 3);
        ll.print();

        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

        System.out.println(ll.search(2));
        System.out.println(ll.search(4));
    }
}



Search (recursive)

public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
        }

        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
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

    public void addInMiddle(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        
        Node temp = head;
        Node newNode = new Node(data);
        size++;
        

        for(int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {

        if(size == 0) {
            System.out.println("LL is null");
            return Integer.MIN_VALUE;
        }

        else if(size == 1) {
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

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }


        Node temp = head;

        for(int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }

    public int search(int key) {
        Node temp = head;
        int i = 0;
        
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return - 1;
    }

    public int helper(Node head, int key) {
        //base case
        if(head == null) {
            return - 1;
        }

        //work
        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == - 1) {
            return - 1;
        }
        
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();

        ll.addInMiddle(1, 3);
        ll.print();

        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

        // System.out.println(ll.search(2));
        // System.out.println(ll.search(4));

        
         System.out.println(ll.recSearch(2));
         System.out.println(ll.recSearch(8));
    }
}




reverse a linked list 

public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
        }

        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
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

    public void addInMiddle(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        
        Node temp = head;
        Node newNode = new Node(data);
        size++;
        

        for(int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {

        if(size == 0) {
            System.out.println("LL is null");
            return Integer.MIN_VALUE;
        }

        else if(size == 1) {
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

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }


        Node temp = head;

        for(int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }

    public int search(int key) {
        Node temp = head;
        int i = 0;
        
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return - 1;
    }

    public int helper(Node head, int key) {
        //base case
        if(head == null) {
            return - 1;
        }

        //work
        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == - 1) {
            return - 1;
        }
        
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;   // or Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();

         ll.print();
         ll.reverse();
         ll.print();
    }
}




Find and remove nth node from end

public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
        }

        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
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

    public void addInMiddle(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        
        Node temp = head;
        Node newNode = new Node(data);
        size++;
        

        for(int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {

        if(size == 0) {
            System.out.println("LL is null");
            return Integer.MIN_VALUE;
        }

        else if(size == 1) {
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

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }


        Node temp = head;

        for(int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }

    public int search(int key) {
        Node temp = head;
        int i = 0;
        
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return - 1;
    }

    public int helper(Node head, int key) {
        //base case
        if(head == null) {
            return - 1;
        }

        //work
        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == - 1) {
            return - 1;
        }
        
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;   // or Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {  //n = node to delete
        
        //calculate size for this (not necessary to do but what if u just have to solve this sum only)
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        //what if the question is asked to delete the head only
        if(n == size) {  // as size is 5 and 5 is head from tail(end)
            head = head.next;  //remove first method only like prevous
            return;
        }

        //otherwise

        Node temp1 = head;
        for(int node = 1; node < size - n; node++) {
            temp1 = temp1.next;
        }

        temp1.next = temp1.next.next;
        return;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();

        ll.deleteNthfromEnd(3);
        ll.print();
        
    }
}





//check if a ll is palindrome or not

public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
        }

        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
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

    public void addInMiddle(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        
        Node temp = head;
        Node newNode = new Node(data);
        size++;
        

        for(int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {

        if(size == 0) {
            System.out.println("LL is null");
            return Integer.MIN_VALUE;
        }

        else if(size == 1) {
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

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }


        Node temp = head;

        for(int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }

    public int search(int key) {
        Node temp = head;
        int i = 0;
        
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return - 1;
    }

    public int helper(Node head, int key) {
        //base case
        if(head == null) {
            return - 1;
        }

        //work
        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == - 1) {
            return - 1;
        }
        
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;   // or Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {  //n = node to delete
        
        //calculate size for this (not necessary to do but what if u just have to solve this sum only)
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        //what if the question is asked to delete the head only
        if(n == size) {  // as size is 5 and 5 is head from tail(end)
            head = head.next;  //remove first method only like prevous
            return;
        }

        //otherwise

        Node temp1 = head;
        for(int node = 1; node < size - n; node++) {
            temp1 = temp1.next;
        }

        temp1.next = temp1.next.next;
        return;
    }


    //slow fast approach (find mid)
    public Node findMid(Node head) {    
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
        }
        return slow;  //slow is my midNode
    }

    
    public boolean checkPalindrome() {
        //if ll is empty or ll has one node then
        if(head == null || head.next == null) {
            return true;
        }

        //step 1 - find mid
        Node midNode = findMid(head);

        //step 2 - reverse 2nd half (same code as previous)
        Node prev = null;
        Node curr = midNode; //just change in this as midNode because of 2nd half
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;  //left half head
        Node right = prev; //right half head (as curr reaches null and prev is on head)

        //step 3 - check left half and right half

        while(right != null) {
            if(left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();

        System.out.print(ll.checkPalindrome());
    }
}













