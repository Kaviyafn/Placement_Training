import java.util.*;
//using Xor operator
class OddEvenBitwise1{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();

if((n^1)<n){
//or use, if((n^1)==1)EVEN: Odd
System.out.println("ODD");
}
else{
System.out.println("EVEN");

}


}

}