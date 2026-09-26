import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}