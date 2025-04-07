import java.util.*;
class Primecheck{
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the number:");
    int n=in.nextInt();
    int count=0;
for(int i=1;i<=n;i++){
   if(n%i==0){
     count++;
   }
}
if(count==2){
System.out.println("the given number is prime");
}
else{
System.out.println("the given number is not prime");
}
}

}