import java.util.*;
class StrongNum{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int real=n;
int sum=0;
while(n>0){
int digit=n%10;
int fact=1;
for(int i=1;i<=digit;i++){
fact=fact*i;
}
sum=sum+fact;
n=n/10;
}
if(real==sum){
System.out.println("Strong");
}
else{
System.out.println("Not Strong");
}

}

}