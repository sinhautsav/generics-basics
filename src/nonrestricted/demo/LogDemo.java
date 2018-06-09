package nonrestricted.demo;

import nonrestricted.abstractions.AbstractLog;
import nonrestricted.concrete.LogOne;
import nonrestricted.concrete.LogTwo;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class LogDemo {

    public static void main(String[] args) {
        AbstractLog log = new LogOne();
        System.out.println("Printing Log One");
        System.out.println("One "+log.methodOne());
        System.out.println("Two "+log.methodTwo());
        System.out.println("Three "+log.methodThree());

        System.out.println("############");
        log = new LogTwo();
        System.out.println("Printing Log Two");
        System.out.println("One "+log.methodOne());
        System.out.println("Two "+log.methodTwo());
        System.out.println("Three "+log.methodThree());
    }
}
