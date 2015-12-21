package unitTestingCourse.test1;

import unitTestingCourse.test1.services.CruiseService;
import unitTestingCourse.test1.services.FlightsService;
import unitTestingCourse.test1.services.HotelService;

/**
 * Created by leandro.mora on 14/12/15.
 */
public class ServiceFactory {

    public static IService createService(Integer codeOfService) {
        switch (codeOfService) {
            case 1:
                return new HotelService();
            case 2:
                return new CruiseService();
            case 3:
                return new FlightsService();
            default:
                throw new IllegalArgumentException("Invalid Code");
        }
    }

}
