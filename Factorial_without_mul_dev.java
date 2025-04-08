import java.util.*;
class Factorial_without_mul_dev{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();

int fact=n;
for(int i=n-1;i>0;i--){
int sum=0;

for(int j=0;j<i;j++){
sum=sum+fact;
}

fact=sum;
}
System.out.println(fact);
}
}