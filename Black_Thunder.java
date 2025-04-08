import java.util.*;
class Black_Thunder{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("enter the name: ");
		String name=in.nextLine();
		if(name.length()<3){
			System.out.println("invalid name");
		}
		else if(name.length()>=3){
		char first=name.charAt(0);
		char last=name.charAt(name.length()-1);
		boolean check=false;
		for(int i=1;i<name.length()-1;i++){
		   char ch=name.charAt(i);
			if(ch=='k'||ch=='K'){
				check=true;
			}
		}
		if((first=='B'||first=='L') && (last=='E' || last=='R')){
		   if(check){
		    System.out.println("yes");
		   }
		   else{
		    System.out.println("No");	
		   }
		}
		else{
		System.out.println("invalid");
		}
	   }			
	}
}