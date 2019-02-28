package capitulo3.Ejercicios;

/*There are 2.54 centimeters in an inch, and there are 3.7854 liters in a U.S. gallon.
Create a class named MetricConversion . Its main() method accepts an integer value
from a user at the keyboard, and in turn passes the entered value to two methods.
One converts the value from inches to centimeters and the other converts the same
value from gallons to liters. Each method displays the results with appropriate
explanation. Save the application as MetricConversion.java.*/

public class MetricConversion {

    private Integer conversion;
    private static final double FACTORPULGADA = 2.54;
    private static final double FACTORGALON = 3.7854;

    public  MetricConversion(Integer conversion){

        this.conversion = conversion;

    }

    public Double toCentimetros(){
        double centimetros;
        centimetros = conversion*FACTORPULGADA;
        return centimetros;
    }
    public Double toLitros(){
        double litros;
        litros = conversion*FACTORGALON;
        return litros;

    }

    public String Mostrar(){
        return "si quiera convertir el numero:"+conversion+" de galones a litros seria: "+toLitros()+" y de pulgadas a centimetros seria: "+toCentimetros();
    }


}
