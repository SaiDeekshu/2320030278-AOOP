package subscription;


public class BillingService {

    public double calculateBill(User user) {
        double total = 0.0;

        for (Subscription subscription : user.getSubscriptions()) {
            switch (subscription.getType()) {
                case "Premium":
                    total += 29.99;
                    break;
                case "Basic":
                    total += 9.99;
                    break;
               
            }
        }

        return total;
    }
}
