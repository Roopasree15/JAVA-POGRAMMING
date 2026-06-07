import java.util.*;
public class Choco{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
//int sum1 =0;
int sum=0;
for(int i =1;i<=a;i++){
if(i%5==0){
sum+=i+4;

}
else{
sum=sum+i;

}
}
System.out.print(sum);
}
}

