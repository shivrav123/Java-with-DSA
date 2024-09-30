
// input and output

// import java.util.Scanner;

// public class Arrays {
//     public static void main(String args[]) {
//         int marks[] = new int [50];

//         Scanner sc = new Scanner(System.in);

//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         System.out.println("marks of maths is " + marks[0]);
//         System.out.println("marks of science is " + marks[1]);
//         System.out.println("marks of history is " + marks[2]);

//         marks[1] = 100;
//         System.out.println("marks of science is " + marks[1]);

//         marks[0] = marks[0] + 1;
//         System.out.println("marks of maths is " + marks[0]);

//         int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//         System.out.println("percentage is " + percentage + "%");

//     }
// }



//array as a function argument

// public class Arrays {
//     public static void update(int arr[]) {
//         for(int i = 0; i < arr.length; i++) {
//             arr[i] = arr[i] + 1;
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {1,2,3,4};
//         update(arr);

//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//         }
//     }
// }



//Linear Index

// public class Arrays {
//     public static int linearSearch(int arr[], int key) {
//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int arr[] = {2, 4, 6, 8, 10};
//         int key = 4;
//         int index = linearSearch(arr, key);

//         if(index == -1) {
//             System.out.println("key not found");
//         } else {
//             System.out.println("key is at " + index);
//         }
//     }
// }



//Largest Number

// public class Arrays {
//     public static int largestNumber(int arr[]) {
//     int max = Integer.MIN_VALUE;

//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
//     public static void main(String args[]) {
//         int arr[] = {2, 4, 5, 2, 6, 3};

//        System.out.print("Largest number is " + largestNumber(arr));
//     }
// }



// smallest value

// public class Arrays {
//     public static int smallestNumber(int arr[]) {
//     int min = Integer.MAX_VALUE;

//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         return min;
//     }
//     public static void main(String args[]) {
//         int arr[] = {2, 4, 5, 2, 6, 3};

//        System.out.print("Smallesr number is " + smallestNumber(arr));
//     }
// }



// binary search

// public class Arrays {
//     public static int search(int arr[], int target) {
//         int start = 0;
//         int end = arr.length - 1;

//         while(start <= end) {
//             int middle = (start + end) / 2;

//             //comparison
//             if(arr[middle] == target) {
//                 return middle;
//             }
//             else if(arr[middle] > target) {
//                 end = middle - 1;
//             } else {
//                 start = middle + 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int arr[] = {2, 4, 6, 8, 10, 12, 14};
//         int target = 4;

//        int index = search(arr, target);

//        System.out.print("Index of your key is " + index);

//     }
// }



//reverse an array

// public class Arrays {
//     public static void reverseArr(int arr[]) {
//         int first = 0, last = arr.length - 1; 

//         while(first < last) {
//             int temp = arr[first];
//             arr[first] = arr[last];
//             arr[last] = temp;
//             first++;
//             last--;
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5};
//         reverseArr(arr);

//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
// }
//     }



//Pairs in an array with total number of pairs

// public class Arrays {
//     public static void findPairs(int arr[]) {
//         int count = 0;
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = i + 1; j < arr.length; j++) {
//                 System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
//                 count++;
//             }
//             System.out.println();
//         }
//         System.out.println("total no of pairs is " + count);
//     }
//     public static void main(String args[]) {
//         int arr[] = {2, 4, 6, 8, 10};
//         findPairs(arr);
        
//     }
// }



//print subarrays with with sum along with largest and smallest subarrays

// public class Arrays {
//     public static void printArrays(int arr[]) {
//         int sum = 0;
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i = 0; i < arr.length; i++) {
//             for(int j = i; j < arr.length; j++) {
//                 for(int k = i; k <= j; k++) {
//                     System.out.print(arr[k] + " ");
//                     sum = sum + arr[k];
//                 }
//                 System.out.println();
//             }
//             System.out.println("sum is " + sum);
//             System.out.println();

//             if(sum > largest) {
//                 largest = sum;
//             }
//             if(sum < smallest) {
//                 smallest = sum;
//             }

//             sum = 0;
//         }

//         System.out.println("largest number is " + largest);
//         System.out.println("smallest number is " + smallest);

//     }
//         public static void main(String args[]) {
//             int arr[] = {2, 4, 6, 8, 10};
//             printArrays(arr);
//     }
// }



//maximum sub array sum (brute force)


// public class Arrays {
//     public static void printArrays(int arr[]) {
//         int sum = 0;
//         int largest = Integer.MIN_VALUE;

//         for(int i = 0; i < arr.length; i++) {
//             for(int j = i; j < arr.length; j++) {
//                 sum = 0;
//                 for(int k = i; k <= j; k++) {
//                     sum = sum + arr[k];
//                 }
//                 System.out.println(sum);
                
//             if(sum > largest) {
//                 largest = sum;
//             }
//             }
//         }

//         System.out.println("largest number is " + largest);

//     }
//         public static void main(String args[]) {
//             int arr[] = {2, 4, 6, 8, 10};
//             printArrays(arr);
//     }
// }



//max subarray sum (prefix array)


    // public class Arrays{
    //     public static void max_subarray_sum(int arr[]) {
    //         int sum = 0;
    //         int largestNumber = Integer.MIN_VALUE;
    //         //creation of prefix
    //         int prefix[] = new int[arr.length];
    //         prefix[0] = arr[0];
    //         // calculation of prefix
    //         for(int i = 1; i < prefix.length; i++) {
    //             prefix[i] = prefix[i - 1] + arr[i];
    //         }

    //         //max subarray sum
    //         for(int i = 0; i < arr.length; i++) {
    //             for(int j = i; j < arr.length; j++) {

    //                 if(i == 0) {
    //                     sum = prefix[j]; 
    //                 } else {
    //                     sum = prefix[j] - prefix[i - 1];

    //                 }

    //                 if(largestNumber < sum) {
    //                     largestNumber = sum;
    //                 }
                    
    //             }
    //         }
    //         System.out.println("largest number is " + largestNumber);
    //     }
    //     public static void main(String args[]) {
    //         int arr[] = {1, -2, 6, -1, 3};
    //         max_subarray_sum(arr);
    //     }
    // }



    //kadanes algorithm of max subarray

    // public class Arrays {
    //     public static void kadanes(int arr[]) {
    //         int sum = 0;
    //         int largestNumber = Integer.MIN_VALUE;

    //         for(int i = 0; i < arr.length; i++) {
    //             sum = sum + arr[i];

    //             if(sum < 0) {
    //                 sum = 0;   //kadanes algorithm
    //             }

    //             largestNumber = Math.max(sum, largestNumber);
    //         }
    //         System.out.println("largest number is " + largestNumber);
    //     }
    //     public static void main(String args[]) {
    //         int arr[] = {1, -2, 6, -1, 3};
    //         kadanes(arr);
    //     }
    // }



// Traping Rainwater

// import java.util.Scanner;

// public class Arrays{
//     public static int trappedWater(int height[]) {
//         int n = height.length;
//         //calculate the left max boundary - arr
//         int leftMax[] = new int [n];
//         leftMax[0] = height[0];
//         for(int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }

//         //calculate the right max boundary - arr
//         int rightMax[] = new int[n];
//         rightMax[n - 1] = height[n - 1];
//         for(int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//         }
        
//         //loop 
//         //water level = min(left max boundary, rightmax boundary)
//         int trappedWater = 0;
//         for(int i = 0; i < n; i++) {
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);
//             //trapped water = water level - height[i]
//             trappedWater += waterLevel - height[i];
//         }
//         return trappedWater;
//     }
//     public static void main(String args[]) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println(trappedWater(height));
//     }
// }
