import java.util.*;
public class TwoDArrays{

    /* Basic 2D Array
    public static boolean searchIndex(int array[][], int num){

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] == num){
                    System.out.print("(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.print("Number Not Found!");
        return false;
    }
    */

    // Find largest and smallest element
    public static void largestAndMinimum(int array[][]){
        int largest = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        // Find largest element
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] > largest){
                    largest = array[i][j];
                }
            }
        }
        System.out.println("Largest element is: " + largest);


        // Find Minimum element
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] < minimum){
                    minimum = array[i][j];
                }
            }
        }
        System.out.print("Minimum value is: " + minimum);

    }


    public static void main(String args[]){

        int array[][] = new int[3][3];  // Created a 4 by 4 matrix // Total cells -> 4 x 4 = 16
        // int n = 3; int m = 3;
        int n = array.length; int m = array[0].length;  // arra[0] will give us rows length -> means columns

        Scanner scn = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                array[i][j] = scn.nextInt();
            }
        }

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(array[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // searchIndex(array, 9);
        largestAndMinimum(array);











    }
}