import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        float D = scan.nextFloat();
        float yards=D*1760f;
        float feet=D*5280f;
        float inches=D*63360f;
        System.out.printf("Yards: %.1f\n",yards);
        System.out.printf("Feet: %.1f\n",feet);
        System.out.printf("Inches: %.1f\n",inches);
        
    }
}