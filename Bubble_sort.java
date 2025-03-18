import java.util.Arrays;
public class Bubble_sort {
    static   void Bubble_sorting(int arr[]){
        int n=arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped =true;
                }
            }
            if(!swapped){
                swapped=false;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={22,44,56,21,88,11};
        System.out.print("Original array:"+Arrays.toString(arr));
        Bubble_sorting(arr);
        System.out.println();
        System.out.print("sorted array:"+Arrays.toString(arr));
    }
}
