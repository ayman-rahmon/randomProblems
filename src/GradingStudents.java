import java.util.ArrayList;
import java.util.List;

public class GradingStudents {


    public static void main(String[] args) {
            List<Integer> input = new ArrayList<>();
            input.add(73) ;
            input.add(67) ;
            input.add(38) ;
            input.add(33);

        System.out.println(gradingStudents(input));


    }



    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        for(int i =0 ; i < grades.size() ; i++) {
            if(grades.get(i) < 38) {
                results.add(grades.get(i)) ;
                continue;
            } else {

                if((grades.get(i) % 10 ) > 2 && (grades.get(i) % 10 ) < 5 ) {
                    results.add((int) round(grades.get(i)) );

                } else if ((grades.get(i) % 10 ) > 7 && (grades.get(i) % 10 ) <= 9 ) {
                    results.add((int) round(grades.get(i)) );

                } else if (grades.get(i) % 5 == 0)  {
                    results.add(grades.get(i)) ;
                }else {
                    results.add(grades.get(i)) ;
                }
//                results.add((int)round2(grades.get(i)) );

            }

//            if((grades.get(i) % 10) > 2 && (grades.get(i) % 10) < 5) {
//                results.add((int) round2(grades.get(i))) ;
//            }
        }


        return results ;
    }


    private static double round(int x) {
        if(x % 5 == 0) {
            return (Math.floor(x/5) * 5) ;
        } else {
            return (Math.floor(x/5) * 5) + 5 ;
        }
    }


}
