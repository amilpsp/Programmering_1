import java.util.Scanner;

public class P1_class5_Losgodis {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);
    /*
        System.out.print("Hur många gram? ");

        int gram = scan.nextInt();
        System.out.print("Pris per hekto? ");

        double hgpris = scan.nextDouble();
        double pris = gram * hgpris / 100;

        if (pris >= 100) {
            double rabatt = pris / 10;
            double rabatteratGodis = pris - rabbat;
            System.out.println("Det kostar " + rabatteratGodis + "kr");
                else System.out.println("Det kostar " + pris + "kr");
        }

    */
        System.out.println("Mata in varans pris inklusive moms: ");
        double prisInklusiveMoms = scan.nextDouble();

        System.out.println("Mata in moms %: ");
        int moms = scan.nextInt();
        double m = 1 + moms/(double)100;
        int prisUtanMoms = (int)(prisInklusiveMoms/m);

        if (prisInklusiveMoms>100){ //added on 2022/05/08
            int rabattProcent = 10; //procent
            double rabattVärde = (prisInklusiveMoms * rabattProcent) /100;
            int rabatteratPris = (int) Math.round(prisInklusiveMoms - rabattVärde);
            System.out.println("Pris inkluderande moms och rabatt: " + rabatteratPris + " kr.");
        }

        System.out.println("Pris utan moms eller rabatt: " + prisUtanMoms + " kr.");

    }//main
}//class
