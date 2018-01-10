package Modelo;

public class Figura {
    
    private String nombreFigura;
    private int ladosFigura;

    public Figura(String nombreFigura, int ladosFigura) {
        this.nombreFigura = nombreFigura;
        this.ladosFigura = ladosFigura;
    }

    public Figura() {
    }
    
    public int getLadosFigura() {
        return ladosFigura;
    }

    public void setLadosFigura(int ladosFigura) {
        this.ladosFigura = ladosFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
    
}
