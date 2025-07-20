import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0){
            System.out.println("No,not a Palindrome");
        }else{
        int org=a,rev=0,num=0;
        while(a!=0){
            num=a%10;
            rev=rev*10 +num;
            a=a/10;
        }
        if(org==rev){
            System.out.println("It is a Palindrome");
        }else{
        System.out.println("No,not a Palindrome");
        }
    }
        sc.close();
    }
}
        
   