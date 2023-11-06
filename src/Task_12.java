import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        System.out.println("Задание №12");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 6-ое число: ");
        int n = sc.nextInt();
        int left = (n / 100_000) % 10 + (n / 10_000) % 10 + (n / 1_000) % 10;
        int right = (n / 100) % 10 + (n / 10) % 10 + 10 % 10;
        if (left == right) {
            System.out.println("Счастливый билет ");
        } else {
            System.out.println("Не ешь");
        }
    }
}