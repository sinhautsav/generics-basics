package restricted.demo;

import restricted.abstractions.AbstractApplication;

import java.util.Scanner;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class DemoTwo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Choose your Business Application Number");
        System.out.println("A. Business Application One");
        System.out.println("B. Business Application Two");
        String choice = s.next();
        String className = null;
        if(choice.equalsIgnoreCase("a"))
            className = "restricted.concrete.BusinessApplicationOne";
        else if (choice.equalsIgnoreCase("b"))
            className = "restricted.concrete.BusinessApplicationTwo";
        else {
            System.out.println("Invalid choice exiting");
            System.exit(1);
        }
        try {
            Class clazz = Class.forName(className);
            AbstractApplication app = (AbstractApplication) clazz.newInstance();
            System.out.println("Printing Details for "+app.getClass().getSimpleName());
            System.out.println("Archive Date "+app.archive().from());
            System.out.println("Event Id "+app.event().getEventId());
            System.out.println("Event Workspaces "+app.event().getWorkspaceNames());
            System.out.print("Resource Type "+app.resource().type()+"\n");
            app.resource().bootstrap();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
