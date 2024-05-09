public class Main {
    public static void main(String[] args) {
        Serie serie1 = new Serie(2,20, "Serie2: ");
        Serie serie2 = new Serie(5,20, "Serie5: ");
        Serie serie3 = new Serie(10,20, "Serie10: ");

        serie1.start();

        serie2.start();

        serie3.start();
    }
}