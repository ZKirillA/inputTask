import java.util.Scanner;

public class BaseConverter {

    public static void main(String[] args) {
        convert();
    }

    private static void convert() {
        System.out.println("Введите температуру в Цельсиях");
        Scanner scanner = new Scanner(System.in);
        int Celsiy = scanner.nextInt();
        System.out.println("Выберите: 1 - Перевести в Фаренгейты, 2 - Перевести в Кельвины");
        Scanner scanner2 = new Scanner(System.in);
        int result = scanner2.nextInt();
        if (result == 1) {
            int Fahrengeit = (Celsiy * 9 / 5) + 32;
            System.out.println("Температура в фаренгейтах равна " + Fahrengeit + " градусов");
        } else if (result == 2) {
            double Kelvin = Celsiy + 273.15;
            System.out.println("Температура в кельвинах равна " + Kelvin + " градусов");
        } else {
            System.out.println("Вы выбрали некорректное значение");
        }
    }
}
