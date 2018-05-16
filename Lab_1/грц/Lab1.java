import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите начало отрезна: ");
        double a = in.nextDouble();
        System.out.print("Введите конец отрезна: ");
        double b = in.nextDouble();
        System.out.print("Введите шаг: ");
        double h = in.nextDouble();
        for (double x = a; x <= b; x+=h)
        {
            double F = Math.tan(2*x) - 3;
            System.out.println("х = " + x + " F(x) = tg(2x) - 3 = " + F);
        }
    }
}
