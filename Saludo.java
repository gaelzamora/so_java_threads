class Saludo extends Thread{
    // ATRIBUTOS
    // CONSTRUCTORES
    
    // METODOS
    @SuppressWarnings("deprecation")
    public void run() {
        System.out.println("\tSoy el hijo " + getName() + "ID: " + getId() + "prioridad: " + getPriority() + "state: " + getState() + "Grupo: " + getThreadGroup());
        System.out.println("\t" + getName() + "termina");
    }
}