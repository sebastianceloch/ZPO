package Sklep;

public class GBTax implements CalculateTax{
    @Override
    public double calculateTax(double number) {
        return number * 0.2;
    }
}
