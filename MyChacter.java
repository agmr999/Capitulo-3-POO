package capitulo3.GameZone;

public class MyChacter {


    private String clan;
    private String family;
    private String habilidad;
    private String arma;
    private Integer life;
    private String OTRONOMBRE;

    public MyChacter(String clan, String family, String habilidad, String arma, Integer life, String OTRONOMBRE) {
        this.clan = clan;
        this.family = family;
        this.habilidad = habilidad;
        this.arma = arma;
        this.life = life;
        this.OTRONOMBRE = OTRONOMBRE;
    }

    public String getOTRONOMBRE() {
        return OTRONOMBRE;
    }

    public void setOTRONOMBRE(String OTRONOMBRE) {
        this.OTRONOMBRE = OTRONOMBRE;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public String toString(){
        return "OTRONOMBRE: "+ getOTRONOMBRE()+
                "\n clan: "+getClan()+
                "\n familia: "+getFamily()+
                "\n arma: "+getArma()+
                "\n habilidad: "+getHabilidad()+
                "\n vida: "+getLife();
    }
}
