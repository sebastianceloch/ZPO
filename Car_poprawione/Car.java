package Car_poprawione;

public class Car
{
    CarSpeed carSpeed;
    CarName carName;

    public Car(CarSpeed carSpeed, CarName carName)
    {
        this.carSpeed = carSpeed;
        this.carName = carName;
    }

    public int getMaxSpeed()
    {
        return carSpeed.getMaxSpeed();
    }

    public void showCarName()
    {
        carName.showCarName();
    }
}
