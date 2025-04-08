import java.util.*;
class Largest_Digit_num{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int max_digit=0;
while(n>0){
int digit=n%10;
if(digit>max_digit){
 max_digit=digit;
}
n=n/10;
}
System.out.println(max_digit);

}

}