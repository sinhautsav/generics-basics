package nonrestricted.concrete;

import nonrestricted.abstractions.AbstractLog;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class LogOne extends AbstractLog<Date, Time, Timestamp> {

    @Override
    public Date methodOne() {
        return new Date(System.currentTimeMillis());
    }

    @Override
    public Time methodTwo() {
        return new Time(System.currentTimeMillis());
    }

    @Override
    public Timestamp methodThree() {
        return new Timestamp(System.currentTimeMillis());
    }
}
