public class DönüşümTablosu {
    public static void main(String[] args) {
        double milToKm = 1.609; // 1 mil = 1.609 km
        int[] milDegerleri = {1, 5, 10, 20, 50};

        System.out.println("Mil → Kilometre Dönüşüm Tablosu");
        System.out.println("-------------------------------");

        for (int mil : milDegerleri) {
            double km = mil * milToKm;
            System.out.println(mil + " mil = " + km + " kilometre");
        }
    }
}
