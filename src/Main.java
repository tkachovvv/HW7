import java.util.Scanner;

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
        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (n = 10; n >= 1; n--) {
                System.out.print(n + " ");
        }
        System.out.println();

        int y = 12_000_000;
        int death = 8;
        int birth = 17;
        for (int year = 2022; year < 2032; year++) {
            death = (y/1000) * 8;
            birth = (y/1000) * 17;
            y = y + (birth - death);
            System.out.println("Год " + year + ", численность населения составляет: " + y);
        }
        int downPayment = 15000;
        int interest = 0;
        int monthNumber = 1;
        for (;interest <= 12_000_000; monthNumber++) {
            downPayment = downPayment + ((downPayment/100) * 7);
            interest = downPayment + ((downPayment/100) * 7);
            if (monthNumber % 6 ==0) {
                System.out.println("Месяц " + monthNumber + " Размер депозита составляет: " + interest);
            }
        }

    }
}
