package singleton.classbased.classbased2.singletonlist;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();

        List<Car> carList = Collections.singletonList(car1);
//        processResources(carList);

        Car car2 = new Car();


        try {
//            carList.add(car2);
            processResources(carList);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static <T> void processResources(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

}
