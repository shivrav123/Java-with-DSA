//stack using array list

// import java.util.ArrayList;

// public class StackB {
//     public static class Stack {
//         static ArrayList<Integer> list = new ArrayList<>();

//         //for empty elements
//         public static boolean isEmpty() {
//             return list.size() == 0;
//         }

//         //push
//         public static void push(int data) {
//             list.add(data);
//         }

//         //pop
//         public static int pop() {
//             if(isEmpty()) {
//                 return -1;
//             }

//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 return -1;
//             }

//             return list.get(list.size() - 1);
//         }
//     }
//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());  //stare down to look the first element
//             s.pop(); //then delete it
//         }
//     }
// }



//Stack using linkedlist  //amazon

// public class StackB {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static class Stack {
//         static Node head;   //creation of head as a null

//         //for empty
//         public static boolean isEmpty() {
//             return head == null;
//         }

//         //for push
//         public static void push(int data) {
//             Node newNode = new Node(data); //node creation

//             if(isEmpty()) {
//                 head = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         //for pop
//         public static int pop() {
//             if(isEmpty()) {
//                 return - 1;
//             }

//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         //for peek
//         public static int peek() {
//             if(isEmpty()) {
//                 return - 1;
//             }

//             return head.data;
//         }
//     }
//     public static void main(String args[]) {
//         Stack s = new Stack();

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }



//Stack using collection framework

// import java.util.*;

// public class StackB {
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }




//push at bottom of stack 0(n) amazon

// import java.util.*;

// public class StackB {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         pushAtBottom(s, 4);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }



//Reverse a String using a Stack  //microsoft, amozon, adobe, paytm, flipkart

// import java.util.*;

// public class StackB {
//     public static String reverseString(String str) {
//         Stack<Character> s = new Stack<>();

//         for(int i = 0; i < str.length(); i++) {
//             s.push(str.charAt(i));
//         }

//         StringBuilder sb = new StringBuilder("");
//         while(!s.isEmpty()) {
//             char curr = s.pop();
//             sb.append(curr);
//         }

//         return sb.toString();
//     }
//     public static void main(String args[]) {   
//         String str = "abc";
//         String result = reverseString(str);
//         System.out.println(result);
//     }
// }



//reverse a stack 

// import java.util.*;

// public class StackB {

//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void reverseStack(Stack<Integer> s) {
//         if(s.isEmpty()) {
//             return;
//         }
//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s,top);
//     }

//     public static void printStack(Stack<Integer> s) {
//         while(!s.isEmpty()) {
//             System.out.println(s.pop());
//         }
//     }
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         reverseStack(s);
//         printStack(s);
//     }
// }



//Stock span problem

// import java.util.Stack;

// public class StackB {
//     public static void stockSpan(int stocks[], int span[]) {
//         Stack<Integer> s = new Stack<>();
//         span[0] = 1; //first stock span will always be 1 as it is the first and none stock is before this
//         s.push(0); //we will push the index of the stocks in the span for comaparing of greater stocks and lower stocks.

//         for(int i = 1; i < stocks.length; i++) {
//             int currPrice = stocks[i];

//             while(!s.isEmpty() && currPrice >= stocks[s.peek()]) {
//                 s.pop();
//             }
            
//             if(s.isEmpty()) {
//                 span[i] = i + 1;
//             } else {
//                 int prevHigh = s.peek();
//                 span[i] = i - prevHigh;
//             }

//             s.push(i);
//         }
//     }
//     public static void main(String args[]) {
//         int stocks[] = {100, 80, 60, 70, 60, 85, 100};
//         int span[] = new int[stocks.length];
//         stockSpan(stocks, span);

//         for(int i = 0; i < span.length; i++) {
//             System.out.println(span[i] + " ");
//         }
//     }
// }



//Next Greater Element

// import java.util.Stack;

// public class StackB {
//     public static void nextGreater(int arr[], int nextGreater[]) {
//         Stack<Integer> s = new Stack<>();

//         for(int i = arr.length - 1; i >= 0; i--) {
//             int currNumber = arr[i];

//             while(!s.isEmpty() && currNumber >= arr[s.peek()]) {
//                 s.pop();
//             }

//             if(s.isEmpty()) {
//                 nextGreater[i] = -1;
//             } else {
//                 nextGreater[i] = arr[s.peek()];
//             }
            
//             s.push(i);
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {6, 8, 0, 1, 3};
//         int nextGreater[] = new int[arr.length];
//         nextGreater(arr, nextGreater);

//         for(int i = 0; i < nextGreater.length; i++) {
//             System.out.print(nextGreater[i] + " ");
//         }
//     }
// }



//valid parenthesis

// import java.util.Stack;

// public class StackB {
//     public static boolean isValid(String str) {

//         Stack<Character> s = new Stack<>();
        
//         for(int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             //opening
//             if(ch == '(' || ch == '{' || ch == '[') {
//                 s.push(ch);
//             } else {
//                 if(s.isEmpty()) {   //closing
//                     return false;
//                 }

//                 if(s.peek() == '(' && ch == ')' 
//                 || (s.peek() == '{' && ch == '}')
//                 || (s.peek() == '[' && ch == ']')) {
//                     s.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         if(s.isEmpty()) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//     public static void main(String args[]) {
//         String str = "({[]})";
//         System.out.println(isValid(str));
//     }
// }



//Duplicate Parenthesis

// import java.util.Stack;

// public class StackB {
//     public static boolean isDuplicate(String str) {
//         Stack<Character> s = new Stack<>();

//         for(int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             //closing
//             if(ch == ')') {
//                 int count = 0;

//                 while(s.peek() != '(') {   //it is valid string so no need to !s.isEmpty();
//                     s.pop();
//                     count++;
//                 }

//                 if(count < 1) {
//                     return true;  //duplicate
//                 } else {
//                     s.pop();  //opening pair
//                 }
//             } else {
//                 //opening 
//                 s.push(ch);
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]) {
//         //valid string
//         String str = "((a+b))"; //true
//         String str2 = "(a-b)";  //false
//         System.out.println(isDuplicate(str2));
//     }
// }




//Max area in histogram (using the logic of next greater)

import java.util.*;
public class StackB{
    public static void maxArea(int arr[]) {

        int maxArea = 0; 
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        
        //next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--) {
            int currNumber = arr[i];

            while(!s.isEmpty() && currNumber <= arr[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }

            s.push(i);
        }
        
        //next smaller left
         s = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            int currNumber = arr[i];

            while(!s.isEmpty() && currNumber <= arr[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // current area  :width = j-i-1 = nsr[i] - nsl[i] - 1
        for(int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("max area is " + maxArea);

    }
    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3}; //heights in histogram
        maxArea(arr);
    }
}

