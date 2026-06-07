
import java.util.Scanner;

public class ex7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score < 50){
            System.err.println("you need to improve");
        }
        else if (score >=50 && score <=70) {
            System.err.println("good job!!");
        }
        else if (score > 70) {
            System.err.println("excellent performance");
        }
        else{
            System.err.println("invalid ");
        }
    }
}