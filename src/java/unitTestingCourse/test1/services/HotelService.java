package unitTestingCourse.test1.services;

import unitTestingCourse.test1.IService;
import unitTestingCourse.test1.domain.Hotel;

/**
 * Created by leandro.mora on 14/12/15.
 */
public class HotelService implements IService {
    private Hotel hotel;

    public HotelService() {
        hotel = new Hotel();
    }

    public HotelService(Hotel hotel) {
        this.hotel = hotel;
    }


    public Integer getRevenue(Integer guests) {
        if(hotel.getGuestsAllowed() < guests){
            throw new IllegalArgumentException("Number of guests can not be superior to" + hotel.getGuestsAllowed());
        }
        return guests * hotel.getCostPerSuit();
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
