package nonrestricted.concrete;

import nonrestricted.abstractions.AbstractCalculator;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class IntegerCalculator extends AbstractCalculator<Integer> {

    @Override
    public void add(Integer a, Integer b) {
        System.out.print("Adding Integer "+a+" and "+b+" => ");
        System.out.println(a + b);
    }

    @Override
    public void sub(Integer a, Integer b) {
        System.out.print("Subtracting Integer "+a+" and "+b+" => ");
        System.out.println(a - b);
    }
}
