import java.util.*;
public class Book{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
int b = sc.nextInt();
int arr[]=new int[a];
int count =0;
int sum=0;
for(int i =0;i<a;i++){
arr[i]=sc.nextInt();
}
for(int i =1;i<=a;i++){
for(int j =1;j<i;j++){
if(i%j==0){
count++;
 }
 }
if(count==2){
 if(arr[i-1]>b){
 sum +=  b;}
else{
sum+=arr[i-1];
 }
}
}
System.out.print(sum);
}
}
