package subscription;



import java.time.LocalDate;

public class Subscription {
    private String type;
    private LocalDate startDate;
    private LocalDate endDate;

    public Subscription(String type, LocalDate startDate, LocalDate endDate) {
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getType() {
        return type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean isActive() {
        return LocalDate.now().isBefore(endDate) || LocalDate.now().isEqual(endDate);
    }
}
