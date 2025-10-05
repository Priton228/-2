import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Курс валют (примерные значения, можно поменять на актуальные)
        double usdToRub = 96.5;   // курс доллара к российскому рублю
        double eurToRub = 102.3;  // курс евро к российскому рублю

        double usdToByn = 3.25;   // курс доллара к белорусскому рублю
        double eurToByn = 3.45;   // курс евро к белорусскому рублю
        double rubToByn = 0.034;  // курс российского рубля к белорусскому рублю

        System.out.println("Конвертер валют");
        System.out.println("1. USD -> RUB");
        System.out.println("2. EUR -> RUB");
        System.out.println("3. RUB -> USD");
        System.out.println("4. RUB -> EUR");
        System.out.println("5. USD -> BYN");
        System.out.println("6. EUR -> BYN");
        System.out.println("7. RUB -> BYN");
        System.out.println("8. BYN -> USD");
        System.out.println("9. BYN -> EUR");
        System.out.println("10. BYN -> RUB");
        System.out.print("Choose (1-10): ");

        int choice = scanner.nextInt();
        System.out.print("Enter sum: ");
        double amount = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1 -> result = amount * usdToRub;
            case 2 -> result = amount * eurToRub;
            case 3 -> result = amount / usdToRub;
            case 4 -> result = amount / eurToRub;
            case 5 -> result = amount * usdToByn;
            case 6 -> result = amount * eurToByn;
            case 7 -> result = amount * rubToByn;
            case 8 -> result = amount / usdToByn;
            case 9 -> result = amount / eurToByn;
            case 10 -> result = amount / rubToByn;
            default -> {
                System.out.println("Error");
                return;
            }
        }

        System.out.println("Result: " + result);
    }
}
