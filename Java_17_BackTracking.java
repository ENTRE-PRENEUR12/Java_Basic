import java.util.*;
public class Java_17_BackTracking{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[],int i, int val){
        // Base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        // recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }  

    // Find Subsets
    public static void findSubset(String str, String ans, int i){
        // Base Case
        if(i == str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.print(ans+" ");
            }
            return;
        }        
        // Recursion
        // Yes Case
        findSubset(str, ans+str.charAt(i), i+1);
        // No Choice
        findSubset(str, ans, i+1);

    }

    // find Permutation of String
    public static void findPermutation(String str, String ans){
        // base case
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        // Recursion
        
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            // abcde (remove c) --> "ab"+"de"=abcde
            String NewStr = str.substring(0, i)+ str.substring(i+1);
            findPermutation(NewStr, ans+curr);
        }
    }

    // ---------N Queens----------
    // is Safe Function
    public static boolean isSafe(char board[][],int row, int col){
        // vertical up 
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
            return false;
            }
        }
        // diagonal left up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
            return false;
            }
        }
        // diagonal right up
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
            return false;
            }
        }
        return true;
    }

    static int count =0;
    // N Queens function
    public static void nQueens(char board[][],int row){
        // base case
        if(row==board.length){
            printBoard(board);
            count++;
            return;
        }
        // column loop
        for(int j=0; j<board.length; j++){
            if((isSafe(board, row,j))==true){
            board[row][j]='Q';
            nQueens(board, row+1);// function call
            board[row][j]='X'; // Backtracking step
            }
        }
    }

    // N Queens function -- for 1 solution(Y/N)
    // public static boolean nQueens(char board[][],int row){
    //     // base case
    //     if(row==board.length){
    //         count++;
    //         return true;
    //     }
    //     // column loop
    //     for(int j=0; j<board.length; j++){
    //         if((isSafe(board, row,j))==true){
    //         board[row][j]='Q';
    //         if(nQueens(board, row+1)){
    //         return true;
    //         }// function call
    //         board[row][j]='X'; // Backtracking step
    //         }
    //     }
    //     return false;
    // }

    // Print Board
    public static void printBoard(char board[][]){
        System.out.println("-------Chess Board--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] +" ");
            }
            System.out .println();
        }
    }

    // Grid count ways nxm
    public static int gridWays(int i, int j,int n, int m){
        // base case
        if(i==n-1 && j==m-1){ // condition for last cell
            return 1;
        } else if(i==n || j==m){ // boundary cross condition
            return 0;
        }
        int w1 = gridWays(i+1,j,n,m);
        int w2 = gridWays(i,j+1,n,m);
        return w1+w2;
    }

    // ---------Sudoku Question----------
    // Check safe or not
    public static boolean safe(int sudoku[][], int row, int col, int digit){
        //  column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        // row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        // grid
        int sr= (row/3)*3, sc= (col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

    // sudoku function
    public static boolean sudokuSolver(int sudoku[][], int row,int col){
        // base case
        if(row ==9){
            return true;
        }
        // recursion
        int nextRow= row, nextCol = col+1;
        if(col+1 ==9 ){
            nextRow = row+1;
            nextCol = 0;

        }
        if(sudoku[row][col] !=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(safe(sudoku, row, col, digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    // Print Sudoku
    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

        // Find Subsets
        String str = "abc";
        System.out.println("Find Subsets");
        findSubset(str, "", 0);

        // Find Permutation
        System.out.println("Find Permutation");
        findPermutation(str, "");

        // N Queens  -- O(n!)
        System.out.println("// N Queens");
        int n=4;
        char board[][]= new char[n][n];
        // initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }

        nQueens(board,0);
        System.out.println("Total ways to solve n queens = "+count);

        // if((nQueens(board, 0))){
        //     System.out.println("Solution exists");
        //     printBoard(board);
        // }else{
        //     System.out.println("solution is not possible");
        // }

        // Grid count ways nxm -O2^(n+m)
        // Maths linear sol- (n-1+m-1)! / ((n-1)!*(m-1)!)
        System.out.println("Grid count ways nxm");
        System.out.println("Total ways in grid cell "+gridWays(0, 0, 3, 3));

        // Sudoku Question
        System.out.println("Sudoku Question");
        int sudoku[][]={ {0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3} };
        
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }else{
            System.out.println("'Solution not Exists'");
        }
    }
}
