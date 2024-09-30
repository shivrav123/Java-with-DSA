// //while loop

// // public class Lecture4 {
// //     public static void main(String[] args) {
// //         int i = 0;
// //         while(i <=10) {
// //             System.out.println("shivansh singh");
// //             i++;
// //         }
// //     }
// // }



// //for loop

// // public class Lecture4{
// //     public static void main(String[] args) {
// //         for(int i = 0; i <= 10; i++) {
// //             System.out.println("Hello");
// //         }
// //     }
// // }



// // do while loop

// // public class Lecture4{
// //     public static void main(String[] args) {
// //         int i = 0;
// //         do {
// //             System.out.println("hello world");
// //             i++;
// //         } while (i <= 10);
// //     }
// // }



// //reverse a number

// // public class Lecture4{
// //     public static void main(String[] args) {
    
// //     int n = 10899;
// //     do{
// //         int lastDigit = n % 10;
// //         System.out.print(lastDigit);
// //         n = n / 10;
// //     } while(n > 0);
// //     }
// // }



// //reverse a given number (1st way)

// // import java.util.Scanner;

// // public class Lecture4 {
// //     public static void main(String[] args) {
// //         System.out.println("enter a number which you want to reverse: ");
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();

// //         while(n > 0) {
// //             int lastDigit = n % 10;
// //             System.out.print(lastDigit);
// //             n = n / 10;
// //         }
// //     }
// // }



// // 2nd way (more convenient)

// // import java.util.Scanner;

// // public class Lecture4 {
// //     public static void main(String[] args) {
// //         System.out.println("enter your number: ");
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         int reverseNumber = 0;
        
// //         do {
// //             int lastDigit = n % 10;
// //             reverseNumber = (reverseNumber * 10) + lastDigit;
// //             n = n / 10;
// //         } while(n > 0);

// //         System.out.println(reverseNumber);

// //     }
// // }



// //break statement

// // public class Lecture4 {
// //     public static void main(String[] args) {
// //         for(int i = 0; i <= 20; i++) {
// //             if(i == 8) {
// //                 break;
// //             }
// //             System.out.println(i);

// //         }
// //     }
// // }



// //continue statement

// // public class Lecture4{
// //     public static void main(String[] args) {
// //         for(int i = 0; i <= 10; i++) {
// //             if(i == 6) {
// //                 continue;
// //             }
// //             System.out.println(i);
            
// //         }
// //     }
// // }



// //Keep entering numbers till users enters a multiple of 10

// import java.util.Scanner;

// public class Lecture4 {
//     public static void main(String[] args) {
//         System.out.println("enter a number which is a multiple of 10: ");
//         Scanner sc = new Scanner(System.in);
        
//         do {
//             int n = sc.nextInt();
//             if((n % 10) == 0) {
//                 break;
//             }
//             System.out.println(n);

//         } while(true);
//     }
// }



//check if a number is prime or not  (1st way)

// import java.util.Scanner;

// public class Lecture4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if(n == 2 ) {
//             System.out.println("n is prime.");
//         } else {

//             boolean isPrime = true;
//             for(int i = 2; i <= n - 1; i++) {
//             if((n % i) == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }

//         if(isPrime == true) {
//             System.out.println("n is prime");
//         } else {
//             System.out.println("n is not prime");
//         }
//     }
// }
// }



//check if a number is prime or not  (2nd way)

// import java.util.Scanner;

// public class Lecture4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if(n == 2 ) {
//             System.out.println("n is prime.");
//         } else {

//             boolean isPrime = true;
//             for(int i = 2; i <= Math.sqrt(n) ; i++) {
//             if((n % i) == 0) {
//                 isPrime = false;
//             }
//         }

//         if(isPrime == true) {
//             System.out.println("n is prime");
//         } else {
//             System.out.println("n is not prime");
//         }
//     }
// }
// }






     