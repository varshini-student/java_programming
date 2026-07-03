import java.util.Scanner;
public class Program15{
    public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result =(num+8)/3;
        // result= result/3.0;
        result= result%5;
        result= result*5;
        
        System.out.printf("%.6f",(double)result);
    }
}