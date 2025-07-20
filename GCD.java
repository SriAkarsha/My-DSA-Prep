import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int f=gcdf(a,b);
        System.out.println(f);
        sc.close();
    }
    public static int gcdf(int a,int b){
        if(a==0) return b;
        if(b==0) return a;
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
            
        }

        return a;
    }
    
}