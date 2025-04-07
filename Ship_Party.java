import java.util.*;
class Ship_Party{
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.println("enter the time:");
	int T=in.nextInt();
	System.out.println("enter the elements for entry:"); 
        int E[]=new int[T];
 	for(int i=0;i<T;i++){
         E[i]=in.nextInt();
	}

	System.out.println("enter the elements for left:");
	int L[]=new int[T];
         for(int i=0;i<T;i++){
         L[i]=in.nextInt();
	}

         
       int on_ship=0;
	int current_guest=0;
	for(int i=0;i<T;i++){
                current_guest+=E[i];
		current_guest-=L[i];
      if(current_guest>on_ship){
       on_ship=current_guest;

         }
		
       	}
	System.out.println(on_ship);
}

}