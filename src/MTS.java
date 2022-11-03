public class MTS {
    public static void main(String[] args){

        int moneyStart = 100; // количествo рублей на изначальном счету
        int money = 1100; // сумма пополнения
        int bonus; // бонусные рубли


        if (money > 1000) {
            bonus = money / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Итоговый счет");
        System.out.println(bonus + moneyStart + money);

    }
}
