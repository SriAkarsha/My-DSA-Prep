import java.util.*;
public class SeniorCitizen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        if((ch=='M' || ch=='m')&& a>=60){
            System.out.println("Senior Citizen");

        }else if((ch=='F' || ch=='f')&& a>=58){
            System.out.println("Senior Citizen");
            
        }else{
            System.out.println("Not a Senior Citizen");
        }
        sc.close();
    }
    
}