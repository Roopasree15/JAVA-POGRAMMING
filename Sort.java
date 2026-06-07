import java.util.*;
public class Sort{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		char[] sa=str.toCharArray();
		Arrays.sort(sa);
		int count = 0;
		for(int i =0;i<str.length();i++){
			char ca=str.charAt(i);
			char cs=sa[i];
			if(ca != cs){
				count ++;
}
}
System.out.print(count);
}
}