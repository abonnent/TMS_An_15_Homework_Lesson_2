import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.print("Пожалуйста, укажите один аргумент - количество чисел Фибоначчи для вывода: ");
        Scanner console = new Scanner(System.in);
        String number = console.nextLine();
        int n = Integer.parseInt(number);

        System.out.println("Первые " + n + " чисел Фибоначчи:");
        for (int i = 0; i < n; i++) {
            int fibonacciNumber = getFibonacciNumber(i);
            System.out.print(fibonacciNumber + " ");
        }
    }

    public static int getFibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        } else {
            return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
        }
    }
}
