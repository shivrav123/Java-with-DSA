//print numbers from n to 1 (Decreasing order)

// public class Recursion {
//     public static void decreaseNumber(int n) {
//         if(n == 1) {
//             System.out.println(n);
//             return;
//         }
//         System.out.println(n + " ");
//         decreaseNumber(n - 1);
//     }
//     public static void main(String args[]) {
//         int n = 10;
//         decreaseNumber(10);
//     }
// }



//print numbers in increasing order (1 to n)

// public class Recursion {
//     public static void increasingNum(int n) {
//         if(n == 1) {
//             System.out.println(n);
//             return;
//         }
//         increasingNum(n - 1);
//         System.out.println(n + " ");
//     }
//     public static void main(String args[]) {
//         int n = 10;
//         increasingNum(n);
//     }
// }



//factorial (time complexity is 0(n))

// public class Recursion {
//     public static int factorial(int n) {
//         if(n == 0) {
//             return 1;
//         }
//         int Nm1 = factorial(n - 1);
//         int fact = n * Nm1;
//         return fact;

//     }
//     public static void main(String args[]) {
//         int n = 4;
//         System.out.println(factorial(n));
//     }
// }



//print sum

// public class Recursion {
//     public static int sum(int n) {
//         if(n == 1) {
//             return 1;
//         }
//         int nM1 = sum(n - 1);
//         int sum = n + nM1;
//         return sum;
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println(sum(n));
//     }
// }



//nth fibonacci number

// public class Recursion {
//     public static int fibonacci(int n) {
//         if(n == 0 || n == 1) {
//             return n;
//         }
//         int nM1 = fibonacci(n - 1);
//         int nM2 = fibonacci(n - 2);
//         int fibonacci = nM1 + nM2;
//         return fibonacci;
//     }
//     public static void main(String args[]) {
//         int n = 6;
//         System.out.println(fibonacci(n));
//     }
// }



//if array is sorted

// public class Recursion {
//     public static boolean isSorted(int arr[], int i) {
//         if(i == arr.length - 1) {
//             return true;
//         }

//         if(arr[i] > arr[i + 1]) {
//             return false;
//         }

//         return isSorted(arr, i + 1);
//     }
//     public static void main(String args[]) {
//         int arr[] = {1,2,3,4};
//         System.out.println(isSorted(arr, 0));
//     }
// }



//First Occurence

// public class Recursion {
//     public static int firstOccurence(int arr[], int key, int i) {
//         if(i == arr.length) {
//             return -1;
//         }
        
//         if(arr[i] == key) {
//             return i;
//         }

//         return firstOccurence(arr, key, i + 1);
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 7, 3, 7, 1};
//         int target = 7;
//         int i = 0;

//         System.out.println(firstOccurence(arr, target, i));
//     }
// }



//Last Occurence

// public class Recursion {

//     public static int findLastOccurrence(int arr[], int i, int target) {
    
//         if (i < 0) {
//             return -1;
//         }

//         if (arr[i] == target) {
//             return i;
//         }

//         return findLastOccurrence(arr, i - 1, target);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 2, 5, 2, 6};
//         int target = 1;
//         int i = arr.length - 1;

//         System.out.println(findLastOccurrence(arr, i, target));
//     }
// }



//print x to the power n (brute force) 0(n)

// public class Recursion{
//     public static int power(int x, int n) {
//         if(n == 0) {
//             return 1;
//         }
//         int nM1 = power(x, n - 1);
//         int power = x * nM1;
//         return power;
//     }
//     public static void main(String args[]) {
//         System.out.println(power(2, 5));
//     }
// }



// //print x to the power n  (optimized code) 0(log n)

// public class Recursion{
//     public static int optimizedCode(int x, int n) {
//         if(n == 0) {
//             return 1;
//         }
//         int halfPower = optimizedCode(x, n/2);
//         int halfPowerSqr = halfPower * halfPower;

//         if(n % 2 != 0) {
//             halfPowerSqr = x * halfPowerSqr;
//         }
//         return halfPowerSqr;
//     }
//     public static void main(String args[]) {
//         System.out.println(optimizedCode(2, 5));
//     }
// }



//tiling problem 

// public class Recursion{
//     public static int tilingProblem(int n) { //2 * n (floor size)
//         //base case
//         if(n == 0 || n == 1) {
//             return 1;
//         }

//         //kaam
//         int verticalChoice = tilingProblem(n - 1);
//         int horizontalChoice = tilingProblem(n - 2);

//         int totalWays = verticalChoice + horizontalChoice;
//         return totalWays;
//     }
//     public static void main(String args[]) {
//         System.out.println(tilingProblem(4));
//     }
// }



//remove duplicate in a string

// public class Recursion{
//     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
//         if(idx == str.length()) { //basecase
//             System.out.println(newStr);
//             return;
//         }

//         //kaam
//         char currentChar = str.charAt(idx);
//         if(map[currentChar - 'a'] == true) {
//             //duplicate
//             removeDuplicates(str, idx + 1, newStr, map); //innercall
//         } else {
//             map[currentChar - 'a'] = true;
//             removeDuplicates(str, idx + 1, newStr.append(currentChar), map);   //innercall
//         }
//     }
//     public static void main(String args[]) {
//         String str = "appnnaacollegge";
//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//     }
// }



//friends pairing

// public class Recursion{
//     public static int friendsPairing(int n) {
//         //base
//         if(n == 1 || n == 2) {
//             return n;
//         }

//     //   //kaam //choice //single
//     //   int fnm1 = friendsPairing(n - 1);  

//     //   //pair
//     //   int fnm2 = friendsPairing(n - 2);
//     //   int pairWays = (n - 1) * fnm2;

//     //   //total ways
//     //   int totWays = fnm1 + pairWays;
//     //   return totWays;

//     return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println(friendsPairing(4));
//     }
// }