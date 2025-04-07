import java.util.*;
class SwapIntegerUsingBitwise{
public static void main(String args[]){
Scanner in =new Scanner(System.in);
System.out.println("enter the two numbers:");
int a=in.nextInt();
int b=in.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println("a:"+a);
System.out.println("b:"+b);





}
}