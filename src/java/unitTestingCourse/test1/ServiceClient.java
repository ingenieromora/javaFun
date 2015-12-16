package unitTestingCourse.test1;

/**
 * Created by leandro.mora on 14/12/15.
 */
public class ServiceClient {

    public Integer informRevenue(Integer codeOfService, Integer numberOfGuests){
        IService service = ServiceFactory.createService(codeOfService);
        return service.getRevenue(numberOfGuests);
    }
}
