import java.util.*;
class Palindrome{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int rev=0;
int temp=n;
while(n>0){
int digit=n%10;
rev=(rev*10)+digit;
n=n/10;

}
System.out.println (rev);
if(rev!=temp){
System.out.println("the given number is not palindrome");
}
else{
System.out.println(" the given number is  palindrome");
}


}


}