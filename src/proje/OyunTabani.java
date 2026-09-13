package proje;

import java.util.Random;

/**
 * OyunTabani soyut sınıfı (Abstract Class).
 * Oyun arayüzünü (Oyun) uygular ve rastgele sayı üretimini,
 * sayı kontrol mekanizmasını barındırır.
 */
public abstract class OyunTabani implements Oyun {
    protected int gizliSayi;

    public OyunTabani() {
        Random random = new Random();
        gizliSayi = random.nextInt(100) + 1; // 1 ile 100 arasında rastgele sayı üretir
    }

    @Override
    public abstract void baslat();

    @Override
    public boolean tahminEt(int tahmin) {
        if (tahmin == gizliSayi) {
            System.out.println("Tebrikler! Doğru tahmin ettiniz!");
            return true;
        } else if (tahmin < gizliSayi) {
            System.out.println("Tahmininiz gizli sayıdan küçük.");
        } else {
            System.out.println("Tahmininiz gizli sayıdan büyük.");
        }
        return false;
    }

    public int getGizliSayi() {
        return gizliSayi;
    }
}

