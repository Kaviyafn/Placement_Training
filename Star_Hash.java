import java.util.*;
class Star_Hash{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
                String str=in.nextLine();
		int s_count=0;
		int h_count=0;
		for(int i=0;i<str.length();i++){
                    char ch=str.charAt(i);
                   if(ch=='*'){
			s_count++;
 	         }
	         else{
			h_count++;
		}
                }
 		System.out.println(s_count-h_count);

	}
}