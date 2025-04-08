import java.util.*;
class Fibonacci{
public static void main(String args[]){
Scanner in =new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int a=0,b=1;
for(int i=0;i<n;i++){
System.out.println(a+ " ");
int next=a+b;
a=b;
b=next;
}


}
}