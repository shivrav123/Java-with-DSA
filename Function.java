//functions/ Methods

// public class Function {
    
//     //this is function/ method (coz it is written in the class)
//     public static void returnHello() {
//         System.out.println("hello world");
//         return;
//     }
//     public static void main(String args[]){
//         returnHello();
//     }
// }



// functions with parameters

// public class Function {
//     public static int sum(int a, int b) {    //parameters with thier data types
//         return a + b;
//     }    
//     public static void main(String args[]) {
//         System.out.println(sum(3, 4));     //arguments
//     }
// }



//call by value

// public class Function {
//     public static void swap(int a, int b) {
//         int temp;
//         temp = a;
//         a = b;
//         b = temp;

//         System.out.println("swapping in called funtion");
//         System.out.println("a: " + a);
//         System.out.println("b: " + b);
//     }
//     public static void main(String args[]) {
//         int a = 5;
//         int b = 7;
        
//         swap(a, b);

//         System.out.println("swapping in main function");
//         System.out.println("a: " + a);
//         System.out.println("b: " + b);
//     }
// }



// multiply of a and b

// import java.util.Scanner;

// public class Function {
//     public static int product(int y, int z) {
//         int multiply = y * z;
//         return multiply;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a: ");
//         int a = sc.nextInt();

//         System.out.println("enter a: ");
//         int b = sc.nextInt();

//         int solution = product(a, b);
//         System.out.println("solution of the product is " + solution);

//     }
// }



// factorial of the number

// public class Function {
//     public static int factorial(int n) {
        
//         int factorial = 1;
//         for(int i = 1; i <= n; i++) {
//             factorial = factorial * i;
//            }
//            return factorial;
//     }
//     public static void main(String args[]) {
//        int n = 5;
    
//        System.out.println(factorial(n));
//     }
// }



//Binomial Coefficient

// import java.util.Scanner;

// public class Function {
//     public static int factorial(int n) {
//         int fact = 1;
//         for(int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }
//         return fact;
//     }
//     public static int findBinomialCoeff(int n, int r) {
//         int nFact = factorial(n);
//         int rFact = factorial(r);
//         int nMrFact = factorial(n-r);

//         int binomialCoeff = nFact / (rFact * nMrFact);
//         return binomialCoeff;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter n: ") ;
//         int n = sc.nextInt();

//         System.out.println("enter r: ") ;
//         int r = sc.nextInt();

//         System.out.println("binomial coefficient is " + findBinomialCoeff(n, r));
//     }
// }



// function overloading using parameters

// public class Function {
//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static int sum(int a, int b, int c) {
//         return a + b + c; 
//     }
    
//     public static void main(String args[]) {
//         System.out.println(sum(3, 5));
//         System.out.println(sum(3, 5, 8));
//     }
// }
    


//function overloading using datatypes

// public class Function {
//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static float sum(float a, float b, float c) {
//         return a + b + c; 
//     }
    
//     public static void main(String args[]) {
//         System.out.println(sum(3, 5));
//         System.out.println(sum(3.1f, 5.8f, 8.4f));
//     }
// }



// check if a number is prime or not (1st way)

// import java.util.Scanner;

// public class Function {
//     public static boolean isPrime(int a) {
//         //corner case
//         if(a == 2) {
//             return true;
//         }
        
//         for(int i = 2; i <= a - 1; i++) {
//             if(a % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number: ");
//         int n = sc.nextInt();

//         System.out.println(isPrime(n));
//     }
// }



// check whether the number is prime or not (more optimised)

// import java.util.Scanner;

// public class Function {
//     public static boolean isPrime(int a) {
//         //corner case
//         if(a == 2) {
//             return true;
//         }
        
//         for(int i = 2; i <= Math.sqrt(a); i++) {    //here are the changes
//             if(a % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number: ");
//         int n = sc.nextInt();

//         System.out.println(isPrime(n));
//     }
// }



//prime numbers in range (from 2 to n)

// import java.util.Scanner;

// public class Function {
//     public static Boolean isPrime(int x) {
//         if(x == 2) {
//         return true;
//     }
                    
//     for(int i = 2; i <= Math.sqrt(x); i++) {    //here are the changes
//         if(x % i == 0) {
//             return false;
//         }
//     }
//     return true;
//     }

//     public static void getPrimeNo(int a) {
//         for(int i = 2; i <= a; i++) {
//             if(isPrime(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number: ");
//         int n = sc.nextInt();

//         getPrimeNo(n);
//     }
// }



//convert binary to decimal

// import java.util.Scanner;

// public class Function {
//     public static void main(String[] args) {
//         int binary = 10001;
//         int power = 0;
//         int decimal = 0;
        
//         while(binary > 0) {
//             int lastDigit = binary % 10;
//             decimal = decimal + (int)(lastDigit * (Math.pow(2, power)));
//             binary = binary / 10;
//             power++;
//         } 
//         System.out.println(decimal);
//     }
// }



//convert decimal to binary

// public class Function {
//     public static void main(String args[]) {
//         int decimalNumber = 12;
//         int binaryNumber = 0;
//         int power = 0;

//         while(decimalNumber > 0) {
//             int remainder = decimalNumber % 2;
//             binaryNumber = binaryNumber + (remainder * (int)(Math.pow(10, power)));
//             decimalNumber = decimalNumber / 2;
//             power++;
//         }
//         System.out.println(binaryNumber);
//     }
// }



//function to check whether a number is palindrome or not

// import java.util.Scanner;

// public class Function {
//     public static int reverse(int n) {
//         int reversed = 0;

//         while(n > 0) {
//             int lastDigit = n % 10;
//             reversed = (reversed * 10) + lastDigit;
//             n = n / 10;
//         }
//         return reversed;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();
        
//         int reversedNumber = reverse(n);

//         if(reversedNumber == n) {
//             System.out.println(n + " is a palindrome number");
//         } else{
//             System.out.println(n + " is not a palindrome number.");
//         }
//     }
// }