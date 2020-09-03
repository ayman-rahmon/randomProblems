public class IntToRoman {


    public static void main(String[] args) {

        System.out.println(intToRoman(10523));


        System.out.println(romanToInt("MCMXCV")) ;


    }


    public static String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder ro = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                ro.append(romanLiterals[i]);
            }
        }
        return ro.toString();
    }


    public static int romanToInt(String s) {
        int len = s.length();
        int sum = roman_int(s.charAt(0));
        if (len == 2) {
            if (roman_int(s.charAt(1)) > sum)
                sum = roman_int(s.charAt(1)) - sum;
            else
                sum = sum + roman_int(s.charAt(1));


        } else {
            // length is more than 2..
            int i = 0;
            sum = 0;

            while (i < len - 1)       //length = more than 2
            {
                if (roman_int(s.charAt(i)) >= roman_int(s.charAt(i + 1))) {
                    sum += roman_int(s.charAt(i));
                    i++;
                } else {
                    sum += roman_int(s.charAt(i + 1)) - roman_int(s.charAt(i));
                    i += 2;
                }

            }
            if (i == len - 1)              //for string len =1
            {
                sum += roman_int(s.charAt(i));

            }

        }

        return Math.abs(sum) ;
    }

    private static int roman_int ( char ch){
        int hi = 0;
        switch (ch) {
            case 'I':
                hi = 1;
                break;
            case 'V':
                hi = 5;
                break;
            case 'X':
                hi = 10;
                break;
            case 'L':
                hi = 50;
                break;
            case 'C':
                hi = 100;
                break;
            case 'D':
                hi = 500;
                break;
            case 'M':
                hi = 1000;
                break;
            default:
                System.out.println("invalid input");

        }
        return hi;
    }



}