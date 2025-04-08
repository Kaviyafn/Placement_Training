import java.util.*;
class GoodNum{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int original=n;
int sum=0;
while(n>0){
int digit=n%10;
sum=sum+digit;
n=n/10;
}
System.out.println(sum);
if(original%sum==0){
System.out.println(" The give number is GoodNumber");
}
else{
System.out.println("The given number is Bad Number");
}
}
}