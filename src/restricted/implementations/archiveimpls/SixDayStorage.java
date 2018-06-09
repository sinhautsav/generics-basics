package restricted.implementations.archiveimpls;

import restricted.interfaces.IArchivable;

import java.sql.Date;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class SixDayStorage implements IArchivable {
    @Override
    public Date from() {
        return new Date(System.currentTimeMillis()-(6*24*3600*1000));
    }
}
