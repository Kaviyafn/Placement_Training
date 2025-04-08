import java.util.*;
class binaryaddition{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		System.out.println("enter the binary numbers:");
		String a=in.nextLine();
		String b=in.nextLine();
		String temp="";
		String sum="";
		char x,y,c='0';
		int i = a.length()-1;
		int j = b.length()-1;
		if(i<j)
		{
			temp = a;
			a = b;
			b = temp;
		}
		i = a.length()-1;
		j = b.length()-1;
		while(j>=0)
		{
			x = a.charAt(i);
			y = b.charAt(j);
			temp = add(x,y,c);
			c = temp.charAt(0);
			sum = temp.charAt(1)+sum;
			i--;
			j--;
			//System.out.println("x  y   c   sum");
			//System.out.println(x+" "+y+" "+c+" "+sum);
		}
		while(i>=0)
		{
			x = a.charAt(i);
			y = '0';
			temp = add(x,y,c);
			c = temp.charAt(0);
			sum = temp.charAt(1)+sum;
			i--;
			//System.out.println("x  y   c   sum");
			//System.out.println(x+" "+y+" "+c+" "+sum);

		}	
		if(c!='0')
			sum = c + sum;
		System.out.println(sum);		
	}
	public static String add(char x, char y, char c)
	{
		String r = "";
		if(c=='0')
		{
			if(x=='0' && y=='0')
				r ="00";
			else if(x=='0' && y=='1')
				r ="01";
			else if(x=='1' && y=='0')
				r="01";
			else
				r="10";
		}	
		else
		{
			if(x=='0' && y=='0')
				r="01";
			else if(x=='0' && y=='1')
				r="10";
			else if(x=='1' && y=='0')
				r="10";
			else
				r="11";
		}
	return r;
	}
}

