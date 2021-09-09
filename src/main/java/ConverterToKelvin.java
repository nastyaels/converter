public class ConverterToKelvin implements TemperatureConverter{
    @Override
    public String conversionFromCelsius(double temp) {
        double newTemp = temp + 273.15;
        return newTemp + " Kelvin";
    }
}
