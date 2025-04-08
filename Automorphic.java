import java.util.*;
class Automorphic{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int orignal=n;
int square=n*n;
while(orignal>0){
if((square%10)!=(orignal%10)){
System.out.println("Not Automorphic");
return;
}
square=square/10;
orignal/=10;
}

System.out.println("Automprphic");

}


} 