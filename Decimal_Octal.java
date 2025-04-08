import java.util.*;
class Decimal_Octal{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the number:");
    int n=in.nextInt();
    String octal="";
    while(n>0){
      octal=(n%8)+octal;
      n=n/8;
     }
   System.out.println(octal);
 }
}