package unitTestingCourse.test1.services;

import unitTestingCourse.test1.IService;

/**
 * Created by leandro.mora on 14/12/15.
 */
public class CruiseService implements IService {
    public CruiseService() {
    }

    @Override
    public Integer getRevenue(Integer guests) {
        return 100 * guests;
    }
}
