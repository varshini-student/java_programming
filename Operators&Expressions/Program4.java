import java.util.Scanner;
public class Program4{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int months=A*12;
        int days=A*365;
        int hours=A*365*24;
        long seconds=A*365*24*3600;
        System.out.printf("Ages in Months: %d\n",months);
        System.out.printf("Ages in Days: %d\n",days);
        System.out.printf("Ages in Hours: %d\n",hours);
        System.out.printf("Ages in Seconds: %d\n",seconds);
        
    }
}