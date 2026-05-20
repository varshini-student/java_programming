import java.util.Scanner;
public class program20{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int weight =scan.nextInt();
        float height=scan.nextFloat();
        float BMI=weight/(height*height);
        System.out.printf("BMI = %.2f",BMI);
    }
}