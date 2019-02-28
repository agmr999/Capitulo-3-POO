package capitulo3.Ejercicios;

public class Student {

    private Integer ID;
    private Integer horas;
    private Integer Putnos;


    public Student(Integer ID, Integer horas, Integer putnos) {
        this.ID = ID;
        this.horas = horas;
        Putnos = putnos;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getPutnos() {
        return Putnos;
    }

    public void setPutnos(Integer putnos) {
        Putnos = putnos;
    }

    //---------------
    public Double Promedio(){
        double promedio;
        promedio = getPutnos()/getHoras();
        return promedio;

    }
    
    public String toString(){
        return "el promedio del estudiante es: "+Promedio()+
                " \n Sus horas: "+getHoras()+
                " \n Sus puntos: "+getPutnos();
    }


}
