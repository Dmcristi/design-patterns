package singleton.enumsingleton;

public class Main {
    public static void main(String[] args) {

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton2.setInfo("Info modificat");
        System.out.println(enumSingleton.getInfo());
        System.out.println(enumSingleton2.getInfo());

    }
}
