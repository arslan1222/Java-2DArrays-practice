import java.util.*;
public class SpiralMatrix{

    public static void spiralMatrix(int matrix[][]){
        int strtRow = 0;
        int endRow = matrix.length-1;
        int strtCol = 0;
        int endCol = matrix[0].length;

        while(strtRow <= endRow && strtCol <= endCol){

            // Top boundary
            for(int j=strtCol; j<=endCol; j++){
                System.out.print(matrix[strtRow][j] + " ");
            }

            // Right boundary
            for(int i=strtRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            // Bottom boundary
            for(int j=endCol-1; j>=strtRow; j--){
                if(strtRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]);
            }

            // Left boundary
            for(int i=endRow-1; i>=strtRow+1; i--){
                if(strtCol == endCol){
                    break;
                }
                System.out.print(matrix[i][strtCol]);
            }

            strtRow++;
            strtCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};

        spiralMatrix(matrix);
    }


}
