import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int numberOfPluses = 0 ;
        int numberOfMinuses = 0 ;
        int numberOfZeros = 0 ;
        int arrSize = arr.length ;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > 0)  {
                // plus...
                numberOfPluses++;
            } else if(arr[i] < 0 ) {
                // minus...
                numberOfMinuses++;
            } else {
                // zero...
                numberOfZeros++ ;
            }

        }
        // calculating rations ...
        System.out.println(numberOfPluses);
        System.out.println(numberOfMinuses);

        System.out.println(numberOfZeros);
        System.out.println("arr size : " + arrSize);
        double positiveRatio  = ((double)numberOfPluses) / arrSize ;
        double negativeRatio = ((double)numberOfMinuses) / arrSize ;
        double zeroRatio = ((double)numberOfZeros) / arrSize ;

        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroRatio);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1,5,6,74,0,0,0,-4,-1,-3,-5};
        plusMinus(arr);
    }
}
