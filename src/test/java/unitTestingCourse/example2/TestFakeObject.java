package unitTestingCourse.example2;

import junit.framework.Assert;
import org.junit.Test;
import unitTestingCourse.example2.dbImp.DatabaseFake;
import unitTestingCourse.example2.Employee;
import unitTestingCourse.example2.IDatabase;

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
