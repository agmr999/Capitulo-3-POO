package capitulo3.Ejercicios;
import java.util.Scanner;

public class ArithmeticMethods2 {


    public static  Integer displayNumberPlus10(Integer number){
        Scanner entrada = new Scanner(System.in);
        System.out.println("dame el numero: ");
        number=entrada.nextInt();
        return number+10;
    }

    public static Integer displayNumberPlus100(Integer number){
        Scanner entrada = new Scanner(System.in);
        System.out.println("dame el numero: ");
        number=entrada.nextInt();
        return number+100;
    }

    public static Integer displayNumberPlus1000(Integer number){
        Scanner entrada = new Scanner(System.in);
        System.out.println("dame el numero: ");
        number=entrada.nextInt();
        return number+1000;

    }
}
