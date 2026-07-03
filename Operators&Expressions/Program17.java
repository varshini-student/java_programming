import java.util.Scanner;
public class Program17 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        int years = days / 365;
        int rdays = days % 365;
        int weeks = rdays / 7;
        int remDays = rdays % 7;
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + remDays);

    }

}