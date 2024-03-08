public class Main {
    String adı;
    String ders;
    int sözlüNotu;
    int yazılıNot;
    double hesap;



    Main(String adı, String ders, int sözlüNotu, int yazılıNot) {
        this.adı = adı;
        this.ders = ders;
        this.sözlüNotu = sözlüNotu;
        this.yazılıNot = yazılıNot;
        this.hesap = hesap;
    }
    public void Hesapla() {
        this.hesap = (this.yazılıNot * 0.20) + (this.yazılıNot * 0.80);
        System.out.println("Öğrenci : " + this.adı);
        System.out.println("Ders Adı : " + this.ders);
        System.out.println("Hesaplanmış Puan : " + this.hesap);
        System.out.println("----------------");
    }
}
