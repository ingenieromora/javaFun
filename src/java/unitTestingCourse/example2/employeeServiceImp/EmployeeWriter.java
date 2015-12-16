package unitTestingCourse.example2.employeeServiceImp;

import unitTestingCourse.example2.Employee;
import unitTestingCourse.example2.EmployeeData;
import unitTestingCourse.example2.EmployeeService;

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
