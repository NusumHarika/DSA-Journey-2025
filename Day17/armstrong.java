import java.util.*;

class Solution {
    static boolean armstrongNumber(int n) {
        int sum=0,digit=0,orig=n;
        while(n!=0){
            digit=n%10;
            n/=10;
            sum+=digit*digit*digit;
        }
        if(sum==orig){
            return true;
        }
        return false;
    }
}

public class armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sol=new Solution();
        boolean result = sol.armstrongNumber(n);
        System.out.println(result);
    }
}