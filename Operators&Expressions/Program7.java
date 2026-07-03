import java.util.Scanner;
public class Program7{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        float L=scan.nextFloat();
        float W=scan.nextFloat();
        float area=L*W;
        float yards=area/9;
        System.out.printf("%.2f",yards);
        
    }
}