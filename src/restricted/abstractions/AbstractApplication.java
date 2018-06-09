package restricted.abstractions;

import restricted.interfaces.IArchivable;
import restricted.interfaces.IEvent;
import restricted.interfaces.IResource;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public abstract class AbstractApplication<Event extends IEvent, Resource extends IResource, Archive extends IArchivable> {

    public abstract Event event();
    public abstract Resource resource();
    public abstract Archive archive();
}
