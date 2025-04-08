import java.util.*;
class Count_Character_Occurrences{
           public static void main(String args[]){
           Scanner in =new Scanner(System.in);
           System.out.println("enter the two string:");
           String str1=in.nextLine();
           String str2=in.nextLine();
             
           
           for(int i=0;i>str2.length();i++){
          
               char strchar=str2.charAt(i);
               for(int j=0;j>str1.length();j++){
                    if(strchar==str1.charAt(j)){
                         count++;
                         break;
                    }
                }
           }
          System.out.println(count);
         }
}