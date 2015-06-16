package unitTestingCourse;

import junit.framework.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author leandro.mora
 */
public class TestMockObject {
    @Test
    public void testErrorStatusPropertyEqualsErrorAndVerifyColor() {
        Indicator mockIndicator = Mockito.mock(Indicator.class);
        StatusManager manager = new StatusManager(mockIndicator);
        manager.changeStatusByCode(1);
        Assert.assertEquals("Status should be 'Error'", manager.getStatus(), "Error");
        Mockito.verify(mockIndicator).setColor("#FF0000");
    }
}
