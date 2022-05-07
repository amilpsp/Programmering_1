import java.util.Scanner;

public class P1_class11_Ovning4_3 {
    public static void main(String[]args){
        /*
        * Ett postnummer består som du vet av fem siftror.
        * Av dessa anger de två första siffrorna vilket distrikt det är fråga om.
        * Om de två första siffrorna ligger i intervallet 20 - 62 eller om de är 65 eller 66,
        * ligger distriktet i Götaland. Ar de tva forsta sittrorna större än eller lika med 80,
        * är det fräga om ett distrikt i Norrland. Ovriga sifror betecknar distrikt i Svealand.
        *
        * Skriv ett program som läser in ett postnummer och som visar om distriktet ligger
        * i Götaland, Svealand eller Norrland.*/

        Scanner lassInPostNr = new Scanner(System.in);

        System.out.print("Ange postnummer: ");
        String postNr = lassInPostNr.nextLine();
        int twoDigits = Integer.parseInt(postNr.substring(0,2));

        if (( twoDigits > 20 && twoDigits < 60) || (twoDigits == 65 || twoDigits ==66)) {
            System.out.println("Distriktet ligger i Götaland");}
        else if (twoDigits >= 80) {System.out.println("Distriktet ligget i Norrland");}
        else {System.out.println("Distriktet ligget i Svealand");}

    }
}
