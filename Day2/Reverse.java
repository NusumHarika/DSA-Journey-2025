import java.util.*;

class Solution {
    public int reverse(int x) {
        int rev=0,rem;
        while(x!=0){
            rem=x%10;
            if(rev < Integer.MIN_VALUE/10|| rev > Integer.MAX_VALUE/10){
                return 0;
            }
            rev=rev*10+rem;
            x/=10;
        }
        
        return rev;
    }
}

public class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Solution sol=new Solution();
        int result=sol.reverse(n);
        System.out.println(result);
    }
}