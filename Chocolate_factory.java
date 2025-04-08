import java.util.*;
class Chocolate_factory{
   public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the no of element:");
    int n=in.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements:");
    for(int i=0;i<n;i++){
         arr[i]=in.nextInt();
    }
    int index=0;
    for(int i=0;i<n;i++) {
        if(arr[i]!=0){
          arr[index++]=arr[i];
        }
    }
    while(index<n){
          arr[index++]=0;
    }
    System.out.println(Arrays.toString(arr));
  } 
}