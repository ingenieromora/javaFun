package unitTestingCourse.dbImp;

import unitTestingCourse.Employee;
import unitTestingCourse.IDatabase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leandro.mora
 */
public class DatabaseFake implements IDatabase {

    private List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void insertEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee getEmployeeByLastName(String lastname) {
        Iterator<Employee> it = employees.iterator();
        Employee outputEmployee = null;
        while (it.hasNext()){
            Employee currentEmployee= it.next();
            if(lastname.equals(currentEmployee.getLastName())) {
                outputEmployee = currentEmployee;
                break;
            }
        }
        return outputEmployee;
    }
}
