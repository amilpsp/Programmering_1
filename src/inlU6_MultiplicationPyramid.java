import java.util.Scanner;
//SANDER'S COMMENTARY:
// if you put something in that isn't an integer it crashes
// indexes start at 0 in arrays, may be best to rename for clarity.
public class inlU6_MultiplicationPyramid {
    public static void main(String[]args){
        Scanner antalRaderScan = new Scanner(System.in);

        System.out.print("Vilken antal rader vill du ha? ");
        int antalRader = antalRaderScan.nextInt();

        int i; int j;
    /*      2022-05-16
            Martin showed me this more reader-friendly way of looping this.
            Although mine could have a slightly better performance,
            because it relies on addition (simpler and faster operation to do).*/
        for (i =1; i<=antalRader; i++){
            for (j =1; j<=i; j++){
                if ( i * j != (i*i) )
                        System.out.print(i*j+" ");
                    else
                        System.out.print(i*j);
        }
        System.out.println();
    }
    /*   My initial solution (I'm still very proud of it <3)

    for ( i = 1 ; i <= antalRader; i++ ){
        if (i == 1)
            System.out.print(i);
        else
            System.out.print( i + " ");

        for ( j = i * 2 ; j <= (i*i) ; j += i ){
            if (j != (i*i) )
                System.out.print(j + " ");
            else
                System.out.print(j);
        }
        if (i != antalRader)
            System.out.println();
        }*/
    }
}
