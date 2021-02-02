import java.util.Locale;

/// https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/java
class Meeting {

    public static String meeting(String s) {
        // your code
        String[] names = s.split(";") ;
        StringBuilder builder = new StringBuilder();
        String temp  ;
//        int count = 0 ;
        // capetelizing and sorting...
        for(int i = 0 ; i< names.length - 1 ; i++){
            //builder.append("(");
//            System.out.println( i + " = " + names[i]) ;
            for(int j = 0 ; j < names.length   - i - 1 ;j++) {
                if(names[j].split(":")[1].toLowerCase().compareTo(names[j+1].split(":")[1].toLowerCase()) > 0){
                    // first last name is bigger so we swap(bubble sort logic)...
//                    System.out.println("first swap(depending on last name) happened...");
                    temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp ;
                }else if(names[j].split(":")[1].toLowerCase().compareTo(names[j+1].split(":")[1].toLowerCase()) == 0) {
                    // the last names are equal so we compare first names (bubble sort logic)...
                    //System.out.println("second swap(depending on first name) happened..." + names[i] +" && " +names[j] );
                  if(names[j].split(":")[0].toLowerCase().compareTo(names[j+1].split(":")[0].toLowerCase()) > 0) {
//                    System.out.println("second swap(depending on first name) happened..." + names[j] +" && " +names[j+1] );
//                    System.out.println("second swap(depending on first name) happened...");
                      temp = names[j];
                      names[j] = names[j+1];
                      names[j+1] = temp ;
                  }
                }
            }
           System.out.print(i + " = ") ;
           printArray(names);
           //  builder.append( names[count].split(":")[1].toUpperCase()+", "+names[i].split(":")[count].toUpperCase()+")");
        }
        // build answer...
        for(int i = 0 ; i < names.length ; i++ ) {
            builder.append("(");
            builder.append( names[i].split(":")[1].toUpperCase()+", "+names[i].split(":")[0].toUpperCase()+")");
        }
        return  builder.toString();
    }
    private static void printArray(String[] arr) {
        System.out.print("[");
        for(int i = 0  ; i < arr.length ; i++) {
            if(i == arr.length-1) {
                System.out.print(arr[i]);
            break ;
            }
            System.out.print(arr[i] + ",");

        }
        System.out.println("]");

    }
}
