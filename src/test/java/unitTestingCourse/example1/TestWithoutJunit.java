package unitTestingCourse.example1;

/**
 * @author leandro.mora
 */
public class TestWithoutJunit {

    public void testError()
    {
        StatusManager manager = new StatusManager();
        manager.changeStatusByCode(1);
        if (manager.getStatus() == "Error") {
            System.out.println("Error  status has been successfully set.");
        } else {
            System.out.println("Something is not right");
        }
    }

    public void testOk()
    {
        StatusManager manager = new StatusManager();
        manager.changeStatusByCode(2);
        if (manager.getStatus() == "Ok") {
            System.out.println("Ok status has been successfully set");
        } else {
            System.out.println("Something is not right");
        }
    }


    public static void main(String[] args) {
        TestWithoutJunit ts = new TestWithoutJunit();
        ts.testError();
        ts.testOk();
    }

}
