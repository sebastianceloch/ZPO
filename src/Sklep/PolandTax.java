package Sklep;

public class PolandTax implements CalculateTax{
    @Override
    public double calculateTax(double number) {
        return number * 0.23;
    }
}
