package subscription;



import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Subscription> subscriptions;

    public User(String name) {
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }

    public void removeSubscription(Subscription subscription) {
        subscriptions.remove(subscription);
    }
}

