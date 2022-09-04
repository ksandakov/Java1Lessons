package com.geekbrains.lesson1;

/**
 * Домашняя работа №1
 * Переменные, примитивы, условия, методы
 * Сандаков Константин Александрович
 * Создан: 2022.09.01
 */

public class HomeWork {
    /*
     * Задание №1
     * Написать метод вычисляющий выражение а * (b + (c / d) и возвращающий результат с плавающей точкой,
     * где a, b, c, d - целочисленные входные параметры этого метода.
     */
    private static float calculate (int a, int b, int c, int d) {
        return a * (b + (c * 1.0f / d));
    }

    /*
     * Задание №2
     * Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
     * от 10 до 20 (включительно), если да - вернуть true, в противном случае - false.
     */

    private static boolean checkTwoNumbers (int a, int b) {
        int sum = a + b;
        return sum <= 20 && sum >= 10;
    }

    /*
     * Звдание №3
     * Написать метод, которому в качестве параметра передается целое число, метод должен проверить
     * положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
     * Результат работы метода вывести в консоль.
     */

    private static boolean isPositive(int a) {
        return a >= 0;
    }

    /*
     * Задание №4
     * Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен
     * вернуть приветственное сообщение "Привет, переданное_имя!". Вывести приветствие в консоль.
     */

    private static String welcome (String name) {
        System.out.println("Привет!");
        return "Привет, " + name;
    }

    /*
     * Задание №5
     * Написать метод, который определяет является ли год високосным.
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й високосный.
     * Для проверки работы вывести результаты работы метода в консоль.
     */

    private static boolean isLeapYear(int year) {return (year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0);
    }

    public static void main(String[] args) {
        System.out.println("Ваш результат " + calculate(1,2,3,4)); // Задание №1

        System.out.println(checkTwoNumbers(1,5)); // Задание №2

        boolean result = isPositive(-2); // Задание №3
        if (result) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

        System.out.println(welcome("Ivan")); // Задание №4

        System.out.println("Высокосный ли год? " + isLeapYear(2020)); // Задание №5
    }
}
