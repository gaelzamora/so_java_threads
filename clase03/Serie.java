package clase03;

public class Serie extends Thread {
    private int increment;
    private int n;

    public Serie(int increment, int n, String name) {
        this.increment = increment;
        this.n = n;
        setName(name);
    }

    public void run() {
        for(int i=increment; i<=n; i= i + increment) {
            System.out.println("\t" + getName()+": "+i);
        }
    }
}
