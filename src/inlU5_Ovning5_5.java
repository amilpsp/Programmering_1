import java.util.Scanner;

public class inlU5_Ovning5_5 {
    public static void main(String[]args){
        Scanner antalRaderScan = new Scanner(System.in);

        System.out.print("Vilken antal rader vill du ha? ");
        int antalRader = antalRaderScan.nextInt();

        int i; int j;

        for ( i = 1 ; i <= antalRader; i++ ){
            System.out.print( i + " ");

            for ( j = i * 2 ; j <= (i*i) ; j += i ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}//
