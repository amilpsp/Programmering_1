import java.util.Scanner;

public class Lektion6_KlotAreaOchVolym {

    public static void main(String[]args){

        //KlotArea = 4 · pi · r²
        //KlotVolym = (4 · pi · r³)/3

        Scanner rVarde = new Scanner(System.in);
        System.out.println("Bestäm värden av klotets radius: ");
        double r = rVarde.nextDouble();

        double klotArea = 4 * Math.PI * Math.pow( r , 2 );
        double klotVolym = (4 * Math.PI * Math.pow( r , 3 ) ) / 3;

        int klotAreaRounded = (int)Math.round(klotArea);
        int klotVolymRounded = (int)Math.round(klotVolym);

        System.out.println("Arean av klotet är: " + klotAreaRounded );
        System.out.println("Volymen av klotet är: " + klotVolymRounded );
    }
}
