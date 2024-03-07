package Car_poprawione;

public class Pagani implements CarName, CarSpeed{
    @Override
    public void showCarName() {
        System.out.println("Pagani sportscar");
    }

    @Override
    public int getMaxSpeed() {
        return 340;
    }
}
