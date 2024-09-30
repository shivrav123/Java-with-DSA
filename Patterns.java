//star pattern

// public class Patterns {
//     public static void main(String args[]) {
//         int n = 4;  // no of rows

//         for (int line = 1; line <= n; line++) {    //outer loop for lines of patterns
//             for (int star = 1; star <= line; star++) {   // inner loop for no of times for char, numbers to print
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// inverted star pattern 1st way

// public class Patterns {
//     public static void main(String args[]) {
//         int n = 4;
//         for(int i = n; i >= 1; i--) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// inverted star pattern 2nd way

// public class Patterns {
//     public static void main(String args[]) {
//         int n = 4;
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n - i + 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//half pyramid pattern

// public class Patterns {
//     public static void main(String args[]) {
//         int n = 4;
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



//print character patter

// public class Patterns {
//     public static void main(String args[]) {
//         char ch = 'A';
//         int n = 4;

//         for(int i = 1; i <= n; i++) {
//             for(int chars = 1; chars <= i; chars++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }

//     }
// }



//Hollow Rectangle

// public class Patterns {
//     public static void main(String args[]) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = 1; j <= 5; j++) {
//                 if(i == 1 || i == 4 || j == 1 || j == 5) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//Inverted and rotated hald-pyramid


// public class Patterns {
//     public static void invertd_rotated_half_pyramid(int n) {
//         //no of rows
//         for(int i = 1; i <= n; i++) {
//             // no of spaces logic
//             for(int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // no of stars
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         invertd_rotated_half_pyramid(4);
//     }
// }



// inverted half pyramid with numbers

// public class Patterns {
//     public static void invertd_rotated_half_pyramid (int n) {
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n - i + 1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]) {
//         invertd_rotated_half_pyramid(5);
//     }
// }



// Floyd's tringle

// public class Patterns {
//     public static void floyd_triangle(int n) {
//         int num = 1;
//         for(int i = 1; i <= 5; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         floyd_triangle(5);
//     }
// }



// 0 - 1 triangle

// public class Patterns {
//     public static void triangle(int n) {
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 if((i + j) % 2 == 0) {
//                     System.out.print(1 + " ");
//                 } else {
//                     System.out.print(0 + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         triangle(5);
//     }
// }



//Butterfly pattern

// public class Patterns {
//     public static void ButterflyPattern(int n) {
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             for(int k = 1; k <= n - i; k++) {
//                 System.out.print(" ");
//                 System.out.print(" ");
//             }
//             for(int l = 1; l <= i; l++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         //reverse of previous code
//         for(int i = n; i >= 1; i--) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             for(int k = 1; k <= n- i; k++) {
//                 System.out.print(" ");
//                 System.out.print(" ");
//             }
//             for(int l = 1; l <= i; l++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
        
//     }
//     public static void main(String args[]) {
//         ButterflyPattern(4);
//     }
// }



// //solid rhombus

// public class Patterns {
//     public static void solid_rhombus(int n) {
//         for(int i = n; i >= 1; i--) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= n; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         solid_rhombus(5);
//     }
// }



//hollow rhombus

// public class Patterns {
//     public static void hollow_rhombus(int n) {
//         for(int i = n; i >= 1; i--) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//              for(int k = 1; k <= n; k++) {
//                 if((i == 1) || (i == n) || (k == 1) || (k == n)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//              }
//              System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         hollow_rhombus(5);
//     }
// }



//Diamond Pattern

// public class Patterns {
//     public static void diamond(int n) {
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= (2*i) - 1; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i = n; i >= 1; i--) {
//             for(int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= (2*i) - 1; k++) {
//                 System.out.print("*");
//             }
//         System.out.println();
//     }
//     }
//     public static void main(String args[]) {
//         diamond(4);
//     }
// }



//Number Pyramid

// public class Patterns {
//     public static void number_pyramid(int n) {
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         number_pyramid(5);
//     }
// }



//Palindromic pattern with numbers

// public class Patterns {
//     public static void palindromic(int n) {
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k = i; k >= 1; k--) {
//                 System.out.print(k);
//             }
//             for(int l = 2; l <= i; l++) {
//                 System.out.print(l);
//             }

//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         palindromic(5);
//     }
// }