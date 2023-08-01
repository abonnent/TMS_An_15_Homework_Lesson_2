import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.print("Введите трёхзначное число: ");
        Scanner scanner = new Scanner(System.in);
        String strNumber = scanner.nextLine();

        if (strNumber.length() == 3) {
            int sum = 0;
            for (int i = 0; i < strNumber.length(); i++) {
                sum += Integer.parseInt(String.valueOf(strNumber.charAt(i)));
            }
            System.out.println("Сумма чисел трёхзначного числа равна: " + sum);
        } else {
            System.out.println("Ввести нужно трёхзначное число!");
        }
    }
}
