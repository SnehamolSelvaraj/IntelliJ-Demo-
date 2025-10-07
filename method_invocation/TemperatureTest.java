class TemperatureConverter {
    double celsius;

    public void setTemperature(double c) {
        this.celsius = c;
    }

    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }
}

public class TemperatureTest {
    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter();
        temp.setTemperature(25);  // set Celsius
        double fahrenheit = temp.toFahrenheit();  // use return value
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
