import java.util.*;
class Identify_Row_with_Most_1{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the no of rows and cols:");
int r=in.nextInt();
int c=in.nextInt();
int rowindex=-1;int maxones=0;
int matrix[][]=new int[r][c];
for(int i=0;i<r;i++){
int count=0;
for(int j=0;j<c;j++){
matrix[i][j]=in.nextInt();
if(matrix[i][j]==1){
count++;
}
if(count>maxones){
maxones=count;
rowindex=i;
}
}
}
System.out.println(rowindex);
System.out.println();
}
}
