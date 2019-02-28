package capitulo3.Ejercicios;

/*The Harrison Group Life Insurance company computes annual policy premiums
based on the age the customer turns in the current calendar year. The premium is
computed by taking the decade of the customer’s age, adding 15 to it, and multi-
plying by 20. For example, a 34-year-old would pay $360, which is calculated by
adding the decades (3) to 15, and then multiplying by 20. Write an application that
prompts a user for the current year and a birth year. Pass both to a method that
calculates and returns the premium amount, and then display the returned amount.
Save the application as Insurance.java*/

public class Insurance {

    private Integer edad;

    public Insurance(Integer actual, Integer nacimiento){

        this.edad = actual-nacimiento;

    }

    public Integer Insurance(){
        int insurance;
        insurance = (edad+(edad/10))*20;
        return insurance;
    }

    public String Mostrar(){
        return "esta es su edad: "+edad+
                " \nasi que su seguro sera: "+Insurance();
    }


}
