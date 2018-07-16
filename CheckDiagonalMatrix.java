package CricBuzz;

public class CheckDiagonalMatrix {
    // Note: matrix is 2 dimensional array with equal number of rows and columns
    // Diagonal matrix - is one whose all elements are zero's and Diagonal elements [(0,0) (1,1) ...(n,n)] are any value
    // sample 2  0 0
    //        0  1 0
    //        0  0 4

    public static void main(String[] args) {
        int[][] arr = new int[][]{{2, 0, 0},{0, 1, 0},{0, 0, 4}};
        System.out.println("isDiagonal matrix: "+isDiagonalMatrix(3, arr));
    }

    public static boolean isDiagonalMatrix(int matrixSize, int[][] arr){
        boolean isDiagonal = true;
        for(int row = 0; row < matrixSize; row++){
            for(int col = 0; col < matrixSize; col++){
                if(row!=col && arr[row][col]!=0){
                    isDiagonal = false;
                    break;
                }
            }
            if(isDiagonal){
                break;
            }
        }
        return isDiagonal;
    }
}
