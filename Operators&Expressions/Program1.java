import java.util.Scanner;
public class program1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String empid=scan.next();
        int hours=scan.nextInt();
        float s=scan.nextFloat();
        float salary=hours*s;
        System.out.printf("Employee's ID = %s\n",empid);
        System.out.printf("Salary = Rs. %.2f",salary);
        
    }
}