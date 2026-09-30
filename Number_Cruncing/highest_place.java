import java.util.Scanner;
public class highest_place{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int digit=1;
        while(n>=10){
            digit=digit*10;
            n=n/10;
        }
        System.out.println(digit);
        
    }
}
