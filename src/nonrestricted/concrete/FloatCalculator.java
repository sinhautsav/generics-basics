package nonrestricted.concrete;

import nonrestricted.abstractions.AbstractCalculator;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class FloatCalculator extends AbstractCalculator<Float> {
    @Override
    public void add(Float a, Float b) {
        System.out.print("Adding Float "+a+" and "+b+" => ");
        System.out.println(a+b);
    }

    @Override
    public void sub(Float a, Float b) {
        System.out.print("Subtracting Float "+a+" and "+b+" => ");
        System.out.println(a - b);
    }
}
