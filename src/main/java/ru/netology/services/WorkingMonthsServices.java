package ru.netology.services;

public class WorkingMonthsServices {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
                //  System.out.println(money);
            } else {
                money = money + income - expenses;
                //  System.out.println(money);
            }
        }
        return count;
    }
}