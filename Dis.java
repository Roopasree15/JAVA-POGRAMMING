import java.util.*;
public class Dis{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int arr []= new int[a];
		for(int i =0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		List<Integer> uniqueset = new ArrayList<>();
uniqueset.add(arr[0]);
for(int i =1;i<a;i++){
uniqueset.add(arr[i]);
}
System.out.print(arr[]);
}
}