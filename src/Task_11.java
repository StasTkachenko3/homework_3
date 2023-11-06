import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Задание №11");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коэффициент а: ");
        double a = sc.nextDouble();
        System.out.println("Введите коэффицеинт b: ");
        double b = sc.nextDouble();
        System.out.println("Введите коэффицеинт c: ");
        double c = sc.nextDouble();

        double disc = a * b - 4 * a * c;
        if (disc > 0){
            double x1 = (-b + Math.sqrt(disc)) / (2 * a);
            double x2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Корни квадртаного уравнения: x1= " + x1 + " x2 = " + x2);

        }else if (disc == 0){
            double x = -b / (2 * a);
            System.out.println("Корень равен х = " + x);
        }else {
            System.out.println("Не имеет действительных корней");
        }
    }
}
