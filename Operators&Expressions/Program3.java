import java.util.Scanner;
public class Program3{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int H=scan.nextInt();
        float R=scan.nextFloat();
        float week=H*R;
        float month=(H*R*52)/12;
        float annual=H*R*52;
        System.out.printf("Weekly Gross Pay: %.1f\n",week);
        System.out.printf("Monthly Gross Pay: %.1f\n",month);
        System.out.printf("Annual Gross Pay: %.1f\n",annual);
        
    
    }
}