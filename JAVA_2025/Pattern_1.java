public class Pattern_1 {
    public static void main(String args[]){
        int rows = 5;

        for(int i=5;i>=1;i++){
            for(int j=1;j<=rows;j++){
                for(int s=1;s<=i;s++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        rows++;
        

    }
}

//*****
// ****
//  ***
//   **
//    *

//write a java prog to find the max and min mnumber in a list == divide and conquer
//
//To find the second largest number in the given list in java == divide and conquer
