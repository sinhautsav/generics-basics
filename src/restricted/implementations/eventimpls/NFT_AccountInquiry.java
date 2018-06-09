package restricted.implementations.eventimpls;

import restricted.interfaces.IEvent;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class NFT_AccountInquiry implements IEvent {

    @Override
    public String getEventId() {
        return "NA_123";
    }

    @Override
    public Set<String> getWorkspaceNames() {
        String[] arr =  new String[]{"TRANSACTION", "PAYMENTCARD"};
        return new HashSet<>(Arrays.asList(arr));
    }
}
