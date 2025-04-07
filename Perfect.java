import java.util.*;
class Perfect{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int temp=n;
int sum=0;
for(int i=1;i<n;i++){
if(n%i==0){
sum=sum+i;
}
}
if(sum==temp){
System.out.println("Perfect");
}
else{
System.out.println("not perfect");
}

}

}