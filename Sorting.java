//bubble sort

// public class Sorting {
//     public static void bubbleSort(int arr[]) {
//         int temp;
//         for(int i = 0; i < arr.length - 1; i++) {
            //    boolean swapped = false;
//             for(int j = 0; j < arr.length - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
                    //    swapped = true;
//                 }
//             }
//                if(swapped == false) {
//                 break;
//                }
// //         }
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         bubbleSort(arr);
//     }
// }



//selection sort


// public class Sorting {
//     public static void selectionSort(int arr[]) {
//         for(int i = 0; i < arr.length - 1; i++) {
//             int minIndex = i;
//             for(int j = i + 1; j < arr.length; j++) {
//                 if(arr[minIndex] > arr[j]) {
//                     minIndex = j;
//                 }
//             }
//             int temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp;
//         }
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         selectionSort(arr);
//     }
// }



//inbuilt sort (ascending order)

// import java.util.Arrays;

// public class Sorting{
//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         //Arrays.sort(arr);
//         Arrays.sort(arr, 0, 4);

//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//         }
//     }
// }



//inbuilt sort (ascending order)

// import java.util.Arrays;
// import java.util.Collections;

// public class Sorting{
//         public static void main(String args[]) {
//             Integer arr[] = {5, 4, 1, 3, 2};
//             // Arrays.sort(arr, Collections.reverseOrder());
//             Arrays.sort(arr, 0, 4, Collections.reverseOrder());
    
//             for(int i = 0; i < arr.length; i++) {
//                 System.out.print(arr[i]);
//             }
//         }
//     }