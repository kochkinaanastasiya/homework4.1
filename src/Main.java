public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задание 2
        int clientDeviceYear = 2014;
        int clientOSIOS = 0;
        int clientOSAndroid = 1;
        if (clientDeviceYear < 2015 && clientOSAndroid == clientOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOSIOS == clientOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установить приложение");
        }
        // Задание 3
        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Задание 4
        int deliveryDistance = 95;
        int deliveryWithin20km = 1;
        int deliveryFrom20To60km = 2;
        int deliveryFrom60To100km = 3;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryWithin20km);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryFrom20To60km);
        } else {
            System.out.println("Потребуется дней: " + deliveryFrom60To100km);
        }
        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сечас лето");
            break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
            break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}