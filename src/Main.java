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
        float downPayment = 15000;
        float interest = 0;
        int monthNumber = 1;
        for (downPayment = 15000; downPayment <= 12000000; monthNumber++) {
            interest = (downPayment / 100) * 7;
            downPayment = downPayment + interest;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + " Размер депозита составляет: " + downPayment);
            }
        }
        float firstInstallment = 15000;
        float interestRate = 0;
        for (int monthDeposit = 1; monthDeposit <= 108; monthDeposit++) {
            interestRate = (firstInstallment / 100) * 7;
            firstInstallment = firstInstallment + interestRate;
            if (monthDeposit % 6 == 0) {
                System.out.println("Месяц " + monthDeposit + " Размер депозита составляет: " + firstInstallment);
            }
        }
        int friday = 1;
        int daysOfTheMonth = 0;
        for (friday = 1; friday <= 31; friday++) {
            if (friday % 7 == 0) {
                System.out.println("Сегодня пятница, " + friday + " число. Пора подготовить отчет.");
            }
        }
    }
}

