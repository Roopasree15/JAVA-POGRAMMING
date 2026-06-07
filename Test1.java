import java.util.*;
public class Test1{
public static void main(String[]args) {
 	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]= new int[n];
	int count =0;
	for(int i =0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	for(int i =0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i%j!=0){
				count++;
			}
			else{
			 System.out.print(arr[i]);
		}
}
}
System.out.print(count);
}
}