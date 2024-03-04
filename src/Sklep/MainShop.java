package Sklep;

import java.util.ArrayList;

public class MainShop {
    public static void main(String[] args) {
        double number = 10.0;
        ArrayList<CalculatorTax> calculators = new ArrayList<>();
        calculators.add(new CalculatorTax(new PolandTax()));
        calculators.add(new CalculatorTax(new GBTax()));
        calculators.add(new CalculatorTax(new GermanyTax()));

        for(CalculatorTax a: calculators)
        {
            double tax = a.calculateTax(number);
            System.out.println(tax);
        }
    }
}
