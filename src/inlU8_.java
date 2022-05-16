import java.util.Scanner;

/* FIX SCREENCAPPED BUG AND DEBUG PROPPERLY TOMORROW!
* Features to add:
* Actual stratum boundaries
* 65 year old condition
* Fix if the input breaks with commas instead of points*/
public class inlU8_ {
    public static void main(String[]args){
    boolean calculateAnother=true;
    int preTaxIncome;
    int lowStratBoundary = 65500;
    int highStratBoundary= 6000000;
    int taxAmount;

    while (calculateAnother){
        preTaxIncome = requestIncome();

        if(preTaxIncome<lowStratBoundary){
            System.out.println(preTaxIncome+"Your yearly income is below the lower stratum boundary set by Skatteverket, so, you don't have to pay tax on it.");
            calculateAnother=continueQuestion();
        }
        else{
            if (preTaxIncome>=highStratBoundary) {
            taxAmount = (int) (preTaxIncome * 0.25);
             }
            else{
            taxAmount = (int) (preTaxIncome * 0.2);
            }
            System.out.println("You must pay " + taxAmount + " kr in taxes this year.");
            calculateAnother=continueQuestion();
        }
    }//end of while loop
    }//end of main
    public static int requestIncome(){ //FIX IF IT BREAKS WITH COMAS OR POINTS
        Scanner incomeScan =new Scanner(System.in);
        int preTaxIncome = 0;
        System.out.print("How much did you make last year? ");

        try {
            preTaxIncome = incomeScan.nextInt();
            return preTaxIncome;
        }
        catch (Exception e) {
            System.out.println("Invalid income, please enter a number");
            System.out.println();
            requestIncome();
            return preTaxIncome;
        }
    }//FIX IF IT BREAKS WITH COMAS OR POINTS
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
                System.out.println("Want to calculate someone else's taxes? (y/n) ");
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

    }
}
