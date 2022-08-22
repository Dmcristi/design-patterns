package singleton.monostate;

public class ChiefExecutive {
    private static String name;
    private static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        ChiefExecutive.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        ChiefExecutive.age = age;
    }

    @Override
    public String toString() {
        return "ChiefExecutive{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
