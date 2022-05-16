import java.util.Scanner;

/* Features to add:
* Actual stratum boundaries
* Fix if the input breaks with commas instead of points*/
public class FinalInlU_TaxCalculator {
    public static void main(String[]args){
    boolean calculateAnother=true;
    int preTaxIncome;
    int incomeAfterDeduction;
    int basicDeduction = 13100;
    int lowStratBoundary = 13200 * 5;   //Ifrån 2017:s exempel i instruktionerna.
    int highStratBoundary= 34500 * 5;
    int taxAmount;


    while (calculateAnother){

        preTaxIncome = requestIncome();
        if (preTaxIncome>lowStratBoundary)
            incomeAfterDeduction = preTaxIncome - basicDeduction;
        else
            incomeAfterDeduction = preTaxIncome;

        if(incomeAfterDeduction<lowStratBoundary){
            System.out.println("Your yearly income is below the lower stratum boundary set by Skatteverket, so, you don't have to pay tax on it.");
        }
        else{
            if (incomeAfterDeduction>=highStratBoundary) {
            taxAmount = (int) (incomeAfterDeduction * 0.25);
             }
            else{
            taxAmount = (int) (incomeAfterDeduction * 0.2);
            }
            System.out.println("You must pay " + taxAmount + " kr in taxes this year.");
        }
        calculateAnother=continueQuestion();
    }//end of while loop
    }//end of main
    public static int requestIncome(){ //FIX IF IT BREAKS WITH COMAS OR POINTS
        Scanner incomeScan =new Scanner(System.in);
        int preTaxIncome;
        System.out.print("How much did you make last year? ");

        try {
            preTaxIncome = incomeScan.nextInt();
            return preTaxIncome;
        }
        catch (Exception e) {
            int preTaxIncome1;
            System.out.println("Invalid income, please enter a number");
            preTaxIncome1 = requestIncome();
            return preTaxIncome1;
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
        return answer != 'N';
    }
}
