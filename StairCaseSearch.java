public class StairCaseSearch{

    public static boolean StairCaseSearch(int matrix[][], int num){
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >=0){
            if(matrix[row][col] == num){
                System.out.print("Number is found at " + "(" + row + "," + col + ")");
                return true;
            }

            if(num < matrix[row][col]){
                col--;
            } else{
                row++;
            }
        }
        return false;
    }


    public static void main(String args[]){

        int matrix[][] = {{4,5,6,7},
                            {8,9,10,11},
                            {12,13,14,15},
                            {16,17,18,19}};
        int num = 18;
        StairCaseSearch(matrix, num);
    }
}