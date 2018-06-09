package restricted.concrete;

import restricted.abstractions.AbstractApplication;
import restricted.implementations.archiveimpls.SixDayStorage;
import restricted.implementations.eventimpls.NFT_AccountInquiry;
import restricted.implementations.resourceimpls.JIRAResource;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class BusinessApplicationTwo extends AbstractApplication<NFT_AccountInquiry, JIRAResource, SixDayStorage> {
    @Override
    public NFT_AccountInquiry event() {
        return new NFT_AccountInquiry();
    }

    @Override
    public JIRAResource resource() {
        return new JIRAResource();
    }

    @Override
    public SixDayStorage archive() {
        return new SixDayStorage();
    }
}
