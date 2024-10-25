public class Main {
    public static void main(String[] args) {
        // Break kullanımı örneği
        System.out.println("Break Kullanımı:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Döngü " + i + " değerinde break ile sonlandırıldı.");
                break; // Döngü 5'e ulaştığında tamamen sonlanır
            }
            System.out.println("Sayı: " + i);
        }

        // Continue kullanımı örneği
        System.out.println("\nContinue Kullanımı:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Çift sayılarda döngünün o iterasyonu atlanır
            }
            System.out.println("Tek Sayı: " + i);
        }

        // İç içe döngülerde break kullanımı
        System.out.println("\nİç İçe Döngülerde Break Kullanımı:");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j == 4) {
                    System.out.println("Break ile dış döngüye çıkıldı, i: " + i + ", j: " + j);
                    break outerLoop; // İç döngüyü değil, tüm döngüyü sonlandırır
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}