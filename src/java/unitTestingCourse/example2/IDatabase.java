package unitTestingCourse.example2;

import unitTestingCourse.example2.Employee;

/**
 * @author leandro.mora
 */
public interface IDatabase {
    public void insertEmployee(Employee employee);
    public Employee getEmployeeByLastName(String name);


}
