//import org.w3c.dom.ls.LSOutput;
//
//import javax.swing.text.DateFormatter;
//import java.time.LocalDate;
//import java.time.Period;
//import java.time.temporal.TemporalAmount;
//import java.util.Locale;
//
//public class Test {
//    public static void main(String[] args) {
//        Test test = new Test();
//        LocalDate start = LocalDate.of(2023 , 1 , 1);
//        LocalDate end = LocalDate.of(2023 ,3 , 30 );
//        Period period = Period.ofDays(7);
//        test.perfroAnimals(start , end , period);
//
//
//        System.out.println(" Formatting");
//        DateFormatter formatter = DateFormatter.ofPattern("dd.MM.yyy HH:mm z");
//        System.out.println();
//    }
//    // formatting
//
//
//    public void perfroAnimals(LocalDate start , LocalDate end , Period period){
//        LocalDate upto = start ;
//        while (upto.isBefore(end)){
//            System.out.println("give toy" + upto.toString());
//            upto = upto.plus(period);
//        }
//    }
//
//}
