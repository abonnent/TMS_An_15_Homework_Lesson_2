import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.print("Пожалуйста, выберите фигуру,чью площадь нужно вычислить. Где 1 - прямоугольник; 2 - треугольник; 3 - круг.: ");
        Scanner scanner = new Scanner(System.in);
        int shapeNumber = scanner.nextInt();

        switch (shapeNumber) {
            case 1 -> getAreaRectangle();
            case 2 -> getAreaTriangle();
            case 3 -> getAreaCircle();
            default -> System.out.println("Вы ввели недопустимое значение!");
        }
    }

    private static void getAreaCircle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Площадь круга равна: " + area);
    }

    private static void getAreaTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону A: ");
        double sideA = scanner.nextDouble();

        System.out.print("Введите сторону B: ");
        double sideB = scanner.nextDouble();

        System.out.print("Введите сторону C: ");
        double sideC = scanner.nextDouble();

        double semiPerimeter = (sideA + sideB + sideC) / 2;

        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

        System.out.println("Площадь треугольника равна: " + area);
    }

    private static void getAreaRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Площадь прямоугольника равна: " + area);
    }
}
