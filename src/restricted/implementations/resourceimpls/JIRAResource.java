package restricted.implementations.resourceimpls;

import restricted.interfaces.IResource;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class JIRAResource implements IResource {

    @Override
    public Type type() {
        return Type.JIRA;
    }

    @Override
    public void bootstrap() {
        System.out.println("Bootstrapping Atlassian JIRA.");
    }
}
