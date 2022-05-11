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
                womenSumOfAllAges += personsAge;    //Adding the individual's age to the
            }                                       //sum of their respective group.
            else {
                menSumOfAllAges += personsAge;
            }
            registerAnother = continueQuestion();   //Asks the user if they want to add another person
        }                                           //if the user says 'no' registerAnother = false

        System.out.println(
                "Women's average age is " + womenSumOfAllAges / numberOfWomen + " years old.");
        System.out.println(
                "Men's average age is " + menSumOfAllAges / numberOfMen + " year old.");
    }

    public static char requestNewPersonsGender() {
        /*This method asks the user if the individual they're registering
        is a woman 'W' or a man 'M' by having them type one of those letters
        in the terminal; then, it trims the input, makes it uppercase so
        that the user doesn't have to worry about case sensitivity, checks if
        it's valid input (if it isn't, it has the user try again until it is),
        and returns it*/
        char womanOrManAnswer = 0 ;
        boolean validInput = false;
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

    public static int requestAge(){
        /*This method asks the user to type in an integer, makes sure that the input
        is valid (otherwise it has the user try again until it is), and returns that number.*/
        Scanner ageScan =new Scanner(System.in);
        int personsAge = 0;
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
        /*This method asks the user if they want to register the information
        of another individual. It makes them choose between yes 'Y' or no 'N'
        by typing one of those letters in the terminal; then, it trims the input,
        makes it uppercase so that the user doesn't have to worry
        about case sensitivity, checks if it's valid input (if it isn't,
        it has the user try again until it is), and returns it*/
        char answer = 0;
        boolean validInput = false;

        Scanner yesOrNoScan = new Scanner(System.in);
        while (!validInput){
            try {
                System.out.println("Want to add another individual's information? (y/n) ");
                answer = yesOrNoScan.next().trim().toUpperCase().charAt(0);
                if (answer == 'Y' || answer == 'N') {
                    validInput = true;
                }
                else {
                    System.out.println("Invalid answer! You can only answer 'Y' or 'N'");
                    yesOrNoScan.nextLine();
                }
            }
            catch (Exception e){
                System.out.println("Invalid answer! Error message: " + e);
                yesOrNoScan.nextLine();
            }
        }

        if (answer == 'N'){
            return false;
        }
        else{
            return true;
        }

    }// continue?
}
