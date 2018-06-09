package restricted.demo;

import restricted.abstractions.AbstractApplication;
import restricted.concrete.BusinessApplicationOne;
import restricted.concrete.BusinessApplicationTwo;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class DemoOne {

    public static void main(String[] args) {
        AbstractApplication app = new BusinessApplicationOne();
        System.out.println("Printing Details for One");
        System.out.println("Archive Date "+app.archive().from());
        System.out.println("Event Id "+app.event().getEventId());
        System.out.println("Event Workspaces "+app.event().getWorkspaceNames());
        System.out.print("Resource Type "+app.resource().type()+"\n");
        app.resource().bootstrap();
        System.out.println("##################################");
        app = new BusinessApplicationTwo();
        System.out.println("Printing Details for Two");
        System.out.println("Archive Date "+app.archive().from());
        System.out.println("Event Id "+app.event().getEventId());
        System.out.println("Event Workspaces "+app.event().getWorkspaceNames());
        System.out.print("Resource Type "+app.resource().type()+"\n");
        app.resource().bootstrap();
    }
}
