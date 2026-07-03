import java.util.Scanner;
public class Program10{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int l=scan.nextInt();
        int b=scan.nextInt();
        int area=l*b;
        int perimeter=2*(l+b);
        System.out.printf("Area: %d\n",area);
        System.out.printf("Perimeter: %d",perimeter);
    }
}