import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        int rev=0;
        int last;
        
        while(num>0){
            last=num%10;
            rev=rev*10+last;
            num=num/10;
        }
        System.out.printf("%d",rev);
    }
}