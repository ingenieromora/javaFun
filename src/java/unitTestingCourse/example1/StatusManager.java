package unitTestingCourse.example1;

/**
 * @author leandro.mora
 */
public class StatusManager {
    public String status;

    private Indicator indicator;

    public StatusManager() {
        indicator = new Indicator();
    }

    public StatusManager(Indicator indicator) {
        this.indicator = indicator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }

    public void setErrorStatus() {
        status = "Error";
        indicator.setColor("#FF0000");
    }

    public void setOkStatus() {
        status = "Ok";
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
