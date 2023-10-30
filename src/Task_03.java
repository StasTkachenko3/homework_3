import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Задание №3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите животное: ");
        System.out.println("1.Кошка");
        System.out.println("2.Собака");
        System.out.println("3.Утка");
        System.out.println("4.Ежик");
        System.out.println("5.Голубь");
        System.out.println("6.Андрей");
        System.out.println("7.Мышь");
        System.out.println("8.Баран");
        System.out.println("9.Осел");
        System.out.println("10.Корова");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
            System.out.println("Мяу");
            break;
            case 2:
                System.out.println("Гав");
                break;
            case 3:
                System.out.println("Кря");
                break;
            case 4:
                System.out.println("Фрррр");
                break;
            case 5:
                System.out.println("Крулык");
                break;
            case 6:
                System.out.println("Здорова Браат");
                break;
            case 7:
                System.out.println("3,14");
                break;
            case 8:
                System.out.println("Бееее");
                break;
            case 9:
                System.out.println("ИААААА");
                break;
            case 10:
                System.out.println("Молоко будешь?");
                break;
            default:
                System.out.println();
        }
    }
}
