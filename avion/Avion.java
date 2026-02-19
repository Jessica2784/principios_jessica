public class Avion {

    public String modelo;
    public String aerolinea;
    protected String tipo;
    private int capacidad;

    // Constructor
    public Avion() {
        System.out.println("Construyo un avion");
    }

    public void acelerar() {
        System.out.println("Avion acelero");
    }

    public void deshacelerar() {
        System.out.println("Avion deshacelero");
    }
}
