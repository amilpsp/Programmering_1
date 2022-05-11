import java.util.Scanner;

public class inlU7_AverageOfMensAndWomensAges {

    public static void main (String[]args){
        int numberOfMen = 0;
        int numberOfWomen = 0;
        int womenSumOfAllAges = 0;
        int menSumOfAllAges = 0;
        boolean registerAnother = true;

        while(registerAnother){
            char personsGender = requestNewPersonsGender();
            if (personsGender == 'W'){  //Increasing the number of men or women by 1
                numberOfWomen++;        //depending on the user's input.
            }
            else {
                numberOfMen++;
            }

            int personsAge = requestAge();
            if (personsGender == 'W'){
                womenSumOfAllAges += personsAge;
            }
            else {
                menSumOfAllAges += personsAge;
            }
            registerAnother = continueQuestion();
        }

        System.out.println("Women's average age is " + womenSumOfAllAges / numberOfWomen + " years old.");
        System.out.println("Men's average age is " + menSumOfAllAges / numberOfMen + " year old.");
    }

    public static char requestNewPersonsGender() { //This method was made so that if an invalid
        char womanOrManAnswer = 0 ;                // input is entered the program will have the
        boolean validInput = false;                // user try again instead of just ending.

        Scanner genderScan = new Scanner(System.in);

        while (!validInput){
            try {
                System.out.print("Is this person a woman or a man? (W/M): ");
                womanOrManAnswer = genderScan.next().trim().toUpperCase().charAt(0);
                if (womanOrManAnswer == 'M' || womanOrManAnswer == 'W') {
                    validInput = true;
                }
                else {
                    System.out.println("Invalid answer! You can only answer 'M' or 'W'");
                    genderScan.nextLine();
                }
            }
            catch (Exception e){
                System.out.println("Invalid answer! Error message: " + e);
                genderScan.nextLine();
            }
        }
        return womanOrManAnswer;
    }//request new persons gender

    public static int requestAge(){                 //This method was made so that if an invalid
        Scanner ageScan =new Scanner(System.in);    //input is entered the program will have the
        int personsAge = 0;                         //user try again instead of just ending.
        System.out.print("What's their age? ");

        try {
            personsAge = ageScan.nextInt();
            return personsAge;
        }
        catch (Exception e) {
            System.out.println("Invalid age, please enter a whole number");
        }
        System.out.println();
        return personsAge;
    }//request age

    public static boolean continueQuestion(){
        char yesOrNoAnswer = 0;
        boolean validInput = false;

        Scanner genderScan = new Scanner(System.in);
        while (!validInput){
            try {
                System.out.println("Want to add another individual's information? (y/n) ");
                yesOrNoAnswer = genderScan.next().trim().toUpperCase().charAt(0);
                if (yesOrNoAnswer == 'Y' || yesOrNoAnswer == 'N') {
                    validInput = true;
                }
                else {
                    System.out.println("Invalid answer! You can only answer 'Y' or 'N'");
                    genderScan.nextLine();
                }
            }
            catch (Exception e){
                System.out.println("Invalid answer! Error message: " + e);
                genderScan.nextLine();
            }
        }

        if (yesOrNoAnswer == 'N'){
            return false;
        }
        else{
            return true;
        }

    }// continue?
}
