import java.util.Scanner;
public class Program13{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int amount=scan.nextInt();
        int n1 =amount/100;
        amount=amount%100;
        int n2 =amount/50;
        amount=amount%50;
        int n3 =amount/20;
        amount=amount%20;
        int n4=amount/10;
        amount=amount%10;
        int n5=amount/5;
        amount=amount%5;
        int n6=amount/2;
        amount=amount%2;
        int n7=amount/1;
        amount=amount%1;
        
        System.out.printf(n1 + " Note(s) of 100.00\n");
        System.out.printf(n2 + " Note(s) of 50.00\n");
        System.out.printf(n3 + " Note(s) of 20.00\n");
        System.out.printf(n4 + " Note(s) of 10.00\n");
        System.out.printf(n5 + " Note(s) of 5.00\n");
        System.out.printf(n6 + " Note(s) of 2.00\n");
        System.out.printf(n7 + " Note(s) of 1.00\n");
        
    }
}