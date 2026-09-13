package proje;

/**
 * Uygulamanın giriş noktası (Entry Point).
 * Polimorfizm prensibi kullanılarak Oyun arayüzü üzerinden
 * TahminOyunu nesnesi başlatılır.
 */
public class Main {
    public static void main(String[] args) {
        Oyun oyun = new TahminOyunu();
        oyun.baslat();
    }
}

