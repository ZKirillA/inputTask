import java.util.Scanner;

public class BaseConverter {
    public double convert(String to, double celsius){
        switch(to){
            case "Kelvin":
                return celsius + 273.15;
            case "Fahrenheit":
                return (celsius*9.0/5.0)+32;
            default:
                throw new IllegalArgumentException("Неверный тип конвертации"+ to);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseConverter converter = new BaseConverter();

        double celsius = 0.0;
        boolean isCelsiusValid = false;
        while(!isCelsiusValid){
            System.out.println("Введите температуру в градусах Цельсия: ");
            if(scanner.hasNextDouble()){
                celsius=scanner.nextDouble();
                isCelsiusValid=true;
            } else{
                System.out.println("Некорректное значение. Попробуйте еще раз.");
                scanner.next();
            }
        }
        String conversionType = "";
        boolean isValidConversion = false;
        while(!isValidConversion){
            System.out.println("Введите 'Kelvin' для конвертации в Кельвины или введите 'Fahrenheit' для конвертации в Фаренгейты");
            conversionType=scanner.next();
            if(conversionType.equals("Kelvin")||conversionType.equals("Fahrenheit")){
                isValidConversion = true;
            } else{
                System.out.println("Некорректный тип конвертации. Попробуйте еще раз");
            }
        }
        double result = converter.convert(conversionType, celsius);
        System.out.println("Результат конвертации: "+ result+" "+conversionType);
    }
}