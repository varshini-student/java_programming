import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
         int subject1 = scan.nextInt();
         int subject2 = scan.nextInt();
         int subject3 = scan.nextInt();
         int marks = subject1+subject2+subject3;
         float average = marks/3f;
         System.out.printf("Total Marks: %d\n",marks);
         System.out.printf("Average Marks: %.2f",average);
         
    }
}