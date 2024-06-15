public class PrimeChecker {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Bitte geben Sie eine Zahl als Argument ein.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            if (isPrime(number)) {
                System.out.println(number + " ist eine Primzahl.");
            } else {
                System.out.println(number + " ist keine Primzahl.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Bitte geben Sie eine gültige Ganzzahl ein.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
