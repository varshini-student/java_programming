// multiply two numbers
import java.util.Scanner;
public class program6{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
         
         long num1=scan.nextLong();
         long num2=scan.nextLong();
         long product=num1*num2;
         
         System.out.printf("%d",product);
    }
}