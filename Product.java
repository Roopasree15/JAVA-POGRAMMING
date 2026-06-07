import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product value is: " + a);
        System.out.println("Discount value is: " + b);
        int discountAmount = (a * b) / 100;
        int finalPrice = a - discountAmount;
        System.out.println("Final price after discount is: " + finalPrice);



    }
}