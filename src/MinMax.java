import java.math.BigInteger;

public class MinMax {



    public static void main(String[] args) {
    int[] arr = {32,4,5,3,2,1,5,6} ;


    }




    static void miniMaxSum(int[] arr) {
        BigInteger min = new BigInteger("1000000000") ;
        BigInteger max = new BigInteger("0") ;
        BigInteger sum = new BigInteger("0") ;
        // get min and max ...
        BigInteger compare = null ;

        for(int i = 0 ; i < arr.length ; i++) {
            compare = new BigInteger(String.valueOf(arr[i]));
            // max < arr[i]...
            if(BigInteger.valueOf(arr[i]).compareTo(max) > 0){
                max = BigInteger.valueOf(arr[i]);
            }
            // min > arr[i]...
            if(BigInteger.valueOf(arr[i]).compareTo(min) < 0){
                min = BigInteger.valueOf(arr[i]);
            }
            sum = sum.add(BigInteger.valueOf(arr[i]));
        }
        // min and max sum calculated...
        BigInteger minSum = sum.subtract(max) ;
        BigInteger maxSum = sum.subtract(min) ;
//        System.out.println(minSum+" "+maxSum) ;
//
    }



}
