
import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
       // System.out.println("hello world");
       // System.out.print("my name is  ");
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
       // String num1 = sc.nextLine();
      //  System.out.print("my age is  ");
        int num2= sc.nextInt();
        sc.nextLine();
        String add = sc.nextLine();
        System.out.println("my name is  "+num1);
        System.out.println("my age is  "+num2);
        System.out.println("my address is "+add);
      /*  if(num1==num2){
            System.out.println("both the numbers are equal");
        }
        else{
            System.out.println("both the numbers are not equal ");
        }*/

    }
}
