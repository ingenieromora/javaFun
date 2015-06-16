package unitTestingCourse;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import unitTestingCourse.dbImp.DatabaseFake;

/**
 * @author leandro.mora
 */
public class TestFakeObject {

    @Test
    public void testDatabaseFake(){
        IDatabase database = new DatabaseFake();
        database.insertEmployee(new Employee("Roman", "Riquelme"));
        database.insertEmployee(new Employee("Silvester", "Stallone"));
        database.insertEmployee(new Employee("Lionel","Messi"));

        Employee employee = database.getEmployeeByLastName("Riquelme");

        Assert.assertNotNull(employee);
        Assert.assertEquals(employee.getLastName(), "Riquelme");

    }
}
