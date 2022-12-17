public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int currentYear = 2022;
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
    }
}