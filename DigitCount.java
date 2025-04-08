import java.util.*;
class DigitCounting{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int count=0;
while(n>0){
int digit=n/10;
count++;

}
System.out.println(count);

}

}