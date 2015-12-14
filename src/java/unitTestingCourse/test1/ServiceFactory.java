package unitTestingCourse.test1;

import unitTestingCourse.test1.services.CruiseService;
import unitTestingCourse.test1.services.HotelService;

/**
 * Created by leandro.mora on 14/12/15.
 */
public class ServiceFactory {

    public static IService createService(Integer codeOfService) {
        switch (codeOfService) {
            case 1:
                new HotelService();
            case 2:
                new CruiseService();
            default:
                throw new IllegalArgumentException();
        }
    }

}
