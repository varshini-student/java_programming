import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        float L=scan.nextFloat();
        float W=scan.nextFloat();
        float H=scan.nextFloat();
        float CP=scan.nextFloat();
        float C=scan.nextFloat();
        float Area=2*(L*H)+2*(W*H);
        float Gallons=Area/C;
        
        float Total=(int)(Gallons+0.9999)*CP;
        System.out.printf("Total Cost: %.2f",Total);
    }
}