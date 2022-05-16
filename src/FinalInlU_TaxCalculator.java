import java.util.Scanner;

/* Features to add:
* Actual stratum boundaries
* Fix if the input breaks with commas instead of points*/
public class FinalInlU_TaxCalculator {
    public static void main(String[]args){
//Boolean related to the function that determines whether or not the user wants to calculate someone else's taxes.
    boolean calculateAnother= true;
    int preTaxIncome;
    int incomeAfterDeduction;
    int basicDeduction      = 13200 ;
    int firstStratBoundary  = 438900;    //From the 2017 example in the instructions..
    int secondStratBoundary = 638500;
    int taxAmount;
    int[] taxBrackets = new int []{ firstStratBoundary, secondStratBoundary };
        //I made an array so that I could loop through it when I add more stratum boundaries.

    while (calculateAnother){

        preTaxIncome = requestIncome();

        incomeAfterDeduction = preTaxIncome - basicDeduction;
        if( preTaxIncome <= basicDeduction ){
            System.out.println("You don't have to pay any tax on it.");
        }
        else{
            taxAmount=calculateTotalTax(incomeAfterDeduction,taxBrackets);
            System.out.println("You must pay " + taxAmount + " kr in taxes this year.");
        }
        calculateAnother=continueQuestion();
    }//end of while loop
    }//end of main
    public static int calculateTotalTax(int incomeAfterDeduction, int[] stratBoundaries){
        int taxPercentage=20;
        int amountInStratum = incomeAfterDeduction;
        int remainder;
        int taxHere;
        int totalTaxToPay = 0;
        for (int i = 0; i<stratBoundaries.length; i++ ){
            while (taxPercentage<=25) {
                //This is a loop so that I can put more and more tax brackets in later.
                remainder = stratBoundaries[i] - amountInStratum;
                if (remainder > 0) {
                    amountInStratum -= remainder;
                }

                taxHere = amountInStratum * (taxPercentage / 100);

                totalTaxToPay += taxHere;
                amountInStratum = remainder;
                taxPercentage += 5;
                System.out.println(totalTaxToPay);
            }
            System.out.println(totalTaxToPay);
        }
        System.out.println(totalTaxToPay);
        return totalTaxToPay;
    }
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
    }
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
