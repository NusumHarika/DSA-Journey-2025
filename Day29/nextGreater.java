import java.util.*;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        int a=-1;
        boolean same=true;
        for(int i=0; i<n-1; i++){
            same=true;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    a=arr[j];
                    same=false;
                    break;
                }
            }
            if(!same){
                al.add(a);
            }else{
                al.add(-1);
            }
        }
        al.add(-1);
        return al;
    }
}

public class nextGreater{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        System.out.println(sol.nextLargerElement(arr));
    }
}