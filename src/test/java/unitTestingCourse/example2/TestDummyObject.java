package unitTestingCourse.example2;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import unitTestingCourse.example2.employeeServiceImp.EmployeeWriter;
import unitTestingCourse.example2.Employee;
import unitTestingCourse.example2.EmployeeData;
import unitTestingCourse.example2.EmployeeService;

/**
 * @author leandro.mora
 */
public class TestDummyObject {
    Employee dummyEmployee;

    @Before
    public void setup(){
        dummyEmployee = new Employee();
        dummyEmployee.setName("John");
        dummyEmployee.setLastName("Doe");
    }

    @Test
    public void testGetEmployeeInformationShouldNotBeNull(){
        EmployeeService service = new EmployeeWriter();
        EmployeeData result = service.getEmployeeInformation(dummyEmployee);

        Assert.assertNotNull("Result should not be null",result);
    }
}
