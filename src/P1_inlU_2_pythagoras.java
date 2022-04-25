import java.util.Scanner;
public class P1_inlU_2_pythagoras {
    public static void main(String[]args){
        Scanner sideLengthInput = new Scanner(System.in);

            /*Print out first instructions for the user so that
            they know what is needed from them in the terminal*/
        System.out.print("Skriv längden av första sidan: ");
        double length1 = sideLengthInput.nextDouble();
            //The program will wait for input from the user in the terminal.
        System.out.print("Skriv längden av andra sidan: ");
        double length2 = sideLengthInput.nextDouble();
            /*Expressing Pythagora's Theorem in the declaration
            of the hypotenuseLength variable.*/
        double hypotenuse = Math.sqrt(length1*length1 + length2*length2);

        System.out.println("Hypotenusan av en sån trekant skulle vara= " + hypotenuse);
    }
}
