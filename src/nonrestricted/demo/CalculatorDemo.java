package nonrestricted.demo;

import nonrestricted.abstractions.AbstractCalculator;
import nonrestricted.concrete.FloatCalculator;
import nonrestricted.concrete.IntegerCalculator;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class CalculatorDemo {
    public static void main(String[] args) {

        AbstractCalculator obj = new IntegerCalculator();
        obj.add(1,5);
        obj.sub(20,13);

        obj = new FloatCalculator();
        obj.add(1.0F,5.4F);
        obj.sub(20.9F,13.2F);

    }
}
