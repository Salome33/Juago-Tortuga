package JuegoTortuga;

public class Tortuga implements Runnable {
    private String nombre;
    private int distanciaRecorrida = 0;
    private static final int META = 100;

    public Tortuga(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (distanciaRecorrida < META) {
            try {
                int paso = (int) (Math.random() * 10 + 1);
                distanciaRecorrida += paso;

                System.out.println(nombre + " avanzó " + paso + " pasos. Total: " + distanciaRecorrida);

                Thread.sleep((int) (Math.random() * 400 + 200));

            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpida.");
                return;
            }
        }

        System.out.println("🏁 " + nombre + " ha llegado a la meta!");
    }
}
