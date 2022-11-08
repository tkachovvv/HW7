public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int total = 0;
        int installment = 15000;
        int month = 1;
        while (total < 2_459_000) {
            total = installment + total;
            System.out.println("Месяц " + month + " Сумма накоплений: " + total + " рублей.");
            month++;
        }

    }
}