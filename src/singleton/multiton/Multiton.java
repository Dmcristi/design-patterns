package singleton.multiton;

public class Multiton {
    public static void main(String[] args) {

        Printer main = Printer.get(Subsystem.PRIMARY);
        Printer aux = Printer.get(Subsystem.AUXILIARY);
        Printer aux2 = Printer.get(Subsystem.AUXILIARY);
        Printer aux3 = Printer.get(Subsystem.AUXILIARY);
        Printer fall = Printer.get(Subsystem.FALLBACK);
    }
}
