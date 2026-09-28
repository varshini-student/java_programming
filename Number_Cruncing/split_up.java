import java.util.Scanner;
public class split_up{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();
        long first=n/100000;
        long second=n%100000;
        System.out.println(second +" "+ first);
}
}
