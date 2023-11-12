public class Temperatures {
    int celsius;
    int kelvin;
    int farenheit;

    public static double CelsiusToKelvin(int celsius){
        return celsius + 273.15;
    }

    public static double CelsiusToFahrenheit(int celsius){
        return (celsius*9/5)+32;
    }

    public static double KelvinToCelsius(int kelvin){
        return kelvin - 273.15;
    }

    public static double KelvinToFahrenheit(int kelvin){
        return (kelvin-273.15)*9/5+32;
    }

    public static double FahrenheitToCelsius(int farenheit){
        return (farenheit-32)*5/9;
    }

    public static double FahrenheitToKelvin(int farenheit){
        return (farenheit-32)*5/9+273.15;
    }

    public static void main(String[] args){
        System.out.println(CelsiusToFahrenheit(25));
        System.out.println(CelsiusToKelvin(25));
        System.out.println(KelvinToFahrenheit(0));
        System.out.println(KelvinToCelsius(0));
        System.out.println(FahrenheitToCelsius(100));
        System.out.println(FahrenheitToKelvin(100));        
    }
}
