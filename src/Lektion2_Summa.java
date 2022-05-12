public class Lektion2_Summa {
    public static void main(String[]args){

//DECLARING variables and assigning VALUES
        int x = 5;
        int y = 7;
/*Declaring a new variable that equates to how the last two
* relate to eachother*/
        int summa = x + y;
//Printing the result
        System.out.println("Summa = " + summa);

/*Once the variables have been declared, I can
* change their values. But I can't declare them twice.*/
        x = 4;
        summa = x + y;
        System.out.println("Summa = " + summa);
    }
}
