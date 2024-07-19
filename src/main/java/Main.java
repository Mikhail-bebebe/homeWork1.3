public class Main {
    public static void main(String[] args) {
        //задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //задание 2
        int clientDeviceYear = 2014;
        String operatingSystem = "iOS";
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для " + operatingSystem + " по ссылке");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + operatingSystem + " по ссылке");
        }
        //задание 3
        int year = 2100;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
        //задание 4
        int deliveryDistance = 7;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        //задание 5
        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
