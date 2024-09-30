//syntax of string

// public class Strings{
//     public static void main(String args[]) {
//         String str = "hello";
//         String str2 = new String("Hey");
//         System.out.println(str);
//         System.out.println(str2);
//     }
// }



//input and output of string

// import java.util.Scanner;

// public class Strings{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//        // String str = sc.next();   //for a single word 
//         String str = sc.nextLine();
//         System.out.println(str);
//     }
// }



//function (length())

// public class Strings {
//     public static void main(String args[]) {
//         String str = "Shivansh Singh";
//         System.out.println(str.length());
//     }
// }


//function (charAt())

// public class Strings{
//     public static void main(String args[]) {
//         String fullName = "Shivansh Singh";
       
//         for(int i = 0; i < fullName.length(); i++) {
//             System.out.print(fullName.charAt(i) + " ");
//         }
//     }
// }



//Palindrome String or not (1st way)

// public class Strings{
//     public static boolean isPalindrome(String str) {
//         for(int i = 0; i < str.length()/2; i++) {
//             if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                 System.out.print("it is not palindrome string");
//                 return false;
//             }
//         }
//         System.out.println("It is palindrome string");
//         return true;
//     }
//     public static void main(String args[]) {
//         String str = "Racecar";
//         isPalindrome(str);
//     }
// }



//Palindrome String/ array or not (more effective for case sensitive and characters)

// import java.util.Scanner;

// public class Strings{
//     public static boolean isPalindrome(String str) {
//         str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", " ");
//         for(int i = 0; i < str.length()/2; i++) {
//             if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your string: ");
//         String str = sc.nextLine();

//         System.out.println(isPalindrome(str));
//     }
// }



//String comparison  (.equal())

// public class Strings {
//     public static void main(String args[]) {
//         String str1 = "Ravi";
//         String str2 = "Ravi";
//         String str3 = new String("Ravi");

//         if(str1 == str2) {
//             System.out.println("Strings are equal");
//         } else {
//             System.out.println("Strings are not equal");

//         }

//         if(str1 == str3) {
//             System.out.println("Strings are equal");
//         } else {
//             System.out.println("Strings are not equal");

//         }

//        if(str1.equals(str3)) {
//         System.out.println("Strings are equal");
//        } else {
//         System.out.println("Strings are not equal");
//        }
//     }
// }



//substring  (without substring() function)  

// public class Strings{
//     public static String substring(String str, int si, int ei) {
//         String substr = "";

//         for(int i = si; i < ei; i++) {
//             substr += str.charAt(i);
//         }
//         return substr;
//     }
//     public static void main(String args[]) {
//         String str = "ShivanshSingh";
//         System.out.println(substring(str, 0, 5));
//     }
// }



//with substring function

// public class Strings{
//     public static void main(String args[]) {
//         String str = "ShivanshSingh";
//         System.out.println(str.substring(0, 5));
//     }
// }



//comparetoIgnoreCase()  (0 = equals, positive = a is bigger than b, negative = b is bigger than a)

// public class Strings{
//     public static void main(String args[]) {
//         String str1 = "Apple";
//         String str2 = "mango";
//         System.out.println(str1.compareToIgnoreCase(str2));
//     }
// }



//largest string

// public class Strings{
//     public static void main(String args[]) {
//         String fruits[] = {"apple", "banana", "mango"};
        
//         String largest = fruits[0];
//         for(int i = 0; i < fruits.length; i++) {
//             if(largest.compareToIgnoreCase(fruits[i]) < 0) {
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }



//String builder Time complexity is 0(n)

// public class Strings{
//     public static void main(String args[]) {
//         StringBuilder sb = new StringBuilder("");
//         for(char ch = 'a'; ch <= 'z'; ch++) {
//             sb.append(ch);
//         }
//         System.out.println(sb);
//         System.out.println(sb.length());
//     }
// }



//to uppercase of first letter

// import java.util.Scanner;

// public class Strings{
//     public static String toUpperCase(String str) {
//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
        
//         for(int i = 1; i < str.length(); i++) {
//             if(str.charAt(i) == ' ' && i < str.length() - 1) {
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             } else {
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your string: ");
//         String str = sc.nextLine();
        
//         System.out.println(toUpperCase(str));
//     }
// }



//String Compression
// public class Strings{
//     public static String compress(String str) {
//         StringBuilder sb = new StringBuilder("");

//         for(int i = 0; i < str.length(); i++) {
//             Integer count = 1;

//             while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }
//             sb.append(str.charAt(i));
//             if(count > 1) {
//                 sb.append(count.toString());
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]) {
//         String str = "aaabbbccc";
//         System.out.println(compress(str));
//     }
// }
