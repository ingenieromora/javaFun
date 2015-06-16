package unitTestingCourse;

/**
 * @author leandro.mora
 */
public class StatusManager {
    public String Status;

    private Indicator indicator;

    public StatusManager() {
        indicator = new Indicator();
    }

    public StatusManager(Indicator indicator) {
        this.indicator = indicator;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setErrorStatus() {
        Status = "Error";
        indicator.setColor("#FF0000");
    }

    public void setOkStatus() {
        Status = "Ok";
    }

    public void changeStatusByCode(int statusCode) {
        switch (statusCode) {
            case 1:
                setErrorStatus();
                break;
            case 2:
                setOkStatus();
                break;
        }
    }
}
