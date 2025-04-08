import java.util.*;
class NeonNum{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int original=n;
int square=n*n;

int sum1=0;
while(n>0){
int digit1=n%10;
sum1=sum1+digit1;
n=n/10;
}


int sum2=0;
while(square>0){
int digit2=square%10;
sum2=sum2+digit2;
square=square/10;
}


if(sum1==sum2){
System.out.println("the given number is neon");
}
else{
System.out.println("not neon");
}

}
}