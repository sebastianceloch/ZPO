package Car_poprawione;

public class Fiat implements CarSpeed, CarName{
    @Override
    public void showCarName() {
        System.out.println("Fiat car");
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }
}
