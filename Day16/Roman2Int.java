import java.util.*;

class Convertion{
    public int R2I(String s){
        HashMap<Character, Integer> h=new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int p=0,c;
        int sum=0;
        for(int i=s.length()-1; i>=0; i--){
            c = h.get(s.charAt(i));
            if(p > c){
                sum -=c;
            }else{
                sum +=c;
            }
            p = c;
        }
        return sum;
    }
}

public class Roman2Int{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Convertion c=new Convertion();
        int result = c.R2I(s);
        System.out.println(result);
    }
}