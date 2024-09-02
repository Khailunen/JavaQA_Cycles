package ru.netology.services;

public class Main {
    public static void main(String[] args) {

        WorkingMonthsServices services = new WorkingMonthsServices();
        int count = services.calculate(100000, 60000, 150000);
        System.out.println(count);
    }

}
