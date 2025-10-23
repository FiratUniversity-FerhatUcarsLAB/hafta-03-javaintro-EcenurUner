public class SaatDonusturme {
    public static void main(String[] args) {
            int toplamSaniye = 3665; // Verilen saniye

            int saat = toplamSaniye / 3600;                // 1 saat = 3600 saniye
            int dakika = (toplamSaniye % 3600) / 60;       // Kalan saniyeden dakika
            int saniye = toplamSaniye % 60;                // Geriye kalan saniye

            // Sonucu ekrana yazdır (dakika ve saniye 2 basamaklı olacak şekilde)
            System.out.printf("%d saniye = %d:%02d:%02d%n", toplamSaniye, saat, dakika, saniye);
        }
    }
