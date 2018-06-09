package restricted.concrete;

import restricted.abstractions.AbstractApplication;
import restricted.implementations.archiveimpls.ThreeDayStorage;
import restricted.implementations.eventimpls.FT_AccountTxnEvent;
import restricted.implementations.resourceimpls.DBResource;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class BusinessApplicationOne extends AbstractApplication<FT_AccountTxnEvent, DBResource, ThreeDayStorage> {

    @Override
    public FT_AccountTxnEvent event() {
        return new FT_AccountTxnEvent();
    }

    @Override
    public DBResource resource() {
        return new DBResource();
    }

    @Override
    public ThreeDayStorage archive() {
        return new ThreeDayStorage();
    }
}
