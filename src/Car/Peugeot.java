package Car;

public class Peugeot implements Car{
    @Override
    public void showCarName() {
        System.out.println("Peugeot");
    }

    @Override
    public int getMaxSpeed() {
        return 120;
    }
}
