import java.util.*;
public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int f=pr(a);
        System.out.println(f);
        sc.close();
    }
    public static int pr(int a){
        int count=0;
        for(int i=1;i<=(int)Math.sqrt(a);i++){
            if(a%i==0){
                if(i==a/i){
                    count++;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }
    
}