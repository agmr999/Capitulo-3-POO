package capitulo3.Ejercicios;

public class Sandwich {
    private String mainIngredient;
    private String breadType;
    private Double price;


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String mostrar(){
        return "el precio es: "+getPrice()+
                "\n el pan es: "+getBreadType();
    }
}
