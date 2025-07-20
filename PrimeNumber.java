import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=1){
            System.out.println("Not Prime");
        }else{
        boolean ip=true;
        for(int i=2;i<=(int)Math.sqrt(a);i++){
            if(a%i==0){
                ip=false;
                break;
            }
        }
        if(ip){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
        sc.close();
    }
}
        
   