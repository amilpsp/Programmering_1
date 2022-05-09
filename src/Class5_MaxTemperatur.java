import java.util.Scanner;

public class Class5_MaxTemperatur {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Temp = ");
        int temp1 = scan.nextInt();

        System.out.print("Temp= ");
        int temp2 = scan.nextInt();

        int maxTemp = Math.max(temp1, temp2);
        System.out.println("Högsta temperaturen är: " + maxTemp);
    }
}
