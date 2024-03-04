package Car;

import java.util.ArrayList;

public class MainCar {
    public static void main(String[] args) {
        ArrayList<CarSpeed> cars = new ArrayList<>();
        cars.add(new CarSpeed(new Mclaren()));
        cars.add(new CarSpeed(new Peugeot()));
        cars.add(new CarSpeed(new VWPassat()));

        for(CarSpeed a:cars)
        {
            a.showCarName();
            System.out.println(a.getMaxSpeed());
        }
    }
}
