import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String thisLocale = Locale.getDefault().getCountry();
        ConverterFactory factory = new ConverterFactory();
        System.out.println("Enter temperature in Celsius");
        double temp = scanner.nextDouble();
        System.out.println(factory.getConverter(thisLocale).conversionFromCelsius(temp));
    }
}
