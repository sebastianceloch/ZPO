package Car;

public class VWPassat implements Car{
    @Override
    public void showCarName() {
        System.out.println("Best car in the world Passatini");
    }

    @Override
    public int getMaxSpeed() {
        return 220;
    }
}
