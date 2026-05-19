//  area of the circle
import java.util.Scanner;
public class program9{
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        float radius = scan.nextFloat();
        double area =3.14159*radius*radius;
        
        System.out.printf("%.3f",area);
    }
}