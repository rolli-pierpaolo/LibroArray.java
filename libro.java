package libreria;

public class Libro {

    private String titolo;
    private double prezzo;
    
    public Libro(String titolo,double prezzo) {
        this.titolo=titolo;
        this.prezzo=prezzo;
    }
    
    double getPrezzo() {
        return prezzo;
    }
    public void stampaInfo() {
        System.out.println("il libro si intitola : "+titolo+" e costa "+prezzo+" euro.");
    }
}
