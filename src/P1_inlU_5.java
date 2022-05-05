import java.util.Scanner;

public class P1_inlU_5 {
    public static void main(String[]args){
        int x = scanForX();
        varArX(x);
         //In what value range is X at? */
    }
    public static void dubbelPlusOchMinusExample(){

        int i, k, m, n;
        i = 4; k = 7;
        n = ++i * --k;          //prefix, n får värdet 5*6, dvs. 30
//      m = i++ * k--;          //postfix, m får värdet 4,7, dvs. 28
        System.out.println(n);

    }
    public static void forLoop(){

        int k; int n = 5;
        System.out.print("k =");

        //   innit  condition  increment
        for ( k = 0 ; k < 6 ; k += 2){
            System.out.print(" " + k);
        }
    }
    public static void whileLoop(){
        int k = 0;
        String s = "k = " ;

        while( k < 6) {
            s = s + " " + k;
            k = k + 2;
        }
        System.out.print(s);
    }
    public static int scanForX(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv ett nummer: ");
        int x = scan.nextInt();
        return x;
    }
    public static void varArX(int x){
        if (x == 10)
            System.out.println("x = 10");
        else if (x < 10 && x > 0)
            System.out.println("x är mindre än 10, men större än 0");
        else if ( x < 0 && x != 0 )
            System.out.println("x är negativ");
        else
            System.out.println("x är större än 10");
    }
}
