package unitTestingCourse.test1.domain;

/**
 * Created by leandro.mora on 14/12/15.
 */
public class Hotel {
    private Integer guestsAllowed;
    private Integer costPerSuit;

    private static final Integer DEFAULT_NUMBER_GUESTS = 150;
    private static final Integer DEFAULT_COST = 100;

    public Hotel(){
        this.guestsAllowed = DEFAULT_NUMBER_GUESTS;
        this.costPerSuit = DEFAULT_COST;
    }

    public Hotel(Integer guestsAllowed, Integer costPerSuit) {
        this.guestsAllowed = guestsAllowed;
        this.costPerSuit = costPerSuit;
    }


    public Integer getCostPerSuit() {
        return costPerSuit;
    }

    public void setCostPerSuit(Integer costPerSuit) {
        this.costPerSuit = costPerSuit;
    }

    public Integer getGuestsAllowed() {
        return guestsAllowed;
    }


    public void setGuestsAllowed(Integer guestsAllowed) {
        this.guestsAllowed = guestsAllowed;
    }
}
