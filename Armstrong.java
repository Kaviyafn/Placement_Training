import java.util.*;
class Armstrong{
public static void main(String arg[]){
Scanner in =new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int count=0;
while(n!=0){
n=n/10;
count++;

}
System.out.println(count);
int temp=n;int sum=0;
while(n>0){
int digit=n%10;
int product=1;
for(int i=1;i<=count;i++){

product=product*digit;
}

sum=sum+product;
n=n/10;

}
System.out.println(sum);
if(sum==n){
System.out.println("armstrong");
}
else{
System.out.println("not armstrong");
}


} 

}