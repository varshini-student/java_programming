import java.util.Scanner;
public class products_of_digits{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();
        long product=1;
        while(n!=0){
            long digit=n%10;
            product=product*digit;
            n=n/10;
        }
        System.out.println(product);
    }
}