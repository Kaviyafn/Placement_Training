import java.util.*;
class DecimalToBinary{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the decimal num:");
int n=in.nextInt();
String binary="";
while(n>0){
binary=(n%2)+binary;
n=n/2;
}
System.out.println(binary);
}
}