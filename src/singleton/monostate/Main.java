package singleton.monostate;

public class Main {
    public static void main(String[] args) {
        ChiefExecutive ceo = new ChiefExecutive();

        ceo.setName("Smith");
        ceo.setAge(43);

        ChiefExecutive ceo2 = new ChiefExecutive();
        System.out.println(ceo2);
    }
}
