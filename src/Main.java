public class Main {
    public static void main(String[] args) {
        int account = 100; //начальная сумма на счету
        int accountBonus = 1100; //сумма пополнения

        int bonus;

        if (accountBonus > 1000) {
            bonus = accountBonus / 100; //расчёт бонусных средств за каждые 100 рублей
        } else {
            bonus = 0;
        }

        int balance = account + accountBonus + bonus;

        System.out.println("Итоговая сумма на счету: " + balance + " руб.");
        System.out.println("Бонус составил: " + bonus + " руб.");
    }
}