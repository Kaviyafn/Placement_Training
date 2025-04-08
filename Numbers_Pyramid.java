import java.util.*;
class Numbers_Pyramid{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=n-i;j++){
System.out.print(" ");

}
for(int k=1;k<=2*i-1;k++){
System.out.print(i);
}
System.out.println();
}





}
}