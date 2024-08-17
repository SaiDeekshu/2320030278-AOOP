package subscription;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Create a user
        User user = new User("John Doe");

        // Create subscriptions
        Subscription premiumSubscription = new Subscription("Premium", LocalDate.now(), LocalDate.now().plusMonths(1));
        Subscription basicSubscription = new Subscription("Basic", LocalDate.now(), LocalDate.now().plusMonths(1));

        // Create services
        SubscriptionService subscriptionService = new SubscriptionService();
        BillingService billingService = new BillingService();

        // Add subscriptions to the user
        subscriptionService.addSubscription(user, premiumSubscription);
        subscriptionService.addSubscription(user, basicSubscription);

        // Display user's subscriptions
        System.out.println("User's Subscriptions:");
        user.getSubscriptions().forEach(subscription -> 
            System.out.println(subscription.getType() + " - Active until: " + subscription.getEndDate())
        );

        // Check if the user has access to different subscription types
        System.out.println("\nAccess Check:");
        System.out.println("Has Premium access: " + subscriptionService.hasAccess(user, "Premium"));
        System.out.println("Has Basic access: " + subscriptionService.hasAccess(user, "Basic"));
        System.out.println("Has VIP access: " + subscriptionService.hasAccess(user, "VIP"));

        // Calculate the user's bill
        double billAmount = billingService.calculateBill(user);
        System.out.println("\nTotal Bill: $" + billAmount);

        // Remove a subscription
        System.out.println("\nRemoving Basic subscription...");
        subscriptionService.removeSubscription(user, basicSubscription);

        // Check access after removal
        System.out.println("\nAccess Check After Removal:");
        System.out.println("Has Premium access: " + subscriptionService.hasAccess(user, "Premium"));
        System.out.println("Has Basic access: " + subscriptionService.hasAccess(user, "Basic"));

        // Calculate the bill again after removal
        billAmount = billingService.calculateBill(user);
        System.out.println("\nTotal Bill After Removal: $" + billAmount);
    }
}
