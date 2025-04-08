import java.util.*;
class Chess_game{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int bx=in.nextInt();
		int by=in.nextInt();
		int qx=in.nextInt();
		int qy=in.nextInt();
		for(int i=1;i<=r;i++){
			for(int j=1;j<=c;j++){
				if(i==bx && j==by){
					System.out.print("B ");
				}
				else if(i==qx && j==qy){
					System.out.print("Q ");
				}
				else{
					boolean bishopAttack=Math.abs(bx-i)==Math.abs(by-j);
					boolean queenAttack=(qx==i||qy==j||Math.abs(qx-i)==Math.abs(qy-j));
					if(bishopAttack && queenAttack){
						System.out.print("% ");
					}
					else if(bishopAttack){
						System.out.print("* ");
					}
					else if(queenAttack){
						System.out.print("& ");
					}
					else{
						System.out.print(". ");
					}
				}



			}
				System.out.println();
		}
}
}