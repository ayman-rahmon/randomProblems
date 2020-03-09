public class ReverseInteger {


    public static void main(String[] args) {


        int i =  reverse(46512955) ;



    }




    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
//            System.out.println( "pop"+  pop ) ;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//            System.out.println("rev *10 " +  rev * 10);
            rev = rev * 10 + pop;
//            System.out.println(rev) ;
        }
        return rev;
    }


}
