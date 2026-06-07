import java.util.*;
public class Distance{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
String str =sc.nextLine();
int index=0;
int n =str.length();
int j =n-1;
for(int i=0;i<n;i++){
char ch1 =str.charAt(i);
char ch2 =str.charAt(j);
if(ch1 == ch2){
//j--;
continue;
}
else{
index=j-i;
break;
}
}
System.out.print(index);

}
}
