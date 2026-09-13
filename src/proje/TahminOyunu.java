package proje;

import java.util.Scanner;

/**
 * TahminOyunu sınıfı.
 * OyunTabani sınıfından türetilmiştir (Inheritance).
 * Kullanıcıdan girdi alarak 7 hak kuralını yönetir.
 */
public class TahminOyunu extends OyunTabani {
    private Scanner scanner;

    public TahminOyunu() {
        super();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void baslat() {
        System.out.println("==================================================");
        System.out.println("          SAYI TAHMİN OYUNUNA HOŞ GELDİNİZ        ");
        System.out.println("==================================================");
        System.out.println("1 ile 100 arasında bir sayı tuttum. Tahmininizi girin:");

        int kalanHak = 7;
        while (kalanHak > 0) {
            System.out.print("\nTahmininiz: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Lütfen geçerli bir tam sayı giriniz!");
                scanner.next(); // Hatalı girdiyi temizle
                continue;
            }

            int tahmin = scanner.nextInt();

            if (tahmin < 1 || tahmin > 100) {
                System.out.println("Lütfen 1 ile 100 arasında bir sayı giriniz.");
                continue;
            }

            if (tahminEt(tahmin)) {
                break;
            }

            kalanHak--;
            if (kalanHak > 0) {
                System.out.println(kalanHak + " hakkınız kaldı.");
            }
        }

        if (kalanHak == 0) {
            System.out.println("\nHakkınız bitti! Kaybettiniz.");
            System.out.println("Gizli sayı: " + gizliSayi);
        }
        System.out.println("==================================================");
    }
}

