package Car_poprawione;

import java.util.ArrayList;

public class MainCar {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(new FastCar(), new Pagani()));
        cars.add(new Car(new FastCar(), new Peugeot()));
        cars.add(new Car(new SlowCar(), new Fiat()));

        for (Car car : cars) {
            car.showCarName();
            System.out.println(car.getMaxSpeed());
        }
    }
}

