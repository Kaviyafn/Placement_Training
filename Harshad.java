import java.util.*;
class Harshad{
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
if(original%sum==0){
System.out.println("Hashard number");

}
else{
System.out.println("Not Harshad");
}
}

}