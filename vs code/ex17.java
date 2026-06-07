
import java.util.Scanner;

public class ex17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();

        for(int i =1;i<=10;i++){
  
            System.out.println(i + " x " + table  + " = " + (table * i));

        }

    }
}