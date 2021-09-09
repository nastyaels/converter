public class ConverterFactory {

    public TemperatureConverter getConverter(String thisLocale) {
        TemperatureConverter toReturn = null;
        switch (thisLocale) {
            case "US" :
                toReturn = new ConverterToFahrenheit();
                break;
            case "CH" :
                toReturn = new ConverterToKelvin();
                break;
            default:
                toReturn = new ConverterCelsius();
    }
    return toReturn;
    };
}
