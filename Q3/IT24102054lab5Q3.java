import java.util.Scanner;

public class IT24102054lab5Q3 {

     private static final double perroomcharge = 48000.00;
     private static final double discount_3To4days = 1.0;
     private static final double discount_5orMoredays = 0.2;
     private static final int maxdate = 31;
     private static final int mindate = 1;

     public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter the statrt date(1 -31) : ");
          int startdate = scanner.nextInt();

          System.out.println("enter  the end date (1 -31) : ");
          int enddate = scanner.nextInt();

          if (startdate < 1 || enddate > 31) {
               System.out.println("days must be between 1 and 31");
               return;
          }

          if (startdate > enddate) {
               System.out.println("start date must be less than end  date");
               return;
          }

          int numOfday = enddate - startdate;
          System.out.println("number of days resive : " + numOfday);

          double discount;

          if (numOfday <= 3) {
               discount = 0.1;
          } else if (numOfday >= 5) {
               discount = 0.2;
          } else {
               discount = 0;
          }
          double totaldays = perroomcharge * numOfday;
          double withdiscountdays = totaldays * discount;
          double finaltotaldays = totaldays - withdiscountdays;

          System.out.println("Total amout to be paid : " + finaltotaldays);

     }
}
