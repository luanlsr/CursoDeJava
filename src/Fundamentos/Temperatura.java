package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (ºF - 32) X 5/9 = Cº
        double Celcius = 30;
        double Fahrenheit = 86;
        final int AJUSTE = 32;
        final double FATOR = 5/9.0;

        double ConversionToCelcius = (Fahrenheit - AJUSTE) * FATOR;
//        double ConversionToFahreneit = 23;
        System.out.println("A temperatura " + Fahrenheit + "ºF em Celcius é: " + ConversionToCelcius + "ºC");
    }
}
