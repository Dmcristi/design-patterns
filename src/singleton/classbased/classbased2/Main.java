package singleton.classbased.classbased2;

public class Main {
    public static void main(String[] args) {

//        PrintSpooler spooler = PrintSpooler.getInstance();

        Thread thread = new Thread( () -> {PrintSpooler s = PrintSpooler.getInstance();});
        Thread thread2 = new Thread( () -> {PrintSpooler s = PrintSpooler.getInstance();});

        thread.start();
        thread2.start();

        /*  we must add synchronized in order to not be created other instances of the object */

    }
}
