
import java.util.Scanner;

public class ex8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        System.err.println("subject 1 : "+ sub1 );
        int sub2 = sc.nextInt();
        System.err.println("subject 2 : "+ sub2 );
        int sub3 = sc.nextInt();
        System.err.println("subject 3 : "+ sub3 );
        int sub4 = sc.nextInt();
        System.err.println("subject 4 : "+ sub4 );
        int sub5 = sc.nextInt();
        System.err.println("subject 5 : "+ sub5 );
        int total = (sub1 + sub2+ sub3+ sub4+ sub5);
        System.err.println("total marks : "+total);
        int avg = total / 5 ;
        System.err.println("average : "+avg);
        if (avg<35){
            System.err.println("additional class is required ");
        }
        else{
            System.err.println("you are good to go");
        }
        

    }
}