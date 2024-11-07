//backtracking on arrays  (o(n) time complexity and space complexity)

// public class Backtracking {
//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void changeArr(int arr[], int count, int idx) {
//         //base case
//         if(idx == arr.length) {
//             printArr(arr);
//             return;
//         }
//         //recursion
//         arr[idx] = count;
//         changeArr(arr, count + 1, idx + 1); //inner functon call step
//         arr[idx] = arr[idx] - 2;  //backtracking step
//     }
//     public static void main(String args[]) {
//         int arr[] = new int[5];
//         int count = 1;
//         int idx = 0;
//         changeArr(arr, count, idx);
//         printArr(arr);
//     }
// }




//N-Queens 

//n queens in n row (1st part without knowing the quenn attack knowledge)

// public class Backtracking {
//     public static void nQueens(char board[][], int row) {
//         //base
//         if(row == board.length) {
//             printBoard(board);
//             return;
//         }

//         //column loop
//         for(int j = 0; j < board.length; j++) {
//             board[row][j] = 'Q';
//             nQueens(board, row + 1);  //function call
//             board[row][j] = '*';  //backtracking step
//         }
//     }

//     public static void printBoard(char board [][]) {
//         System.out.println("----------Chess Board------------");
//         for(int i = 0; i < board.length; i++) {
//             for(int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         int n = 2;
//         char board[][] = new char[n][n];
        
//         //initialize
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < n; j++) {
//                 board[i][j] = '*';
//             }
//         }

//         nQueens(board, 0);
//     }
// }



//n queens in n row (2nd part with knowing the quenn attack knowledge) (time complexity is o(n!))

// public class Backtracking {
//     public static boolean isSafe(char board[][], int row, int col) {
//         //vertical up
//         for(int i = row - 1; i >= 0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         //vertical left
//         for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         //vertical right
//         for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
        
//         return true;
//     }
//     public static void nQueens(char board[][], int row) {
//         //base
//         if(row == board.length) {
//             printBoard(board);
//             return;
//         }

//         //column loop
//         for(int j = 0; j < board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row + 1);  //function call
//                 board[row][j] = '*';  //backtracking step
//             } 
//         }
//     }

//     public static void printBoard(char board [][]) {
//         System.out.println("----------Chess Board------------");
//         for(int i = 0; i < board.length; i++) {
//             for(int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         int n = 4;
//         char board[][] = new char[n][n];
        
//         //initialize
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < n; j++) {
//                 board[i][j] = '*';
//             }
//         }

//         nQueens(board, 0);
//     }
// }



//nqueens count ways

// public class Backtracking {
//     public static boolean isSafe(char board[][], int row, int col) {
        
//         for(int i = row - 1; i >= 0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }

        
//         for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

        
//         for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
        
//         return true;
//     }
//     public static void nQueens(char board[][], int row) {
        
//         if(row == board.length) {
//             // printBoard(board);
//             count++;      
//             return;
//         }

        
//         for(int j = 0; j < board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row + 1);  
//                 board[row][j] = '*';  
//             } 
//         }
//     }

//     public static void printBoard(char board [][]) {
//         System.out.println("----------Chess Board------------");
//         for(int i = 0; i < board.length; i++) {
//             for(int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static int count = 0; //because recursion changes the value due to call by value.
//     public static void main(String args[]) {
//         int n = 10;
//         char board[][] = new char[n][n];
        
        
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < n; j++) {
//                 board[i][j] = '*';
//             }
//         }

//         nQueens(board, 0);
//         System.out.println(count);
//     }
// }





//grid ways  (time complexity is 2^n+m)

// public class Backtracking {
//     public static int gridWays(int i, int j, int row, int col) {
//         //base case
//         if(i == row - 1 && j == col - 1) {  //cond for last cell
//             return 1;
//         } else if (i == row || j == col) {  //boundary cross cond
//             return 0;
//         }
        
//         int w1 = gridWays(i + 1, j, row, col);  //down
//         int w2 = gridWays(i, j + 1, row, col);  //right
//         return w1 + w2;
//     }
//     public static void main(String args[]) {
//         int n = 3, m = 3;
//         System.out.println(gridWays(0, 0, n, m));
//     }
// }



//grid ways (time complexity 0(n))

// public class Backtracking {
//     public static int factorial(int n) {
//         if(n == 0) {
//             return 1;
//         }
//         int nM1 = factorial(n - 1);
//         int fact = n * nM1;
//         return fact;
//     }

//     public static void gridWays(int n, int m) {
//         int sum = factorial((n - 1) + (m - 1));
//         int prod = factorial(n - 1);
//         int prod2 = factorial(m - 1);
//         int fact = sum/ (prod * prod2);
//         System.out.println(fact);
//     }
//     public static void main(String args[]) {
//         int n = 3, m = 3;
//         gridWays(n, m);
//     }
// }



//sudoku 

// public class Backtracking {
//     public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
//         //column
//         for(int i = 0; i <= 8; i++) {
//             if(sudoku[i][col] == digit) {
//                 return false;
//             }
//         }

//         //row
//         for(int j = 0; j <= 8; j++) {
//             if(sudoku[row][j] == digit) {
//                 return false;
//             }
//         }

//         //grid
//         int sr = (row/3) * 3;
//         int sc = (col/3) * 3;

//         for(int i = sr; i < sr + 3; i++) {
//             for(int j = sc; j < sc + 3; j++) {
//                 if(sudoku[i][j] == digit) {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }
    
//     public static boolean sudokuSolver(int sudoku[][], int row, int col) {
//         //base case
//         if(row == 9) {
//             return true;
//         }
//         //recursion
//         int nextRow = row, nextCol = col + 1;
//         if(col + 1 == 9) {
//             nextRow = row + 1;
//             nextCol = 0;
//         }

//         if(sudoku[row][col] != 0) {
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }

//         for(int digit = 1; digit <= 9; digit++) {
//             if(isSafe(sudoku, row, col, digit)) {
//                 sudoku[row][col] = digit;
                
//                 if(sudokuSolver(sudoku, nextRow, nextCol)) {  //solution exist
//                     return true;
//                 }
//                 sudoku[row][col] = 0;
//             }
//         }
//         return false;
//     }

//     public static void printSudoku(int sudoku[][]) {
//         for(int i = 0; i <= 8; i++) {
//             for(int j = 0; j <= 8; j++) {
//                 System.out.print(sudoku[i][j]);
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0}, 
//         {4, 9, 0, 1, 5, 7, 0, 0, 2}, 
//         {0, 0, 3, 0, 0, 4, 1, 9, 0},
//         {1, 8, 5, 0, 6, 0, 0, 2, 0}, 
//         {0, 0, 0, 0, 2, 0, 0, 6, 0}, 
//         {9, 6, 0, 4, 0, 5, 3, 0, 0}, 
//         {0, 3, 0, 0, 7, 2, 0, 0, 4}, 
//         {0, 4, 9, 0, 3, 0, 0, 5, 7}, 
//         {8, 2, 7, 0, 0, 9, 0, 1, 3}};

//         if(sudokuSolver(sudoku, 0, 0)) {
//             System.out.println("solution exists");
//             printSudoku(sudoku);
//         } else {
//             System.out.println("solution does not exist");
//         }
//     }
// }
