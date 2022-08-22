package singleton.classbased.classbased2;

public class PrintSpooler {

    private int id;
    private static int idCounter = 0;

    private static PrintSpooler spooler;
    private static boolean initialized = false;

    private PrintSpooler() {
        this.id = ++idCounter;
    }

    private void init(){
        System.out.println("Object was initialized!");
        System.out.println(getId());
    }
    public int getId() {
        return id;
    }

    public static synchronized PrintSpooler getInstance(){
        if(initialized){
            return spooler;
        }
        spooler = new PrintSpooler();
        spooler.init();
        initialized = true;
        return spooler;
    }
}
