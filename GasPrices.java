package capitulo3.Ejercicios;

/*When gasoline is $100 per barrel, then the consumer’s price at the pump is between $3.50
and $4.00 per gallon. Create a class named GasPrices . Its main() method holds an integer
variable named pricePerBarrel to which you will assign a value entered by a user at the
keyboard. Create a method to which you pass pricePerBarrel . The method displays the
range of possible prices per gallon. For example, if gas is $120 per barrel, then the price at
the pump should be between $4.20 and $4.80. Save the application as GasPrices.java.*/

public class GasPrices {

private Double PricePerBarrel;
private static final double ALTO = 4.0;
private static final double BAJO =3.50;
private static final double BASE = 100;

public GasPrices(Double PricePerBarrel){

    this.PricePerBarrel = PricePerBarrel;
}


public String SoroundPrices(){

    Double Ralto = (PricePerBarrel/BASE)*ALTO;
    Double Rbajo = (PricePerBarrel/BASE)*BAJO;

    return "cuando el precio del barril esta a: "+PricePerBarrel+
            " los precios oscilan entre: "+Ralto+" y "+Rbajo;

    }



}
