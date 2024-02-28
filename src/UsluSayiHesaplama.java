import java.util.Scanner;
public class UsluSayiHesaplama {
    static int usluifade(int a, int b) {
        // int a=0,b=0;
        int result = 1;
        for (int i=1; i <= b; i++) {
            result *= a;
        }
        return result;

    }
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        a = scanner.nextInt();
        System.out.print("Üs değeri giriniz : ");
        b = scanner.nextInt();
        if (b == 0) {
            System.out.println("Sonuç= 1");
        } else System.out.println("Sonuç : " + usluifade(a,b));
    }

}
