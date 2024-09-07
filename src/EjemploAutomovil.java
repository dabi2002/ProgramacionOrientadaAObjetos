public class EjemploAutomovil {
    public static void main(String[] args){

        Automovil mazda = new Automovil("Mazda", "BT-50");

        mazda.setCilindrada(2.0);
        mazda.setColor("Blanco");
        System.out.println("El fabricante es: " + mazda.getFabricante());
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(50));
        System.out.println(mazda.frenar());


    }
}
