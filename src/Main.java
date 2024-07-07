public class Main {
    public static void main(String[] args) {
        //Задача 1: Простой цикл от 1 до 10
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задача 2: Простой обратный цикл от 1 до 10
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Задача 3: Цикл чётных чисел от 0 до 17
        System.out.println("Задача 3");
        for (int i = 0; i <=17; i = i + 2) {
            System.out.println(i);
        }
        //Задача 4: Цикл от большего к меньшему, область 10;-10
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задача 5: Високосные года с 1904 по 2096
        System.out.println("Задача 5");
        for (int y = 1904; y < 2096; y = y + 4) {
            System.out.println(y + " год является високосным");
        }
        //Задача 6: Цикл 7 ~ 98, шаг 7
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //Задача 7: Геометрическая прогрессия 2
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задача 8: Сумма годовых накоплений без процентов
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        //Задача 9: Сумма кгдовых накоплений с процентами
        System.out.println("Задача 9");
        int salaryPercent = 29000;
        int totalPercent = 0;
        for (int i = 1; i <= 12; i++) {
            totalPercent = (int) (totalPercent * 1.01);
            totalPercent = totalPercent + salaryPercent;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalPercent + " рублей");
        }
        //Задача 10: Таблица умножения на 2
        System.out.println("Задача 10");
        int x = 2;
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(x + "x" + i + "=" + x * i);
        }
    }

}
