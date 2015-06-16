package unitTestingCourse.employeeServiceImp;

import unitTestingCourse.Employee;
import unitTestingCourse.EmployeeData;
import unitTestingCourse.EmployeeService;

/**
 * @author leandro.mora
 */
public class EmployeeWriter implements EmployeeService {


    @Override
    public EmployeeData getEmployeeInformation(Employee employee) {
        EmployeeData data = new EmployeeData();
        String wholename = employee.getName() + employee.getLastName();
        data.setSomeData(wholename);

        return data;
    }
}
