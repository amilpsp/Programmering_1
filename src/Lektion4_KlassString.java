public class Lektion4_KlassString {
    public static void main(String[]args){
        //träna på att skriva olika string klass metoder
    //length();
        String s1 = "Jensen är min skolas namn";
        System.out.println("Antal tecken i S1= " + s1.length());

        System.out.println("Tecken för position 4 är: " + s1.charAt(4));

        System.out.println("" + s1.substring(0, 7));
    }
}
