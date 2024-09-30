//creation of an array

// import java.util.Scanner;
// public class Arrays2D {
//     public static boolean search(int arr[][], int key) {
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = 0; j < arr[0].length; j++) {
//                 if(arr[i][j] == key){
//                     System.out.println("key: " + key + " found at "+ "(" + i + "," + j + ")");
//                     return true;
//                 } 
//             }
//         }
//         System.out.println("key not found");
//         return false;
//     }
//     public static void main(String args[]) {
//         int arr[][] = new int[3][3];
//         int n = arr.length, m = arr[0].length;
        
//         Scanner sc = new Scanner(System.in);
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         for(int i = 0; i <  n; i++) {
//             for(int j = 0; j < n; j++) {
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println();
//         }
//         search(arr, 4);
//     }
// }



//Spiral Matrix

// public class Arrays2D {
//     public static void printSpiral(int matrix[][]) {
//         int startRow = 0;
//         int startColumn = 0;
//         int endRow = matrix.length-1;
//         int endColumn = matrix[0].length-1;

//         while(startRow <= endRow && startColumn <= endColumn) {

//             //top
//             for(int j = startColumn; j <= endColumn; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             //right
//             for(int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endColumn] + " ");
//             }

//             //bottom
//             for(int j = endColumn - 1; j >= startColumn; j--) {
//                 if(startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }

//             //left
//             for(int i = endRow - 1; i >= startRow + 1; i--) {
//                 if(startColumn == endColumn) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startColumn] + " ");
//             }

//             startRow++;
//             startColumn++;
//             endRow--;
//             endColumn--;
//         }
//     }
//     public static void main(String args[]) {
//         int matrix[][] = {{1, 2, 3, 4}, 
//                         {5, 6, 7, 8}, 
//                         {9, 10, 11, 12}, 
//                         {13, 14, 15, 16}};

//         printSpiral(matrix);
//     }
// }



// Diagonal sum (Brute force) time complexity is 0(n^2)

// public class Arrays2D {
//     public static int diagonalSum(int matrix[][]) {
//         int sum = 0;

//         //primary diagonal
//         for(int i = 0; i < matrix.length; i++) {
//             for(int j = 0; j < matrix[0].length; j++) {
//                 if(i == j) {
//                     sum += matrix[i][j];
//                 } else {
//                     if( i + j == matrix.length - 1) {
//                         sum += matrix[i][j];
//                     }
//                 }
//             }
//         }
//         return sum;
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {{1, 2, 3, 4}, 
//                         {5, 6, 7, 8}, 
//                         {9, 10, 11, 12}, 
//                         {13, 14, 15, 16}};

//         System.out.println(diagonalSum(matrix));

//     }
// }



//Diagonal sum 

// public class Arrays2D {
//     public static int diagonalSum(int matrix[][]) {
//         int sum = 0;

//         //primary diagonal
//         for(int i = 0; i < matrix.length; i++) {
            
//             //primary diagonal
//             sum += matrix[i][i];

//             //secondary diagonal
//             int j = matrix.length - 1 - i;

//             if(i != j) {
//                 sum += matrix[i][j];
//             }
//         }
//         return sum;
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {{1, 2, 3, 4}, 
//                         {5, 6, 7, 8}, 
//                         {9, 10, 11, 12}, 
//                         {13, 14, 15, 16}};

//         System.out.println(diagonalSum(matrix));

//     }
// }



//Search in Sorted Matrix 

// public class Arrays2D {
//     public static boolean staircaseSearch(int matrix[][], int key) {
//         int row = 0, column = matrix[0].length - 1;

//         while(row < matrix.length && column >= 0) {
           
//             if(matrix[row][column] == key) {
//                 System.out.println("key found at (" + row + "," + column + ")");
//                 return true;
//             } 
            
//             else if(matrix[row][column] > key) {
//                 column--;
//             } else {
//                 row++;
//             }
//         }
//         System.out.println("key not found");
//         return false;
//     }
//     public static void main(String args[]) {
//         int matrix[][] = {{1, 2, 3, 4}, 
//                         {5, 6, 7, 8}, 
//                         {9, 10, 11, 12}, 
//                         {13, 14, 15, 16}};

//         staircaseSearch(matrix, 15);
        
//     }
// }