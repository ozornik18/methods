import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean printTask1(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void task1() {
        System.out.println("Задание 1");
        int year = 2022;

        if (printTask1(year)) {
            System.out.println(year + " - Год является високосным");
        } else {
            System.out.println(year + " - год не является високосным");
        }
    }


    public static void task2() {
        System.out.println("Задание 2");
        task2print(1, 2021);
    }

    public static void task2print(int clientOs, int mobileYear) {
        String osName = mobileOsName(clientOs);
        String osVersion = yearClientOsName(mobileYear);

        System.out.println("Установите " + osVersion + " версию приложения для " + osName + " по ссылке");


    }

    public static String mobileOsName(int clientOs) {
        if (clientOs == 0) {
            return "iOS";
        } else if (clientOs == 1) {
            return "Android";
        }
        return null;
    }

    public static String yearClientOsName(int mobileYear) {
        if (mobileYear <= 2015) {
            return "облегченную";
        } else {
            return "обычную";
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        task3print(95);
    }

    public static void task3print(int distance) {
        int deliveryDays;
        System.out.println("Потребуется дней: " + deliveryDist(distance));
    }

    public static int deliveryDist(int distance) {
        int deliveryDays;

        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else if (distance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
        }
        return deliveryDays;
    }

}