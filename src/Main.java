//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1, Задача 2
        System.out.println("Задача 1, Задача 2");
        int clientOS = 1;
        String operationSystem;
        if (clientOS == 0) {
            operationSystem = "iOS";
        } else {
            operationSystem = "android";
        }
        int clientDeviceYear = 2010;
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для " + operationSystem + " по ссылке");
        } else {
            System.out.println("Установите облегчённую версию приложения для " + operationSystem + " по ссылке");
        }
        //Задача 3
        System.out.println("Задача 3");
        int year = 2000;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потреуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
        //Задача 5
        System.out.println("Задача 5");
        int monthNumber = 7;
        switch (monthNumber) {
            case 1, 2, 3:
                System.out.println("Зима");
                break;
            case 4, 5, 6:
                System.out.println("Весна");
                break;
            case 7, 8, 9:
                System.out.println("Лето");
                break;
            case 10, 11, 12:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}
