import java.util.*;
class Hollow_Square{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(i==1||i==n||j==1||j==n){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
}
}
}