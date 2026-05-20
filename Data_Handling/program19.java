import java.util.Scanner;
public class program19{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int inches=scan.nextInt();
        float metres = inches *0.0254f;
        System.out.printf("%d inch is %.2f meters",inches,metres);
    }
}