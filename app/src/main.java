import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Введите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вчитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Остаток от деления");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if (operation == 1) {
            System.out.println("Результат = " + (a + b));
        } else if (operation == 2) {
            System.out.println("Результат = " + (a - b));
        } else if (operation == 3) {
            System.out.println("Результат = " + (a * b));
        } else if (operation == 4) {
            System.out.println("Результат = " + (a / b));
        } else if (operation == 5) {
            System.out.println("Результат = " + (a % b));
        }
    }
}
