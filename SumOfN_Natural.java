import java.util.*;
class SumOfN_Natural{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int sum=0;
for(int i=0;i<=n;i++){
sum=sum+i;

}
System.out.println(sum);


}


}