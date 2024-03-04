package Sklep;

public class GermanyTax implements CalculateTax{
    @Override
    public double calculateTax(double number) {
        return number * 0.19;
    }
}
