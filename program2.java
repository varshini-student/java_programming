// printing a single character
import java.util.Scanner;
public class program2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        char ch =scan.next().charAt(0);
        System.out.printf("%c",ch);
    }
}