import java.util.*;
public class Library{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		
		int K =sc.nextInt();
		int A =sc.nextInt();
                int arr[]=new int[K];
		int count=0;
		int sum =0;
		for(int i =0;i<K;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<K;i++){
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
		if(K>arr[i]){
			sum+=arr[i];
			}
		else{
			sum+=K;
		 }
}
System.out.print(sum);
}
}
		
		
					