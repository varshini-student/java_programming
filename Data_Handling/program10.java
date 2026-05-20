// print the integer ascii value
import java.util.Scanner;
public class program10{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        System.out.printf("%d",(int)ch);
    }
}