import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число");
        int range = 20;
        int num = (int)(Math.random() * range);
        int count = 0;
        while(true){
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            count += 1;
            if(input_number == num){
                System.out.println("Вы угадали");
                break;
            }
            System.out.println("Количество попыток: " + count);
            if(input_number > num){
                System.out.println("Вы не угадали! Загаданное число меньше");
            } else if(input_number < num){
                System.out.println("Вы не угадали! Загаданное число больше");
            }
        }
    }
}
