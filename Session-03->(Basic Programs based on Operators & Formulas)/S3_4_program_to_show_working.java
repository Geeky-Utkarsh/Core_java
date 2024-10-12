public class S3_4_program_to_show_working {
    public static void main(String[] args) {
        int a=1, b=2, c=3, d=4;
        int expression=a++ + ++b +c -- - --d;
        // 1 + 3 + 3 -3
        System.out.println("Value of expression is =>"+expression);


        expression=a++ + a++ - --b - --b + ++c - --d;
        // 2 + 3 - 2 +4 - 3
        System.out.println("Value of expression is =>"+expression);

    }
}
  