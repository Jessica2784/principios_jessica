public class Television {

    public String forma;
    public String calidadDeVideo;
    protected String marca;
    private String tamano;

    // Constructor
    public Television() {
        System.out.println("Construyo una television");
    }

    public void apagada() {
        System.out.println("Television apagada");
    }

    public void encendida() {
        System.out.println("Television encendida");
    }
}
