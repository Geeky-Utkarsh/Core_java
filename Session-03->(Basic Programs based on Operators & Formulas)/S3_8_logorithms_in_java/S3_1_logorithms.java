public class S3_1_logorithms{
    public static void main(String[] args) {
        /*
        Java provides several logarithmic functions through the Math class, which offers a variety of mathematical operations, including logarithms.
         */

        //  Natural logarithm ln ==> 
        double res=Math.log(10);
        System.out.println("Natual log Ln is =>"+res);

        // Logarithm to base 10
        double res_1=Math.log10(100);
        System.out.println("Logarithm to base 10 is =>"+res_1);

        // Logarithm to arbitary base : => Java does not have a direct method for logarithms with an arbitrary base, but you can compute it using the formula
        // So ,    we have to do it in steps like logb(x)=loge(x)/loge(b)

        double x = 32;
        double base = 2;

        double res_3 = Math.log(x) / Math.log(base);  // Logarithm base 2 of 32
        System.out.println("Logarithm to arbitary base is not supported by java , So we have to use some trick for ==>"+res_3);  // Output: 5.0

    }
}