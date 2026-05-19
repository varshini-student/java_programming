//  printing the temprature of a fahrenheit
import java.util.Scanner;
public class program8{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        float c =scan.nextFloat();
        float f = c*9/5+32;
        System.out.printf("%.2f",f);
    }
}