public class HarmonikOrtalamasi {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        double harmonık = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmonık += 1/numbers[i];

        }
        double sonuc=numbers.length / harmonık;
        System.out.println("Sonuç: "+sonuc);

    }
}

