import java.util.*;
//using and operator
class OddEvenBitwise{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();

if((n&1)==1){
//or use, if((n&1)==0)EVEN: Odd
System.out.println("ODD");
}
else{
System.out.println("EVEN");

}


}

}