public class P1_inlU_4_AlexandersSparkonto {
    public static void main(String[]args){
        int originalBelopp = 8000;  //i kr
        double rantaProcentPerAr = 2.5;         //procent

        double rantaForstaAret =  originalBelopp * (rantaProcentPerAr / 100);
        //omvänder till int p.g.a. dator hälsa
        int beloppEfter1Ar = originalBelopp + (int) rantaForstaAret;
        System.out.println("Alexander hade " + beloppEfter1Ar +" kr efter ett år.");

        double rantaAndraAret = beloppEfter1Ar * (rantaProcentPerAr / 100);
        int beloppEfter2ar = beloppEfter1Ar + (int) rantaAndraAret;
        System.out.println( "Alexander nu har " + beloppEfter2ar + " kr efter två år.");

    }
}