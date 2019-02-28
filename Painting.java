package capitulo3.Ejercicios;

public class Painting {
    private String Titulo;
    private Integer precio;
    private String medio;
    private double comision;

    public Painting() {
        this.medio = "ninguno";
        this.precio = 000;
        this.Titulo = "ninguno";
        this.comision = precio*0.20;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }
}
