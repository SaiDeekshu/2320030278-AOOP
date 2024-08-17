package subscription;



public class SubscriptionService {

    public void addSubscription(User user, Subscription subscription) {
        user.addSubscription(subscription);
    }

    public void removeSubscription(User user, Subscription subscription) {
        user.removeSubscription(subscription);
    }

    public boolean hasAccess(User user, String subscriptionType) {
        return user.getSubscriptions().stream()
                .anyMatch(subscription -> subscription.getType().equals(subscriptionType) && subscription.isActive());
    }
}
