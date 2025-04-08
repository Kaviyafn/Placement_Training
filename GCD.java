import java.util.*;
class GCD{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the two numbers:");
int a=in.nextInt();
int b=in.nextInt();
int pro=a*b;
while(b!=0){
int rem=a%b;
a=b;
b=rem;

}
System.out.println("the GCD is: "+a);
int GCD=a;
int LCM=pro/a;
System.out.println("the LCM is: "+LCM);

}

}
