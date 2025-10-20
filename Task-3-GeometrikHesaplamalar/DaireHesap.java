public class DaireHesap {
    public static void main(String[] args) {
        double r = 5.5;
        double pi = 3.14159;

        //Alan Hesaplama
        double alan = pi * r * r;

        //Cevre Hesaplama
        double cevre = 2 * pi * r;

        //Sonucları yazdir
        System.out.println("Yaricap: " + r);
        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);
    }
}
