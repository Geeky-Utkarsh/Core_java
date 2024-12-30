import java.util.*;

public class S4_4_WAP_to_convert_character_in_uppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter character : ");
        char ch=sc.next().charAt(0);
        

        System.out.println("Uppercase character is :\n==>"+(char)(ch-32));

        sc.close();
        
    }   
}

