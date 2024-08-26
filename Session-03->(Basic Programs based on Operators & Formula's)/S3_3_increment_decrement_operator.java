public class S3_3_increment_decrement_operator {
    public static void main(String[] args) {
        int a=10, b=20, c=5, d=-4;

        System.out.println("a++ : "+a++); // first print then increment 
        System.out.println(a); 

        System.out.println("++b : "+(++b)); // first increment and print simultaneously 

        System.out.println("c-- : "+c--); 
        System.out.println("After the first printing value of c =>"+c);
        System.out.println("--d : "+--d);

    }    
}
