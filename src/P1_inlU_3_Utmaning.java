import java.util.Scanner;

public class P1_inlU_3_Utmaning {
    public static void main(String[]args){
        Scanner scanTreSiffror = new Scanner(System.in);

        System.out.print("Skriv in ett tresiffrigt tal: ");//Asking user for a 3 digit number
        String tresiffrigtTal = scanTreSiffror.nextLine(); //Storing

//Putting the characters into an array to refer to them by their index
        char [] siffrorArray= tresiffrigtTal.toCharArray();

//Getting them individually out with their indexes
        char char1 = siffrorArray[0];
        char char2 = siffrorArray[1];
        char char3 = siffrorArray[2];
//Turning them into integers
        int n1 = Character.getNumericValue(char1);
        int n2 = Character.getNumericValue(char2);
        int n3 = Character.getNumericValue(char3);
//Adding them up
        int summa = n1 + n2 + n3;

        System.out.println("Summan av tre siffrorna är: " + summa);

//Useful loop
/*           for (char cypherChar : siffrorArray) {
                System.out.println(cypherChar);
            }*/
//Failed ideas here
/*
--------------------------Idea #3-------------------------------
//This gives, for some reason, = 150.
        //    System.out.println(siffrorArray[0] + siffrorArray[1] + siffrorArray[2]);

--------------------------Idea #2-------------------------------
        String n1 = tresiffrigtTal.valueOf(0);
        String n2 = tresiffrigtTal.valueOf(1);
        String n3 = tresiffrigtTal.valueOf(2);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

--------------------------Idea #1-------------------------------
RESOLVED: I needed to use ".getNumericValue"
these don't work, it says that that method can't be applied to a character

        int n1 = Integer.parseInt(char1);
        int n2 = Integer.parseInt(char2);
        int n3 = Integer.parseInt(char3);
*/
    }
}
