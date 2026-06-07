
import java.util.Scanner;

public class ex9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String signal = sc.nextLine();
        if(signal.equals("red")){
            System.err.println("stop");
        }
        else if (signal.equals("yellow")){
            System.err.println("get ready");
        }
        else if (signal.equals("green")){
            System.err.println("go");
        }
        else{
            System.err.println("invalid");
        }
    }
}