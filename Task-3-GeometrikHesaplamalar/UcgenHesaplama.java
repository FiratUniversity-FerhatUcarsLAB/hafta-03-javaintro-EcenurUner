public class UcgenHesaplama {
    public static void main(String[] args) {
        // Kenar uzunlukları
        int a = 3;
        int b = 4;
        int c = 5;

        // Yarı çevre (s)
        double s = (a + b + c) / 2.0;

        // Heron formülü
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Adımları ekrana yazdır
        System.out.println("Üçgenin kenarları: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Yarı çevre (s) = " + s);
        System.out.println("Alan formülü: A = √(s * (s - a) * (s - b) * (s - c))");
        System.out.println("Alan = " + alan);
    }
}
