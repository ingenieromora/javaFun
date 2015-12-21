package unitTestingCourse.test1.domain;

/**
 * Created by leandro.mora on 21/12/2015.
 */
public class Flight {
    private static final Integer DEFAULT_SEAT_COST = 1000;
    private Integer costPerSeat;

    public Flight() {
        this.costPerSeat = DEFAULT_SEAT_COST;
    }

    public Flight(Integer costPerSeat) {
        this.costPerSeat = costPerSeat;
    }

    public void saveOperation(Integer guests) {
        System.out.println("Saving fligths....");
    }

    public Integer getCostPerSeat() {
        return costPerSeat;
    }

    public void setCostPerSeat(Integer costPerSeat) {
        this.costPerSeat = costPerSeat;
    }
}
