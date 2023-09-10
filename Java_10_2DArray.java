import java.util.*;
public class Java_10_2DArray {
    
    public static boolean search(int mat[][], int key){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found ");
        return false;
    }

    // Spiral Matrix
    public static void spiral(int mat2[][]){
        int startRow=0, startCol = 0,endRow=mat2.length-1,endCol=mat2[0].length-1;
        while(startRow <= endRow && startCol <=endCol){
            // top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(mat2[startRow][j]+" ");
            }
            // right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(mat2[i][endCol]+" ");
            }
            // bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(mat2[endRow][j]+" ");
            }
            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(mat2[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
        System.out.println();
    }

    // Diagonal Sum
    public static void diagonal(int mat2[][]){
        int sum=0;
        // Primary Diagonal
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                if(i==j){
                    sum += mat2[i][j]; 
                }
                else if(i+j == mat2.length -1){
                    sum += mat2[i][j];
                }
            }
        }
        System.out.println("Diagonal Sum is "+sum);

        // Method 2 
        int sum1=0;
        for(int i=0;i<mat2.length;i++){
            // pd
            sum1 += mat2[i][i];
            // sd
            if(i != mat2.length-1-i){
            int j= mat2.length-1-i;
            sum1 += mat2[i][j];
            }
        }
        System.out.println("Sum is (M-2) "+sum1);
    }

    // Search in Sorted Matrix - stairCase- O(n+m )
    public static void stair(int mat3[][], int key){
        int row=0, col = mat3[0].length-1;

        while(row < mat3.length && col >= 0){
            if(mat3[row][col] ==key){
                System.out.println("Key found at ("+row+","+col+")");
                return;
            }
            else if(key < mat3[row][col]){
                col--;
            }
            else{
                row++;
            }
            // else{
                
            // }
        }
        System.out.println("Key not in Matrix");
    }
     


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Matrices ");
        int mat[][]=new int[3][3];
        int n=3, m=3;
        // Input the matrices
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        // Input the matrices
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        search(mat, 7);

        // Spiral Matrix
        System.out.println("// Spiral Matrix");
        int mat2[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(mat2);

        // // Diagonal Sum
        System.out.println("// Diagonal Sum");
        diagonal(mat2);
        diagonal(mat);
        
        // Search in Sorted Matrix - stairCase
        System.out.println("// Search in Sorted Matrix - stairCase");
        int mat3[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,45},{32,33,39,50}};
        stair(mat3, 37);
        stair(mat3, 38);
    }
}
