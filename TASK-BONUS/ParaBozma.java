public class ParaBozma {
    public static void main(String[] args) {
        int para = 348; // Toplam para miktarı (TL)

        int yuzluk = para / 100;      // 100'lük sayısı
        para = para % 100;            // Kalan para

        int ellilik = para / 50;      // 50'lik sayısı
        para = para % 50;

        int yirmilik = para / 20;     // 20'lik sayısı
        para = para % 20;

        int onluk = para / 10;        // 10'luk sayısı
        para = para % 10;

        int beslik = para / 5;        // 5'lik sayısı
        para = para % 5;

        int ikilik = para / 2;        // 2'lik sayısı
        para = para % 2;

        int birlik = para;            // Kalan 1'likler

        // Sonucu ekrana yazdır
        System.out.println("348 TL = "
                + yuzluk + "x100, "
                + ellilik + "x50, "
                + yirmilik + "x20, "
                + onluk + "x10, "
                + beslik + "x5, "
                + ikilik + "x2, "
                + birlik + "x1");
    }
}
