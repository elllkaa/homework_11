public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {
        System.out.println("Задача 1");
        int year = 2022;
        checkYear(year);

    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int currentYear = 2017;
        clientDevice(clientOS, currentYear);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        deliveryTime(deliveryDistance);

    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void clientDevice(int clients, int clientDeviceYear ) {
        if (clients == 0) {
            if ( clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

    }
    public static void deliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает сутки.");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км добавляет еще один день доставки.");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км добавляет еще одни сутки доставки.");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }

    }
}