import java.util.Scanner;
//SANDER'S COMMENTARY:
// if you put something in that isn't an integer it crashes
// extra spaces after the "j"
// indexes start at 0 in arrays, may be best to rename for clarity.

public class inlU6_Ovning5_5 {
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
}
