import java.util.Scanner;
public class program15{
    public static void main(String args []){
        Scanner scan=new Scanner(System.in);
        float num=scan.nextFloat();
        int precision=scan.nextInt();
        System.out.printf("%." + precision +"f",num);
    }
}