public class Kangroo {

    public static void main(String[] args) {


    }



    static String kangaroo(int x1, int v1, int x2, int v2) {

        int counter = 0 ;
            // (x1<=10000) || (x2<=10000)
        while(counter < 10000) {
            if((x1 ) == (x2) ) {
                return "YES" ;
            }
            x1 += v1 ;
            x2 += v2 ;
            counter++ ;
        }
        return "NO" ;
    }








}
