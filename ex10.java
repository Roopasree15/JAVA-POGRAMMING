
import java.util.Scanner;

public class ex10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("enter your salary: ");
        int salary = sc.nextInt();
        System.err.print("enter your age : ");
        int age = sc.nextInt();
        if (salary >=20000 && age <=25){
            System.err.println("eligible for loan");
            System.err.print("enter your loan amount: ");
            int loan = sc.nextInt();
            if(loan <=50000){
                System.err.println("loan available");
            }
            else{
                System.err.println("loan unavailable");
            }
        }
        else{
            System.err.println("not eligible");
        }
    }
}