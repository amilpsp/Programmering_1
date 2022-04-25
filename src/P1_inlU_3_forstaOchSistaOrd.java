import java.util.Scanner;

public class P1_inlU_3_forstaOchSistaOrd {
    public static void main(String[]args){
        Scanner scanMening = new Scanner(System.in);
//Instruction for the user in the terminal
        System.out.println("Skriv en scanMening av minst två ord: ");
//Storing that string
        String tvaOrdMening = scanMening.nextLine();

//Using the ".length" method to know how long the string is.
        System.out.println("Du skrev " + tvaOrdMening.length() + " tecken.");

//The index of the first space is the end of the fist word.
        int iOfFirstSpace = tvaOrdMening.indexOf(" ");

//Making a substring from the beginning until the first space.
        String forstaOrdet = tvaOrdMening.substring(0,iOfFirstSpace);
        System.out.println("Det första ordet var \"" + forstaOrdet + "\".");

//The index of the last space is the beginning of the last word.
        int indexOfLastSpace = tvaOrdMening.lastIndexOf(" ");
        String sistaOrdet = tvaOrdMening.substring(indexOfLastSpace + 1);
        System.out.println("Det sista ordet var \"" + sistaOrdet + "\".");
    }
}