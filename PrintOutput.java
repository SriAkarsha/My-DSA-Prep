import java.util.*;
public class PrintOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        float b=sc.nextFloat();
        sc.nextLine();
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        double d=sc.nextDouble();
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(ch);
        System.out.println(d);
        sc.close();
    }
    
}