import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int f=fact(a);
        System.out.println(f);
        sc.close();
    }
    public static int fact(int a){
        if(a==0 || a==1) return 1;
        else return a*fact(a-1);
    }
    
}