import java.util.*;
public class Crypto{
public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	String str = sc.nextLine();
	for(int i =0;i<str.length();i++){
		char ch = str.charAt(i);
			if(ch=='a'){
			System.out.print('z');
			}
			else{
			System.out.print((char)(ch-1));
			}
	         	}
}
} 