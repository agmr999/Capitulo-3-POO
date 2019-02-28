package capitulo3.Ejercicios;

/*Write an application that calculates and displays the amount of money a user would
have if his or her money could be invested at 5 percent interest for one year. Create a
method that prompts the user for the starting value of the investment and returns it
to the calling program. Call a separate method to do the calculation, and return the
result to be displayed. Save the program as Interest.java.*/

public class Interest {

    private Integer starting;

    public Integer getStarting() {
        return starting;
    }

    public void setStarting(Integer starting) {
        this.starting = starting;
    }

    public Double amountfinal(){
        Double money;
        money = starting*Math.pow((1+0.05),1);
        return money;
    }

}
