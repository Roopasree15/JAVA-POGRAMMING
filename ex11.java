
import java.util.Scanner;

public class ex11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = a>b?"a is greater":"b is greater";
        System.err.println(result);
    }
}