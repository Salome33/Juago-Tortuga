package JuegoTortuga;

public class CarreraTortugaRunnable {
    public static void main(String[] args) {
        System.out.println("¡Comienza la carrera de tortugas!\n");

        Tortuga t1 = new Tortuga("Tortuga 1");
        Tortuga t2 = new Tortuga("Tortuga 2");
        Tortuga t3 = new Tortuga("Tortuga 3");

        Thread hilo1 = new Thread(t1);
        Thread hilo2 = new Thread(t2);
        Thread hilo3 = new Thread(t3);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
