import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a value:");
        int n = input.nextInt();

        recursive(n);

    }
    public static void recursive(int n){
        if (n<=0) {
            System.out.println(n + " ");
            return;
        }
        System.out.println(n + " ");
        recursive(n-5);

        System.out.println(n + " ");
    }
}

