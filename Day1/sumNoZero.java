import java.util.*;

class Result{
    public int[] sum(int n){
        int [] arr=new int[2];
        int a,b;
        for(int i=1;i<=n;i++){
            a=i;
            b=n-i;
            if(nozero(a) && nozero(b)){
                arr[0]=a;
                arr[1]=b;
                break;
            }
        }
        return arr;
    }

    public boolean nozero(int num){
        while(num!=0){
            if(num%10==0){
                return false;
            }
            num/=10;
        }
        return true;
    }

    
}

public class sumNoZero{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Result s=new Result();
        int [] a=s.sum(n);
        System.out.println("[ "+a[0]+", "+a[1]+" ]");
    }
}