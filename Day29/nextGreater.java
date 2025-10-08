import java.util.*;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        int [] result=new int[n];
        
        for(int i=0; i<n; i++){
            result[i]=-1;
        }
        
        for(int i=n-1;i>=0; i--){
            
            while(!s.isEmpty()&&s.peek()<=arr[i]){
                 s.pop();   
            }
            
            if(!s.isEmpty()){
                result[i]=s.peek();
            }
            
            s.push(arr[i]);
        }
        
        for(int i=0; i<n; i++){
            al.add(result[i]);
        }
        
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