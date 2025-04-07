import java.util.*;
class Parking_Iot{
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.println("enter the no of rows:");
	int r=in.nextInt();
	System.out.println("enter the no of cols:");
	int c=in.nextInt();
	int matrix[][]=new int[r][c];
 	int max_ones=0;int row_index=-1;
	for(int i=0;i<r;i++){
		int count=0;
		for(int j=0;j<c;j++){
		 matrix[i][j]=in.nextInt();
			if(matrix[i][j]==1){
		           count++;
			}
		       if(count>max_ones){
			max_ones=count;
			row_index=i;
			}
		}
	}
System.out.println(row_index);
System.out.println();

      
}
}
