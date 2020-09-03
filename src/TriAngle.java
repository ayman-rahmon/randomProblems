import java.util.Scanner;

public class TriAngle {


    public static void main(String[] args) {
        int n = 5 ;



        for(int i =1 ;i<= n ; i++) {

            for(int j = n ; j > i ; j--){
                System.out.print(" ");
            }
            for(int k = 0 ; k < i  ; k++ ) {
                System.out.print("#");
            }
          System.out.println();
        }



/*
        for (int i = 1 ; i <= n ; i++) {
            for(int j = n ; j <= i ; j--) {
                System.out.println(" ");
            }

            for(int k = 0 ; k < i ; k++) {
                System.out.print("#");
            }


            System.out.println();
        }
*/


//        for(int i = 1; i <= numInputs; i++){ // rows
//
//            int j = numInputs;
//
//            // loop to print (size - i) spaces
//            while(j-- > i) {
//                System.out.print(" ");
//            }
//            // loop to print (i) #s
//            while(j-- >= 0) {
//                System.out.print("#");
//            }
//
//            System.out.println();
//        }

    }



}
