import java.util.*;
class EvenOddSwiftOperator{
public static void main(String arg[]){
Scanner in =new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
if(((n>>1)<<1)==n){
System.out.println("EVEN");
}
else{

System.out.println("ODD");
}


}

}