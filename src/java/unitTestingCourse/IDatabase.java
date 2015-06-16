package unitTestingCourse;

/**
 * @author leandro.mora
 */
public interface IDatabase {
    public void insertEmployee(Employee employee);
    public Employee getEmployeeByLastName(String name);


}
