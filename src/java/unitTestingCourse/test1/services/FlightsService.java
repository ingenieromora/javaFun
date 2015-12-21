package unitTestingCourse.test1.services;

import unitTestingCourse.test1.IService;
import unitTestingCourse.test1.domain.Flight;

/**
 * Created by leandro.mora on 21/12/2015.
 */
public class FlightsService implements IService {
    private Flight flight;


    public FlightsService() {
        this.flight = new Flight();
    }

    public FlightsService(Flight inputFlight) {
        this.flight = inputFlight;
    }

    public Integer getRevenue(Integer guests) {
        flight.saveOperation(guests);
        return flight.getCostPerSeat() * guests;
    }
}
