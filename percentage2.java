package capitulo3.Ejercicios;
import java.util.Scanner;

public class percentage2 {

    public static String computePercent(double numero, double numero_2){
        Scanner entrada = new Scanner(System.in);
        System.out.println("dame el primer numero: ");
        numero = entrada.nextDouble();
        System.out.println("dame el segundo numero: ");
        numero_2 = entrada.nextDouble();
        double porcentage;
        porcentage = (numero*100)/numero_2;
        return numero+" corresponde al: "+porcentage+"% de: "+numero_2;
    }
}
