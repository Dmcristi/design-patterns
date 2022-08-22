package singleton.enumsingleton;

public enum EnumSingleton {

    INSTANCE("Initial class info");

    private String info;

    EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
