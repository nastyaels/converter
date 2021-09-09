public class ConverterCelsius implements TemperatureConverter{
    @Override
    public String conversionFromCelsius(double temp) {
        return temp+" Celsius";
    }
}
