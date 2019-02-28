package capitulo3.Ejercicios;

public class Percentage {

    public static String computePercent(double numero, double numero_2){
        double porcentage;
        porcentage = (numero*100)/numero_2;
        return numero+" corresponde al: "+porcentage+"% de: "+numero_2;
    }
}
