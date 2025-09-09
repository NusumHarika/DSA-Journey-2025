import java.util.*;

class Solution {
    void selection(int[] arr) {
        // code here
        int small;
        int smallidx;
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            small=arr[i];
            smallidx=i;

            for(int j=i+1;j<n;j++){

                //finding the smallest element in the unsorted part
                if(small>arr[j]){
                    small=arr[j];
                    smallidx=j;
                }
            }

            //swap the smallest element and first element in unsorted part
            int temp=arr[i];
            arr[i]=arr[smallidx];
            arr[smallidx]=temp;
        }
    }
}

public class selectionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        sol.selection(arr);

        //printing the sorted array
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}