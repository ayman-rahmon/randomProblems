public class TimeConversion {



    public static void main(String[] args) {

        System.out.println(timeConversion("07:05:45PM"));
    }


    static String timeConversion(String s) {


        String[] items = s.split(":");
        String dayNightFlag = items[items.length-1].substring(2);
        System.out.println(dayNightFlag) ;
        StringBuilder builder = new StringBuilder();
        if(dayNightFlag.equals("AM")) {
            if(items[0].equals("12")) {
                
            }
        }

    return null ;
    }




}
