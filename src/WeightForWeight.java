import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class WeightForWeight {

    public static void main(String[] args) {



    }
    public static String orderWeight(String strng) {
        System.out.println(strng) ;

        if(!strng.trim().contains(" "))
            return strng ;
        StringBuilder answer = new StringBuilder() ;
        String[] weights = strng.split(" ");
        long[] values = new long[weights.length];

        Hashtable<Long,LinkedList> strVal = new Hashtable<Long, LinkedList>();
        Arrays.sort(weights) ;
        for(int i = 0  ; i < weights.length ; i++) {
            values[i] = Long.decode(weights[i]).longValue() ;
            int j = 1 ;
            int weight  = 0 ;
            while(values[i] / Math.pow(10,j)>0) {
                weight += (values[i]%Math.pow(10,j))/Math.pow(10,j-1);
                values[i] -= values[i] % Math.pow(10,j)/Math.pow(10,j-1);
                j++;
            }
            values[i]= weight ;
            LinkedList<String> val = new LinkedList<>();
            if(strVal.containsKey(values[i])){
                val = strVal.get(values[i]);
            }


        }
        Arrays.sort(values);
        for(int i = 0 ; i < values.length ; i++ ) {
            if(strVal.containsKey(values[i])) {
                for(int h = 0 ; h < strVal.size() ; h++){
                    answer.append(strVal.get(values[i]).get(h)) ;
                    answer.append(" ");
                }
                strVal.remove(values[i]);
            }
        }
        return answer.toString().trim() ;
    }
//   public static String orderWeight(String strng) {
//       // splitting the numbers apart...
//       String[] numbers = strng.split("\\s+") ;
//       int[] weights = new int[numbers.length] ;
//       // fill the weights...
//       for(int i = 0 ; i < numbers.length ; i++) {
//          for(int j = 0 ; j < numbers[i].length() ;j++) {
//               // get the weight  and store them in an array...
//               weights[i] += Integer.parseInt(String.valueOf(numbers[i].charAt(j))) ;
//           }
//       }
//       // sort the new found weights...
//       for(int i = 0 ; i < weights.length ; i++) {
//           for(int j = i+1 ; j < weights.length ; j++ ) {
//               // swap the numbers for sorting...
//               if(weights[i]<weights[j]) {
//                   String temp = numbers[i] ;
//                   numbers[i] = numbers[j];
//                   numbers[j] = temp ;
//               }
//           }
//       }
//       // constructing the result String...
//        StringBuilder builder =  new StringBuilder() ;
//        for(int i = 0 ; i < numbers.length ; ) {
//            if(numbers.length - 1 == i){
//                builder.append(numbers[i]) ;
//            }
//            builder.append( numbers[i]+" ") ;
//        }
//       return constructString(numbers) ;
//   }
//
//   private static String constructString(String[] numbers) {
//
//       StringBuilder builder =  new StringBuilder() ;
//       for(int i = 0 ; i < numbers.length ; ) {
//           if(numbers.length - 1 == i){
//               builder.append(numbers[i]) ;
//           }
//           builder.append( numbers[i]+" ") ;
//       }
//       return builder.toString() ;
//   }

}

