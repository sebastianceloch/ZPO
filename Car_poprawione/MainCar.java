package Car;

import java.util.ArrayList;

public class MainCar {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(new Pagani(), new Pagani()));
        cars.add(new Car(new Peugeot(), new Peugeot()));
        cars.add(new Car(new Fiat(), new Fiat()));

        for (Car car : cars) {
            car.showCarName();
            System.out.println(car.getMaxSpeed());
        }
    }
}


//mozna stworzyc jeden interfejs i wtedy w konstruktorze bedzie jedynie np. new Car(new Pagani()) poniewaz nie bedziemy potrzebowac drugiego argumentu