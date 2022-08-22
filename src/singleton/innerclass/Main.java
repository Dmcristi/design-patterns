package singleton.innerclass;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();


        System.out.println(singleton2);



    }
}
