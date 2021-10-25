package it.campe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int sum = n1 + n2 + n3;
        System.out.println((double) sum / 3);

    }
}
/*Считай с клавиатуры три целых числа. Выведи на экран их среднее арифметическое.*/