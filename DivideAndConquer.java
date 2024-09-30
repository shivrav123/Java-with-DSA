//Merge sort (very imp algorithm in sorting)

// public class DivideAndConquer {
//     public static void printArr(int arr[]) {
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void mergeSort(int arr[], int si, int ei) {
//         if(si >= ei) {
//             return;
//         }
//         //kaam
//         int mid = si +(ei - si)/2;
//         mergeSort(arr, si, mid);  //left part
//         mergeSort(arr, mid + 1, ei);  //right part
//         merge(arr, si, mid, ei);
//     }

//     public static void merge(int arr[], int si, int mid, int ei) {
//         //left(0, 3)= 4  right(4, 6) = 3
//         int temp[] = new int [ei - si + 1];
//         int i = si; //iterator for left part
//         int j = mid + 1;  //iterator for right part
//         int k = 0;   //iterator for temp arr

//         while(i <= mid && j <= ei) {
//             if(arr[i] < arr[j]) {
//                 temp[k] = arr[i];
//                 i++; //k++;
//             } else {
//                 temp[k] = arr[j];
//                 j++; //k++;
//             }
//             k++;
//         }

//         //remaining elements of left or right

//         //left part
//         while(i <= mid) {
//             temp[k++] = arr[i++];
//         }

//         //right part
//         while(j <= ei) {
//             temp[k++] = arr[j++];
//         }

//         //copy temp to original arr
//         for(k = 0, i = si; k < temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }

//     }
//     public static void main(String args[]) {
//         int arr[] = {6, 3, 9, 5, 2, 8};
//         mergeSort(arr, 0, arr.length - 1);
//         printArr(arr);
//     }
// }



//Search in rotated sorted array (modified binary search)

// public class DivideAndConquer {
//     public static int search(int arr[], int tar, int si, int ei) {
//         //base case
//         if(si > ei) {
//             return - 1;
//         }
        
//         //kaam
//         int mid = si + (ei - si)/2;

//         //case FOUND
//         if(arr[mid] == tar) {
//             return mid;
//         }

//         //mid lie on line 1
//         if(arr[si] <= arr[mid]){
//             //case a: left
//             if(arr[si] <= tar && tar <= arr[mid]) {
//                 return search(arr, tar, si, mid - 1);  //have faith that it will find the target
//             } else {
//                 //case b : right
//                 return search(arr, tar, mid + 1, ei);
//             }
//         }

//         //mid on line 2
//         else {
//                 //case c : right
//                 if(arr[mid] <= tar && tar <= arr[ei]) {
//                     return search(arr, tar, mid + 1, ei);
//                 } else {
//                     //case D : left
//                     return search(arr, tar, si, mid - 1);
//                 }
//             }
//         }

//     public static void main(String args[]) {
//         int arr[] = {4, 5, 6, 7, 0, 1, 2};
//         int target = 0;   //output -> 4
//         int targetIdx = search(arr, target, 0, arr.length - 1);
//         System.out.println(targetIdx);
//     }
// }



//recursion type

// public class rough{
//     public static int search(int arr[], int tar) {
//         int si = 0;
//         int ei = arr.length - 1;


//         while(si <= ei) {
//             int mid = si + (ei - si)/2;

//             if(arr[mid] == tar) {
//                 return mid;
//             } 

//             if(arr[si] <= arr[mid]) {
//                 if(arr[si] <= tar && tar <= arr[mid]) {
//                     ei =  mid - 1;
//                 } else {
//                     si = mid + 1;
//                 }
//             } else {
//                 if(arr[mid] <= tar && tar <= arr[ei]) {
//                     si = mid + 1;
//                 } else {
//                     ei = mid - 1;
//                 }
//             }

//         }
//         return - 1;
//     }
//     public static void main(String args[]) {
//         int arr[] = {4, 5, 6, 7, 0, 1, 2};
//         int target = -1;
//         System.out.println(search(arr, target));
//     }
// }