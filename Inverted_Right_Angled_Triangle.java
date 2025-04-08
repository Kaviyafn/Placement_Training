import java.util.*;
class Inverted_Right_Angled_Triangle{
       public static void main(String args[]){
           Scanner in=new Scanner(System.in);
           System.out.println("enter the n:");
           int n=in.nextInt();
         for(int row=1;row<=n;row++){
           for(int col=1;col<=(n-row)+1;col++){
                System.out.print("*");
           }
           System.out.println();
         }


      }

}