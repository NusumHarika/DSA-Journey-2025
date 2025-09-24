import java.util.*;
class Solution{
    public boolean isSubsequence(String s, String t) {
        int ls=s.length();
        int lt=t.length();
        int idx=0,newidx=0;
        for(int i=0;i<ls;i++){
            char c=s.charAt(i);

            if(idx==newidx && idx!=0){
                return false;
            }else{
                idx=newidx;
            }
            
            for(int j=idx+1;j<lt;j++){
                if(c==t.charAt(j)){
                    newidx=j;
                }
            }
        }
        return true;
    }
}

public class Subsequence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t=sc.next();
        String s=sc.next();
        Solution sq=new Solution();
        boolean result=sq.isSubsequence(s,t);
        System.out.println(result);
    }
}