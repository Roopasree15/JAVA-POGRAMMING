
import java.util.Scanner;

public class ex21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        do{
            System.out.println("enther the number >10 :");
            count = sc.nextInt();
        } while (count <10);
    }
}