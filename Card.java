package capitulo3.GameZone;

public class Card {
    private Enum suit;
    private Integer number;

    final int CARDS_IN_SUIT = 13;
    int myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);

    public Enum getSuit() {
        return suit;
    }

    public void setSuit(Enum suit) {
        this.suit = suit;
    }

    public Card(Enum suit) {
        this.suit = suit;
        this.number = myValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String toString(){
        return "valor: "+getSuit()+
                "\nnumero: "+getNumber();
    }
}
