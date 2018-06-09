package restricted.interfaces;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/7/18
 * Organisation: CustomerXPs Software Private Limited
 */
public interface IResource {

    Type type();
    void bootstrap();


    public static enum Type{ RDBMS, JIRA }
}
