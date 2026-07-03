import java.util.Scanner;
public class Program9{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        float f=scan.nextFloat();
        float c=5.0f/9.0f*(f-32);
        System.out.printf("%.2f",c);
    }
}