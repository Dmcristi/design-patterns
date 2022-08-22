package singleton.enumsingleton.enumsingleton2;

public enum EnumBasedSingleton {

    INSTANCE;
    private int value;

    EnumBasedSingleton() {
        value = 42;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Demo {
    public static void main(String[] args) {
        EnumBasedSingleton enumSingleton = EnumBasedSingleton.INSTANCE;

        System.out.println(enumSingleton.getValue());
    }

}
