import java.util.Scanner;

public class P1_inlU_3_forstaOchSistaOrd {
    public static void main(String[]args){

        Scanner scanMening = new Scanner(System.in);//Instanciating a Scanner

        System.out.println("Skriv en mening av minst två ord: ");//Instruction for the user in the terminal
        String tvaOrdMening = scanMening.nextLine(); //Storing that string
        String trimmatMening = tvaOrdMening.trim(); //Triming in case people add spaces at the beggining or the end

        int length= trimmatMening.length();//".length" method
        System.out.println("Du skrev " + length + " tecken."); //Printing on the console

        int iOfFirstSpace = trimmatMening.indexOf(" ");//The index of the first space is the end of the fist word.

        String forstaOrdet = trimmatMening.substring(0,iOfFirstSpace); //Making a substring from the beginning until the first space.
        System.out.println("Det första ordet var \"" + forstaOrdet + "\"."); //Printing on the console

        int indexOfLastSpace = trimmatMening.lastIndexOf(" "); //The index of the last space is the beginning of the last word.
        String sistaOrdet = trimmatMening.substring(indexOfLastSpace + 1);//Making a substring from the after the last space.
        System.out.println("Det sista ordet var \"" + sistaOrdet + "\"."); //Printing on the console
    }
}