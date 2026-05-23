package Q2;

public class Temperature {

    private double celsius;

    public Temperature() {
        celsius = 0.0;
    }

    public double toCelsius() {
        return celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}