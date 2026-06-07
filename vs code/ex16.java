
import java.util.Scanner;

public class ex16{
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int [] num = new int [10];
        for (int i = 0 ;i<=9;i++){
           num[i]=sc.nextInt();
        }
        for(int i = 0 ; i<=9;i++)
        {
        System.err.println(num[i]);
        }
       
    }
}