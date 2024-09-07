public class Automovil {

    private String modelo;
    private String fabricante;
    private String color;
    private double cilindrada;
    private int capacidadTanque;


    // Sus metodos constructor para crear el Objeto
    public Automovil() {
    }

    public Automovil(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public Automovil(String modelo, String fabricante, String color) {
        this(modelo, fabricante);
        this.color = color;
    }

    public Automovil(String modelo, String fabricante, String color, double cilindrada) {
        this(modelo, fabricante, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String modelo, String fabricante, String color, double cilindrada, int capacidadTanque) {
        this(modelo, fabricante, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    // Invocar cada uno de los atributos de los objetos
    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getColor() {
        return color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    // Asignandole los atributos al objeto
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }


    // Invocar todos los detalles del objeto
    public String verDetalle() {
        return "El fabricante es: " + this.getFabricante() +
                "\nEl modelo es: " + this.getModelo() +
                "\nEl color es: " + this.getColor() +
                "\nSu cilindraje es: " + this.getCilindrada();
    }


    // Metodos adicionales
    public String acelerar(int km){
        return "El carro esta acelerando a " + km + "Km/h";
    }

    public String frenar(){
        return "El carro está frenando...";
    }

    public String claxon(){
        return "tocando el claxon";
    }

}
