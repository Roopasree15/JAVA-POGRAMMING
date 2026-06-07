import java.util.*;
public class Marbles{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int A=sc.nextInt();
	int B=sc.nextInt();
	int arr[]=new int[];
	int sum=0;
	int count =0;
	for(int i =1;i<N;i++){
		if(i%2!=0){
			count++;
			}
		else if(i%2==0){
			count++;
			} 		

	}
	count = count+sum;
	System.out.print(count);


			
}
}