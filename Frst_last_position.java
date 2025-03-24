import java.util.*;
public class Frst_last_position {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the target:");
        int target=in.nextInt();
        System.out.println("enter the number of elements:");
        int n=in.nextInt();
        int[] num=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
         int first=-1,last=-1;
        for(int i=0;i<num.length;i++){
            if(num[i]==target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println("["+first+"]"+"["+last+"]");

    }
}
