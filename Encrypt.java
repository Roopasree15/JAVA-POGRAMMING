import java.util.*;
public class Encrypt{
public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	String str = sc.nextLine();
	int x=sc.nextInt();
	int y=sc.nextInt();
	for(int i =0;i<str.length();i++){
		char ch = str.charAt(i);
                if(i%2!=0){
		   	 