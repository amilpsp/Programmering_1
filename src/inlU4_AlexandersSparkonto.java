public class inlU4_AlexandersSparkonto {
    public static void main(String[]args){
        int originalBelopp = 8000;          //i kr
        double rantaProcentPerAr = 2.5;     //procent

        double rantaForstaAret =  originalBelopp * (
                rantaProcentPerAr / 100);
        //omvänder till int p.g.a. dator hälsa
        double beloppEfter1Ar = originalBelopp + rantaForstaAret;
        System.out.println(
                "Alexander hade " + beloppEfter1Ar +" kr efter ett år.");

        double rantaAndraAret = beloppEfter1Ar * (
                rantaProcentPerAr / 100);
        double beloppEfter2ar = beloppEfter1Ar + rantaAndraAret;
        System.out.println(
                "Alexander nu har " + beloppEfter2ar + " kr efter två år.");
    }
}