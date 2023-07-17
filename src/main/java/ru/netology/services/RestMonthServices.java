package ru.netology.services;

public class RestMonthServices {
    public int calculate(int income, int expense, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month < 13; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                System.out.println("Month " + month + ". Money " + money);
                money = money - expense;
                money = money / 3;

            } else {
                System.out.println("Month " + month + ". Money " + money);
                money = money + income - expense;
            }
        }
        return count;
    }
}
