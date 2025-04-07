import java.util.*;
class SubSetCheck{
public static void main(String args[]){
int arr1[]={1,2,3,4,5};
int arr2[]={1,2,3};
boolean subset=true;

for(int i=0;i<arr2.length;i++){
   boolean found=false;
   for(int j=0;j<arr1.length;j++){
       if(arr2[i]==arr1[j]){
       found=true;
       break;
       }
    }
   if(!found){
   subset=false;
   break;
   }

}
System.out.println(subset);
}
}