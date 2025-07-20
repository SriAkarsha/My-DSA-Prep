import java.util.*;
public class Alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=1,c=0;
        while(c<n){
            if(num%4!=0){
                if((c+1)%2==0){
                    System.out.print(-num+" ");

                }else{
                    System.out.print(num+" ");
                }
                c+=1;
            }
            num+=1;
        }
        sc.close();
    }
}