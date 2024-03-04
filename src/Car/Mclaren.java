package Car;

public class Mclaren implements Car{
    @Override
    public void showCarName() {
        System.out.println("Mclaren sportscar");
    }

    @Override
    public int getMaxSpeed() {
        return 340;
    }
}
