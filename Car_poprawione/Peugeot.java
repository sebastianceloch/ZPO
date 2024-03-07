package Car_poprawione;

public class Peugeot implements CarName, CarSpeed{

    @Override
    public void showCarName() {
        System.out.println("Peugeot nice car");
    }

    @Override
    public int getMaxSpeed() {
        return 200;
    }
}
