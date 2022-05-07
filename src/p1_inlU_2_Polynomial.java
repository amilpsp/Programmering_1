import java.util.Scanner;

public class p1_inlU_2_Polynomial {
    public static void main(String[]args){
        double p = 3.0;
        double q = 1.0;

        Scanner scanX = new Scanner(System.in);
/*Print out first instructions for the user so that
they know what is needed from them in the terminal*/
        System.out.print(
                """
                Givet är polynomet: y = x^2 + p * x + q
                Skriv in värden av x, tack:
                """
        );
        double x = scanX.nextDouble();
//Declaring the variable to store the polynomial in.
        double polynomial = (x * x) + (x * p) + q;

        System.out.println("Värden av \"y\" är  " + polynomial);

/*____________________________STEP 2_________________________________
                Calculating and printing the roots*/

        final double halfPpow2= Math.pow((p/2),2) ;   //post-inlämning
        final double pqSqrt = Math.sqrt(halfPpow2-q);
        double root1 = -(p/2) + pqSqrt;
        double root2 = -(p/2) - pqSqrt;

        System.out.println("Rötterna är:");
        System.out.println("    X_1 = " + root1);
        System.out.println("    X_2 = " + root2);

    }
    
 }