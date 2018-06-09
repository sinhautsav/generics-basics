package nonrestricted.concrete;

import nonrestricted.abstractions.AbstractLog;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class LogTwo extends AbstractLog<Integer, Double, Boolean> {
    @Override
    public Integer methodOne() {
        return 123;
    }

    @Override
    public Double methodTwo() {
        return 123.90;
    }

    @Override
    public Boolean methodThree() {
        return true;
    }
}
