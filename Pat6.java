import java.util.*;
public class Pat6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if(i==1 || i==n){
                for(int k=1;k<=n;k++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                 for(int k=1;k<=n-2;k++){
                    System.out.print(" ");
                }
                System.out.print("*");

            }
            System.out.println();
        }
        
        sc.close();
    }
}