import java.util.Scanner;

/* Features to add:
* Fix if the input breaks with commas instead of points*/
public class FinalInlU_TaxCalculator {
    public static void   main(String[]args){
    boolean   calculateAnother   =     true;
    int      stateTaxBracket     =   540700;      /*In the Skatteverket page it said that this year there's
                                                  only one skiktgräns, from where one pays 20%*/
    int      basicDeduction      ;
    int       preTaxIncome       ;
    int   incomeAfterDeduction   ;
    int         taxAmount        ;


    while (calculateAnother){
        //Method calls for user input.
        preTaxIncome  = requestIncome();
        basicDeduction = determineBasicDeduction();
        incomeAfterDeduction = preTaxIncome - basicDeduction;

        if (incomeAfterDeduction<=0){
            System.out.println(
                    "Your yearly income is less than the basic deduction, so you don't have to pay any tax on it whatsoever.");
        }


        int incomeInStateBracket = incomeAfterDeduction-stateTaxBracket;

        /*
        while (incomeInStateBracket>0){

        }
        */





        calculateAnother = continueQuestion();
        }//end of while loop

    }//end of main
    public static int calculateStateTax(int incomeInStateBracket, int stateTaxBracket){

        int  stateTaxPercentage     = 20;
        int stateTaxAmount = (incomeInStateBracket) * stateTaxPercentage / 100;
        return stateTaxAmount;
    }
    public static int calculateMunicipalTax(int incomeAfterDeduction){

        int municipalTaxPercentage = 20;
        int municipalTaxAmount = incomeAfterDeduction * municipalTaxPercentage / 100;

        return municipalTaxAmount;
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

    public static int determineBasicDeduction() {
        Scanner yesOrNoScan = new Scanner(System.in);
        int basicDeductionSenior = 78000;
        int basicDeductionYoung = 14200;
        char answer = 0;
        boolean validInput = false;

        while (!validInput) {

            try {
                System.out.println(
                        "Has this person yet turned 65 years of age during the start of the year? (y/n) ");
                answer = yesOrNoScan.next().trim().toUpperCase().charAt(0);

                if (answer == 'Y' || answer == 'N')
                    validInput = true;

                else {
                    System.out.println(
                            "Invalid answer! You can only answer 'Y' or 'N'");
                    determineBasicDeduction();
                }
            } catch (Exception e) {
                System.out.println(
                        "Invalid answer! Error message: " + e);
                determineBasicDeduction();
            }
        }
        if (answer == 'Y') {
            return basicDeductionSenior;
        } else {
            return basicDeductionYoung;
        }
    }
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
