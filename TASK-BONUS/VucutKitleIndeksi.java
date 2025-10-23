public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy = 1.75; // metre cinsinden
        double kilo = 55;  // kilogram cinsinden

        // BMI formülü: kilo / (boy * boy)
        double bmi = kilo / (boy * boy);

        System.out.printf("Boy: %.2f m%n", boy);
        System.out.printf("Kilo: %.1f kg%n", kilo);
        System.out.printf("Vücut Kitle İndeksiniz (BMI): %.2f%n", bmi);

        // BMI'ye göre durum değerlendirmesi
        if (bmi < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (bmi < 25) {
            System.out.println("Durum: Normal");
        } else if (bmi < 30) {
            System.out.println("Durum: Fazla kilolu");
        } else {
            System.out.println("Durum: Obez");
        }
    }
}
