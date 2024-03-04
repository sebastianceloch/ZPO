package Car;

import Car.Car;

public class CarSpeed
{
    public CarSpeed(Car car)
    {
        this.car = car;
    }

    public int getMaxSpeed()
    {
        return car.getMaxSpeed();
    }

    public void showCarName()
    {
        car.showCarName();
    }

    private Car car;
}

