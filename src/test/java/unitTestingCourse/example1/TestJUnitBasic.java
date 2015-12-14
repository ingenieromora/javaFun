package unitTestingCourse.example1;

import junit.framework.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import unitTestingCourse.example1.Indicator;
import unitTestingCourse.example1.StatusManager;

/**
 * @author leandro.mora
 */
public class TestJUnitBasic {

    @Test
    public void testError() {
        StatusManager manager = new StatusManager();
        manager.changeStatusByCode(1);
        Assert.assertEquals("Status should be 'Error'", manager.getStatus(), "Error");
    }

    @Test
    public void testErrorStatusPropertyEqualsError() {
        Indicator indicatorDep = new Indicator();
        StatusManager manager = new StatusManager(indicatorDep);
        manager.changeStatusByCode(1);
        Assert.assertEquals("Status should be 'Error'", manager.getStatus(), "Error");
    }

    @Test
    public void testErrorStatusPropertyEqualsErrorAndVerifyColor() {
        Indicator mockIndicator = Mockito.mock(Indicator.class);
        StatusManager manager = new StatusManager(mockIndicator);
        manager.changeStatusByCode(1);
        Assert.assertEquals("Status should be 'Error'", manager.getStatus(), "Error");
        Mockito.verify(mockIndicator).setColor("#FF0000");
    }


}
