package Sklep_z_uzyciem_settera;

public class CalculatorTax {
    private CalculateTax calculate;

    public CalculatorTax(CalculateTax calculateTax)
    {
        this.calculate = calculateTax;
    }

    public void setCalculateTax(CalculateTax calculateTax)
    {
        this.calculate = calculateTax;
    }

    public double calculateTax(double amount)
    {
        return calculate.calculateTax(amount);
    }
}