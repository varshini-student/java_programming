import java.util.Scanner;
public class Program2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        float R=scan.nextFloat();
        float L=scan.nextFloat();
        float W=scan.nextFloat();
        float B=scan.nextFloat();
        float H=scan.nextFloat();
        float Circle=3.14159f*(R*R);
        float Rectangle=L*W;
        float Triangle=0.5f*(B*H);
        System.out.printf("Area of a Circle: %.5f\n",Circle);
        System.out.printf("Area of a Rectangle: %.1f\n",Rectangle);
        System.out.printf("Area of a Triangle: %.1f\n",Triangle);
    }
}