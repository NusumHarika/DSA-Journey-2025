import java.util.*;

class Solution {
    public int countDigits(int n) {
        // code here
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
}

public class digits{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sol=new Solution();
        int dig=sol.countDigits(n);
        System.out.println(dig);
    }
}