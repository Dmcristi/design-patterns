package singleton.classbased.lazysingleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Initializing a lazy singleton");
    }

//    public static LazySingleton getInstance(){
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    // we can make it safe with synchronized
    // or with double-checked locking // is outdated
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }


}
