import java.util.Scanner;
public class AsalSayiBulanProgram {
    static boolean asalKontrol(int sayi, int bolen) {

        if (sayi < 2) {
            return false;
        }

        if (sayi == bolen) {
            return true;
        }

        if (sayi % bolen == 0) {
            return false;
        }

        return asalKontrol(sayi, bolen + 1);
    }

    public boolean isAsal(int sayi) {
        return asalKontrol(sayi, 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        Main asalSayi = new Main();



        if (asalSayi.isAsal(sayi)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }
}