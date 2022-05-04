public class P1_inlU_5 {
    public static void main(String[]args){
        int x = 5;
        vadArX(x);
    }

    public static void vadArX(int x){
        if (x == 10)
            System.out.println("x = 10");
        else if (x <= 10 && x >= 0)
            System.out.println("x är mindre än 10, men större än 0");
        else if ( x<=0 && x!=0 )
            System.out.println("x är negativ");
        else
            System.out.println("x är större än 10");
    }
}
