//package Session-03->(Basic Programs based on Operators & Formula's);

public class S2_2_int_vs_bool{
    public static void main(String[] args) {
        int a=5, b=2;
        boolean c=true;
        // in {java} bool can not be converted into int 
        // incompatible types: boolean cannot be converted to int
        System.out.println(a+"<"+b+"="+c);

        // c=(a<b);

        System.out.println(a+"-"+b+"="+c);

        c=a<=b;
        System.out.println(a+"*"+b+"="+c);

        c=a>=b;
        System.out.println(a+"/"+b+"="+c);

        c=a==b;  
        System.out.println(a+"%"+b+"="+c);

        // System.out.println(c+c);  --> this will give error 
    }
}


/* 
In Java, boolean variables can only hold two values: true or false. 
They are not evaluated to 0 and 1 like in some other programming languages (such as C or C++).




Key Points:
Boolean Type: Java has a primitive type called boolean, which is used to represent truth values.
Values: A boolean variable can be assigned either true or false.

No Implicit Conversion: Unlike some languages where boolean values can be implicitly converted to integers (0 for false and 1 for true), Java does not allow this. You cannot perform arithmetic operations directly on boolean values.



This strict definition helps maintain clarity in the code and prevents confusion that might arise from treating boolean values as numerical values.
*/