package clase03;

public class Main {
        
    public static void main(String[] args) {
        Serie serie1 = new Serie(2,20, "Serie2: ");
        Serie serie2 = new Serie(5,20, "Serie5: ");
        Serie serie3 = new Serie(10,20, "Serie10: ");

        serie1.start();

        serie2.start();

        try {
            serie1.join();
        } catch (InterruptedException ex) {}

        try {
            serie2.join();
        } catch (InterruptedException ex) {}
        
        System.out.println("Esperando a que termine serie 2 y 5");

        serie3.start();

        System.out.println("Main: Ejecutando serie 10");
        try {
            serie3.join();
        } catch (InterruptedException ex) {}

        System.out.println("Main: Termine...");    
    }
    
}
