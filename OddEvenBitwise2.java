import java.util.*;
//using or operator
class OddEvenBitwise2{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();

if((n|1)>n){
System.out.println("EVEN");
}
else{
System.out.println("ODD");

}


}

}