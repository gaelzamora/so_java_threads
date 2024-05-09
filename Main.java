public class Main {
    public static void main(String[] args) {
        Saludo obj = new Saludo();
        System.out.println("Padre: Termine...");
        System.out.println("Hilos activos: " + Thread.activeCount() + " Estado hilo: " + obj.getState());
        obj.start();

        Saludo obj2 = new Saludo();
    }
}
