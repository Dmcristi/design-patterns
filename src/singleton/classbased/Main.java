package singleton.classbased;

public class Main {
    public static void main(String[] args) {

        ClassSingleton singleton = ClassSingleton.getInstance();
        ClassSingleton singleton2 = ClassSingleton.getInstance();

        singleton.setInfo("o singura instanta");

        System.out.println(singleton.getInfo());
        System.out.println(singleton2.getInfo());

    }
}
