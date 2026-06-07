import java.util.Scanner;
public class Midval{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int mid = (a/100)%10;
        System.out.println("Mid value is: " + mid);
        String s = a%2==0 ? "Even" : "Odd";
        System.out.println("The number is: " + s);
    }
}
