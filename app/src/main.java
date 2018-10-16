import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число");
        System.out.println("Введите максимальное число для игры");
        int range = scanner.nextInt();
        int num = (int) (Math.random() * range);
        playLevel (range, num);
        scanner.close();
    }
    private static void playLevel(int range, int num){
        int count = 0;
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            count += 1;
            if (input_number == num) {
                System.out.println("Вы угадали");
                break;
            }
            System.out.println("Количество попыток: " + count);
            if (input_number > num) {
                System.out.println("Вы не угадали! Загаданное число меньше");
            } else if (input_number < num) {
                System.out.println("Вы не угадали! Загаданное число больше");
            }
        }
    }
}
