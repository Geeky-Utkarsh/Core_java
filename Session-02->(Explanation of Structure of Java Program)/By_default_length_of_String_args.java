import java.util.Arrays;

public class By_default_length_of_String_args{
    public static void main(String[] args){
        System.out.println("Command-line arguments: " + Arrays.toString(args));


            if (args.length == 0)
                System.out.println("No command-line arguments passed.");
            else
                System.out.println("Command-line arguments:");
    }

}


