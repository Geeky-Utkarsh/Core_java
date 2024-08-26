public class S3_8_Float_keyword_is_not_enough_use_f_suffix {
    public static void main(String[] args) {
        float my_Float=3.14f;   // Correct: 'f' suffix indicates it's a float

        double my_Double=3.14;  // Correct: treated as double by default

        // This will cause a compilation error because 3.14 is treated as double

        // float anotherFloat = 3.14; // Uncommenting this line will cause an error

        System.out.println("myFloat: " + my_Float);   // Output: myFloat: 3.14

        System.out.println("myDouble: " + my_Double);  // Output: myDouble: 3.14
    }
}
