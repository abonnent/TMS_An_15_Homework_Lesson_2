import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        System.out.print("Введите число произвольной длинны: ");
        Scanner scanner = new Scanner(System.in);
        String strNumber = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            sum += Integer.parseInt(String.valueOf(strNumber.charAt(i)));
        }
        System.out.println("Сумма чисел трёхзначного числа равна: " + sum);

    }
}
