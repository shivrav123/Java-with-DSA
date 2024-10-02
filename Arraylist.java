//basics of arraylist

import java.util.*;

public class Arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //add operation
        list.add(1);   //0(1)
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(1, 3);  //0(n)
        System.out.println(list);

        //get operation
        System.out.println(list.get(0));  //0(1)
        System.out.println(list.get(2));

        //remove
        list.remove(1);   //0(n)
        System.out.println(list);

        //set
        list.set(1,4);  //0(n)
        System.out.println(list);  

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(5));

        //size
        System.out.println(list.size());
     }
}   



//print reverse of an arraylist

import java.util.ArrayList;

public class ArrayList0 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //reverse an array
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}



//maximum in an arraylist

import java.util.ArrayList;

import javax.print.DocFlavor.INPUT_STREAM;
public class ArrayList0 {
    public static void main(String args[]) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++) {
            // if(largest < list.get(i)) {
            //     largest = list.get(i);
            // }

             largest= Math.max(largest, list.get(i));
        }
        System.out.println("largest number is " + largest);
    }
}



//swap 2 numbers

import java.util.ArrayList;
public class ArrayList0 {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        // System.out.println(list);
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); 
        list.add(5); 
        list.add(9); 
        list.add(3); 
        list.add(6);

        int idx1 = 1, idx2 = 3;
        System.out.println(list);  //before swapping
        swap(list, idx1, idx2);
        System.out.println(list);   //after swapping
    }
}



//sorting an arraylist

// import java.util.ArrayList;
// import java.util.Collections;  //import this class
import java.util.*;  //imported all the classes

public class Arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(6);
        System.out.println(list);
        Collections.sort(list); //ascending order  //not collection (collections)
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
        
    }
}




//Multidimensional arraylist creation

import java.util.*;

public class Arraylist {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();  //for multidimensional arraylist
        ArrayList<Integer> list1 = new ArrayList<>();  //for child array 1
        ArrayList<Integer> list2 = new ArrayList<>();  //for child array 2
        
        list1.add(1);  //adding elements in array 1
        list1.add(2);
        list1.add(3);
        mainList.add(list1);

        list2.add(4); //adding elements in array 2
        list2.add(5);
        list2.add(6);
        mainList.add(list2);

        for(int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currentList = mainList.get(i);  //for the elements of mainlist
            for(int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");  //for the elements of childlist 
            }
            System.out.println();
        }
    }
}



//question for better understanding

import java.util.*;

public class Arraylist {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        } 

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);  //mainList array

        for(int i = 0; i < mainList.size(); i++) {  //list 1 , list 2 and list 3 array
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
    }
}



//Container with most water (brute force) 0(n^2) time complexity

import java.util.*;

public class Arraylist {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        for(int i = 0; i < height.size(); i++) {
            for(int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currentWater = ht * width;
                maxWater = Math.max(maxWater, currentWater);
            }
        }
        return maxWater;
    }
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}



//Container with most water (optamized code) (2 pointer approach) 0(n) time complexity

import java.util.*;

public class Arraylist{
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int leftPointer = 0;
        int rightPointer = height.size() - 1;

        while(leftPointer < rightPointer) {
            int hgt = Math.min(height.get(leftPointer), height.get(rightPointer));
            int width = rightPointer - leftPointer;
            int currentWater = hgt * width;
            maxWater = Math.max(maxWater, currentWater);

            if(height.get(leftPointer) < height.get(rightPointer)) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        
        return maxWater;
    }
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}



//Pair Sum 1  (brute force) time complexity will be 0(n^2)

import java.util.*;

public class Arraylist {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for(int i = 0; i < list.size() - 1; i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if((list.get(i) + list.get(j)) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 11;
        System.out.println(pairSum1(list, target));
    }
}



//pair sum 1 (2 pointer approach) time complexity is 0(n) optamized course

import java.util.*;

public class Arraylist{
    public static boolean printSum(ArrayList<Integer> list, int target) {
        int leftPointer = 0; 
        int rightPointer = list.size() - 1;

        while(leftPointer < rightPointer) {
            //case 1
            if(list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            }

            //case 2 
            if(list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer++;
            } 
            
            //case 3
            else {
                rightPointer--;
            }
        }

        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 10;
        System.out.println(printSum(list, target));
    }
}



//pair sum 2 (2 pointer approach) time complexity is 0(n) optamized course

import java.util.*;

public class Arraylist {
    public static boolean pairSum2 (ArrayList<Integer> list, int target) {
        int breakingPoint = -1;
        for(int i = 0; i < list.size(); i++) {   //breaking point
            if(list.get(i) > list.get(i + 1)) {
                breakingPoint = i;
                break;
            }
        }

        int rightPointer = breakingPoint;  //greatest
        int leftPointer = breakingPoint + 1;  //smallest
        int n = list.size();

        while(leftPointer != rightPointer) {
            //case 1
            if(list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            }

            //case 2
            if(list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer = (leftPointer + 1) % n;
            } 

            //case 3
            else {
                rightPointer = (n + rightPointer - 1) % n;
            }
        }

        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 35;
        
        System.out.println(pairSum2(list, target));
    }
}
