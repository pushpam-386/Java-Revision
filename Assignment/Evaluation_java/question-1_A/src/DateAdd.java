import java.time.LocalDate;

public class DateAdd {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.now().plusWeeks(1);
        LocalDate date2=LocalDate.now().plusMonths(1);
        LocalDate date3=LocalDate.now().plusYears(1);
        LocalDate date4=LocalDate.now().plusYears(10);

        System.out.println("1Week: "+date1);
        System.out.println("1 month: "+date2);
        System.out.println("1 year: "+date3);
        System.out.println("10 years: "+date4);

    }
}
