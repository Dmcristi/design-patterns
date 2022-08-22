package singleton.innerclass;

public class Singleton {

    private Singleton() {
    }

    public static class SingletonHolder{
        public static final Singleton instance = new Singleton();

    }


    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
