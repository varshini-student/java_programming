// add two numbers
import java.util.Scanner;
public class program5{
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        
        long num1=scan.nextLong();
        long num2=scan.nextLong();
        long add=num1+num2;
        
        System.out.printf("%d",add);
    }
}