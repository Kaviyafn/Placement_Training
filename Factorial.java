import java.util.*;
class Factorial{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int fact=1;
for(int i=1;i<=n;i++){
     fact=fact*i;
}
System.out.println("the factorial of "+n+" is "+fact);

}

}