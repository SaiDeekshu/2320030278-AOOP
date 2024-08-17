package subscription;




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SubscriptionManagementTest {

    private User user;
    private SubscriptionService subscriptionService;
    private BillingService billingService;

    @BeforeEach
    void setUp() {
        user = new User("John Doe");
        subscriptionService = new SubscriptionService();
        billingService = new BillingService();
    }

    @Test
    void testAddSubscription() {
        Subscription subscription = new Subscription("Premium", LocalDate.now(), LocalDate.now().plusMonths(1));
        subscriptionService.addSubscription(user, subscription);

        assertEquals(1, user.getSubscriptions().size());
    }

    @Test
    void testRemoveSubscription() {
        Subscription subscription = new Subscription("Premium", LocalDate.now(), LocalDate.now().plusMonths(1));
        subscriptionService.addSubscription(user, subscription);
        subscriptionService.removeSubscription(user, subscription);

        assertEquals(0, user.getSubscriptions().size());
    }

    @Test
    void testBillingCalculation() {
        Subscription subscription = new Subscription("Premium", LocalDate.now(), LocalDate.now().plusMonths(1));
        subscriptionService.addSubscription(user, subscription);

        double bill = billingService.calculateBill(user);
        assertEquals(29.99, bill); // Assuming the premium subscription costs 29.99
    }

    @Test
    void testUserAccess() {
        Subscription subscription = new Subscription("Premium", LocalDate.now(), LocalDate.now().plusMonths(1));
        subscriptionService.addSubscription(user, subscription);

        boolean hasAccess = subscriptionService.hasAccess(user, "Premium");
        assertTrue(hasAccess);
    }

    @Test
    void testExpiredSubscription() {
        Subscription subscription = new Subscription("Premium", LocalDate.now().minusMonths(1), LocalDate.now().minusDays(1));
        subscriptionService.addSubscription(user, subscription);

        boolean hasAccess = subscriptionService.hasAccess(user, "Premium");
        assertFalse(hasAccess);
    }
}

