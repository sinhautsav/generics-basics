package restricted.concrete;

import nonrestricted.concrete.FloatCalculator;
import nonrestricted.concrete.LogOne;
import restricted.abstractions.AbstractApplication;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class InvalidBusinessApplication extends AbstractApplication<String, LogOne, FloatCalculator> {
    @Override
    public String event() {
        return null;
    }

    @Override
    public LogOne resource() {
        return null;
    }

    @Override
    public FloatCalculator archive() {
        return null;
    }
}
