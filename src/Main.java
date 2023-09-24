public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задание 1");
        byte clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задание 2");
        byte clientOS = 0;
        short clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }

        System.out.println();
    }
    /*Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
    Также високосным является каждый четырехсотый год.
    Год должен быть больше, чем 1584 (в котором был введен високосный год).*/
    public static void task3() {
        System.out.println("Задание 3");
        short year = 2023;
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (year < 1584) {
            System.out.printf("В %d году високосный год ещё не был введён \n", year);
        } else if (leapYear) {
            System.out.printf("%d год является високосным \n", year);
        } else {
            System.out.printf("%d год не является високосным \n", year);
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задание 4");
        short deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставка не производится на растояние свыше 100км");
        }
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задание 5");
        byte monthNumber = 0;
        switch (monthNumber) {
            case 12, 1, 2: {
                System.out.println("зима");
                break; }
            case 3, 4, 5: {
                System.out.println("весна");
                break;
            }
            case 6, 7, 8: {
                System.out.println("лето");
                break;
            }
            case 9, 10, 11: {
                System.out.println("осень");
                break;
            }
            default: {
                System.out.println("Такого номера месяца не существует");
            }
        }
        System.out.println();
    }
}