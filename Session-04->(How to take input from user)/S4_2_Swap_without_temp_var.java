import java.util.Scanner;

public class S4_2_Swap_without_temp_var {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter value of a : ");
        int a=sc.nextInt();

        System.out.println("Enter value of b :");
        int b=sc.nextInt();

        System.out.println("Before swapping :\na : "+a+"\nb : "+b);

        // Logic to do swapping 
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swapping :\na : "+a+"\nb : "+b);
        sc.close();
        
    }    
}
