import java.util.*;
public class AmazingSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,a=1,b=-2;
        while(c < n){
            System.out.print(a+" ");
            a+=3;
           System.out.print(b+" ");
            b-=4;
            c++;
            }
            //num+=1;
            sc.close();
        }
    }
