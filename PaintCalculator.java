package capitulo3.Ejercicios;

/*Assume that a gallon of paint covers about 350 square feet of wall space. Create an
application with a main() method that prompts the user for the length, width, and
height of a rectangular room. Pass these three values to a method that does the
following:
l Calculates the wall area for a room
l Passes the calculated wall area to another method that calculates and returns the
number of gallons of paint needed
l Displays the number of gallons needed
l Computes the price based on a paint price of $32 per gallon, assuming that
the painter can buy any fraction of a gallon of paint at the same price as a
whole gallon
l Returns the price to the main() method
173
The main() method displays the final price. For example, the cost to paint a
15- by-20-foot room with 10-foot ceilings is $64. Save the application as
PaintCalculator.java.*/

public class PaintCalculator {

    public static final Integer PRICE = 32;
    public static final Integer COVER = 350;

    private Integer alto;
    private Integer largo;
    private Integer ancho;

    public PaintCalculator(Integer alto,Integer ancho,Integer largo){//constructor
        this.alto=alto;
        this.largo=largo;
        this.ancho=ancho;
    }

    public Integer CalcularArea(){
        return (largo*alto)*2 + (alto*ancho)*2;
    }

    public Integer NumeroGalones() {
        return CalcularArea()/COVER+CalcularArea()%COVER>0?1:0;
    }

    public Integer costo(){
        return NumeroGalones()*PRICE;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }
}
