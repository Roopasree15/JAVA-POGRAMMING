import java.util.*;
public class Red{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
int arr[]=new int[a];
int count =0;
for(int i =0;i<a;i++){
arr[i]=sc.nextInt();
}
for(int i =0;i<a-1;i++){
if(arr[i]%2!=0){
  if(arr[i+1]%2==0){
         count++;
}
}
}
System.out.print(count);
}
}