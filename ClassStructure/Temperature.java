/*14.	Create a library of methods for converting temperatures between Celsius, Kelvin, 
and Fahrenheit. You can name the methods e.g. CelsiusToKelvin(), KelvinToCelsius(), 
ect. Then create a program that calculates and displays the temperature:
a.	25 degrees Celsius in Kelvin and Fahrenheit
b.	100 degrees Fahrenheit in Kelvin and Celsius
c.	0 degrees Kelvin in Celsius and Fahrenheit
 */
package ClassStructure;

public class Temperature {
    static void CelciusToKelvin(double x){
        double temp = x + 273.15;
        System.out.println(temp);
    }
    static void CelciusToFarenheit(double x){
        double temp = x*(9/5)+32;
        System.out.println(temp);
    }
    static void KelvinToCelcius(double x){
        double temp = x - 273.15;
        System.out.println(temp);
    }
    static void KelvinToFarenheit(double x){
        double temp = x*(9/5) - 459.67;
        System.out.println(temp);
    }
    static void FarenheitToCelcius(double x){
        double temp = Math.round(((x-32)*(5.0/9.0)));                     
        System.out.println(temp);
    }
    static void FarenheitToKelvin(double x){
        double temp = Math.round((x+459.67)*(5.0/9.0));                    
        System.out.println(temp);
    }

    public static void main(String[] args){
        Temperature.CelciusToKelvin(25);
        Temperature.CelciusToFarenheit(25);
        Temperature.FarenheitToCelcius(100);
        Temperature.FarenheitToKelvin(100);
        Temperature.KelvinToCelcius(0);
        Temperature.KelvinToFarenheit(0);

    }

}

