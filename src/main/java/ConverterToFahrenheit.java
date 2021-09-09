public class ConverterToFahrenheit implements TemperatureConverter {
    @Override
    public String conversionFromCelsius(double temp) {
        double newTemp = (temp * 1.8) + 32;
        return newTemp + " Fahrenheit";
    }
}
