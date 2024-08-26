public class S3_6_Question_on_operator {
     public static void main(String[] args) {
        // compound interest 

          /*
           CI=amt-p
           amt=p*(1+(1/100))**(r)
           */

          // So amt=p*Math.pow(1+(r/100), t);

          int p=1000, t=2;
          double r=2.50, amt, ci;

          amt=p*Math.pow(1+r/100,t);
          System.out.println("Amount=>"+amt);

          ci=amt-p;
          System.out.println("Compund Interest =>"+amt);
          System.out.println(ci);

     }
}
