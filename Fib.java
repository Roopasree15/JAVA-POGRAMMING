import java.util.*;
public class Fib{
public static void main(String[]args){
Scanner sc = new Scanner (System.in);
int a =sc.nextInt();
int arr[]=new int [a];
arr[0]=0;
arr[1]=1;
int sum=0;
for(int i=2;i<=a;i++){

sum = arr[i-1] + arr[i-2];
}

System.out.print(sum);
}
}
