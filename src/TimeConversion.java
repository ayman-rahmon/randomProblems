import java.util.HashMap;

public class TimeConversion {



    public static void main(String[] args) {

        System.out.println(timeConversion("12:40:22AM"));
    }


    static String timeConversion(String s) {
//        String[] hours12 = {"12","01","02","03","04","05","06","07","08","09","10","11"} ;
//        String[] hours24 = {"00","13","14","15","16","17","18","19","20","21","22","23"} ;
        HashMap<String,String> hours12to24 =  new HashMap<>();
        hours12to24.put("12","00");
        hours12to24.put("01","13");
        hours12to24.put("02","14");
        hours12to24.put("03","15");
        hours12to24.put("04","16");
        hours12to24.put("05","17");
        hours12to24.put("06","18");
        hours12to24.put("07","19");
        hours12to24.put("08","20");
        hours12to24.put("09","21");
        hours12to24.put("10","22");
        hours12to24.put("11","23");


        String[] items = s.split(":");
        String dayNightFlag = items[items.length-1].substring(2);
        String seconds = items[items.length-1].substring(0,2);
        System.out.println(dayNightFlag) ;
        StringBuilder builder = new StringBuilder();
        if(dayNightFlag.equals("AM")) {
            if(items[0].equals("12")) {
                builder.append(hours12to24.get("12")+":"+items[1]+":"+seconds) ;
            }else {
                builder.append(items[0]+":"+items[1]+":"+seconds);
            }
        }else if (dayNightFlag.equals("PM")) {
                if(items[0].equals("12")) {
                    builder.append(items[0]+":"+items[1]+":"+seconds);
                }else {
                    builder.append(hours12to24.get(items[0])+":"+items[1]+":"+seconds);
                }

        }

    return builder.toString() ;
    }




}
