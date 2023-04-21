import java.util.Scanner;

public class DepositCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите сумму, вносимую на депозит: ");
        double amount = input.nextDouble();
        System.out.println("Введите срок размещения денежных средств (количество лет): ");
        int period = input.nextInt();
        System.out.println("Введите процентную ставку по депозиту (% годовых): ");
        double rate = input.nextDouble();
        input.close();

        double profit = 0;
        for (int i = 1; i <= period; i++) {
            profit = (amount * rate * i) / 100;
            String result = String.format("%.2f", profit);
            System.out.println(i + "-й год, сумма начисленных процентов: " + result + " RUB");
        }
        amount += profit;
        System.out.println("Остаток средств на депозите: " + amount + " RUB");
    }
}
