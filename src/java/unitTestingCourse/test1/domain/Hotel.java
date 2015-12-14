package unitTestingCourse.test1.domain;

/**
 * Created by leandro.mora on 14/12/15.
 */
public class Hotel {
    private Integer guestsAllowed;
    private Integer costPerSuit;

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
