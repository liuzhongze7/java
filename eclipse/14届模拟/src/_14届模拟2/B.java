package _14½ìÄ£Äâ2;
 
import java.time.LocalDate;
 
public class B {
    public static void main(String args[]){
        LocalDate date1=LocalDate.now();
        LocalDate date2=LocalDate.now();
        date1=date1.withYear(1949);
        date1=date1.withMonth(10);
        date1=date1.withDayOfMonth(1);
        date2=date2.withYear(2022);
        date2=date2.withMonth(1);
        date2=date2.withDayOfMonth(1);
        int res=0;
        while (!date1.equals(date2)){
            res++;
            date1=date1.plusDays(1);
        }
        System.out.println(res);
    }
}