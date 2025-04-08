import java.util.*;
class FirstNonRepeating
{
	public static void main(String args[])
	{
		int arr[]={-1, 2, -1, 3, 0};
                System.out.println(Arrays.toString(arr));
		for(int i=0;i < arr.length; i++)
		{
			Boolean isRepeating=false;
			for(int j=0;j < arr.length; j++)
			{
				if(i!=j && arr[i]==arr[j])
				{ 
					isRepeating=true;
					break;
				}
			}
		
		if(!isRepeating)
		{
			System.out.println(arr[i]);
                       return;
		}
              }
	}
}