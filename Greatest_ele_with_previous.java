import java.util.*;
class Greatest_ele_with_previous{
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.println("enter the no of elements:");
        int n=in.nextInt();
	System.out.println("enter the elements:");
	int arr[]=new int[n];
       for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
	}
      int count=1;
	for(int i=1;i<n-1;i++){
	if(arr[i]<arr[i+1]){
         count++;
	}
	}
System.out.println("the total count of greatest is:"+count);

}
}