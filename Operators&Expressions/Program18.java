import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int firstDigit = num / 10000;
        int secondLastDigit = (num / 10) % 10;
        int sum = firstDigit + secondLastDigit;
        System.out.println(sum);

    }

}