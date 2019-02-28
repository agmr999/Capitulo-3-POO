package capitulo3.Ejercicios;

/*Write an application that calculates and displays the weekly salary for an employee.
The main() method prompts the user for an hourly pay rate, regular hours, and
overtime hours. Create a separate method to calculate overtime pay, which is regular
hours times the pay rate plus overtime hours times 1.5 times the pay rate; return the
result to the main() method to be displayed. Save the program as Salary.java.*/

public class Salary {
private Double rate;
private Integer HorasRegulares;
private Integer HorasExtra;

public Salary(Double rate,Integer horasRegulares, Integer horasExtra){
    this.rate = rate;
    this.HorasRegulares = horasRegulares;
    this.HorasExtra = horasExtra;

}

public Double HorasFormales(){
    double pagoNormal;
    pagoNormal = HorasRegulares*rate;
    return pagoNormal;
}

public Double HorasExtra(){
    double pagoExtra;
    pagoExtra = (HorasRegulares*rate)+(HorasExtra*(rate*1.5));
    return pagoExtra;
}

public String Mostrar(){
    double pago = HorasFormales()+HorasExtra();
    return "su pago es: "+pago;
}

}
