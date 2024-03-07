package Sklep_z_uzyciem_settera;

public class MainShop {
    public static void main(String[] args) {
        double number = 10.0;
        CalculatorTax taxCalc = new CalculatorTax(new PolandTax());

        double tax = taxCalc.calculateTax(number);
        System.out.println("Poland tax " + tax);

        taxCalc.setCalculateTax(new GBTax());
        tax = taxCalc.calculateTax(number);
        System.out.println("GB tax " + tax);

        taxCalc.setCalculateTax(new GermanyTax());
        tax = taxCalc.calculateTax(number);
        System.out.println("Germany tax " + tax);
    }
}
