import java.util.Scanner;

/* Features to add:
* Fix if the input breaks with commas instead of points*/
public class FinalInlU_TaxCalculator {
    public static void   main(String[]args){
    boolean   calculateAnother   =     true;
    boolean    seniorCitizen     =    false;
    int     basicDeductionSenior =    78000;
    int        basicDeduction    =    14200;
    int       stateTaxBracket    =   540700;
                                                /*In the Skatteverket page it said that this year there's
                                                  only one skiktgräns, from where one pays 20%*/
        int        preTaxIncome     ;
        int    incomeAfterDeduction ;
        boolean isInStateTaxBracket ;
        int          taxAmount      ;


    while (calculateAnother){

        //Method calls for user input.
        preTaxIncome  = requestIncome();
        seniorCitizen = overOrUnder65();


        if (seniorCitizen)
            incomeAfterDeduction = preTaxIncome - basicDeductionSenior;
        else
            incomeAfterDeduction = preTaxIncome - basicDeduction;

        if (incomeAfterDeduction>stateTaxBracket)
            calculateTotalTax();
        else
            System.out.println("You didn't earn enough to enter the state tax bracket, so you only pay comunal tax.");





        calculateAnother = continueQuestion();
        }//end of while loop

    }//end of main
    public static int calculateTotalTax(int incomeAfterDeduction){
        int taxPercentage   = 20;
        int amountInStratum = incomeAfterDeduction;








    }
    public static int requestIncome(){
        Scanner incomeScan =new Scanner(System.in);
        int   preTaxIncome;

        System.out.print(
                "How much did you make last year? ");

        try {
            preTaxIncome = incomeScan.nextInt();
            return preTaxIncome;
        }
        catch (Exception e) {
            int preTaxIncome1;
            System.out.println(
                "Invalid income, please enter a number");
            preTaxIncome1 = requestIncome();
            return preTaxIncome1;
        }

    }
    public static boolean overOrUnder65(){

        Scanner  yesOrNoScan = new Scanner(System.in);
        char      answer     = 0;
        boolean validInput   = false;

        while (!validInput){

            try {
                System.out.println(
                            "Has this person yet turned 65 years of age during the start of the year? (y/n) ");
                answer = yesOrNoScan.next().trim().toUpperCase().charAt(0);

                if (answer == 'Y' || answer == 'N')
                    validInput = true;

                else {
                    System.out.println(
                            "Invalid answer! You can only answer 'Y' or 'N'");
                    overOrUnder65();
                }
            }
            catch (Exception e){
                System.out.println(
                            "Invalid answer! Error message: " + e);
                overOrUnder65();
            }
        }

        return answer != 'N';

    }//end of custom method: Continue?
    public static boolean continueQuestion(){

        Scanner yesOrNoScan  = new Scanner(System.in);
        char      answer     =     0;
        boolean validInput   = false;

        while (!validInput){
            try {
                System.out.println(
                        "Want to calculate someone else's taxes? (y/n) ");
                answer = yesOrNoScan.next().trim().toUpperCase().charAt(0);
                if (answer == 'Y' || answer == 'N') {
                    validInput = true;
                }
                else {
                    System.out.println(
                        "Invalid answer! You can only answer 'Y' or 'N'");
                    continueQuestion();
                }
            }
            catch (Exception e){
                System.out.println(
                        "Invalid answer! Error message: " + e);
                continueQuestion();
            }
        }
        return answer != 'N';
    }
}
