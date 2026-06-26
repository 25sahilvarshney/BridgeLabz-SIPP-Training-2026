class Subscription {
    String subscriberName;
    String subscriptionId;

    Subscription(String subscriberName, String subscriptionId) {
        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    double calculateMonthlyCharge() {
        return 0;
    }

    void displayDetails() {
        System.out.println("Subscriber Name: " + subscriberName);
        System.out.println("Subscription ID: " + subscriptionId);
    }
}

class BasicPlan extends Subscription {

    BasicPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 199;
    }
}

class PremiumPlan extends Subscription {

    PremiumPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 499;
    }
}

class FamilyPlan extends Subscription {

    FamilyPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 799;
    }
}

public class StreamingPlatformSubscriptionAnalyzer {

    static void searchSubscription(Subscription[] subscriptions,
                                   String subscriptionId) {

        boolean found = false;

        for (Subscription s : subscriptions) {
            if (s.subscriptionId.equals(subscriptionId)) {
                System.out.println("\nSubscription Found:");
                s.displayDetails();
                System.out.println("Monthly Charge: Rs. "
                        + s.calculateMonthlyCharge());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nSubscription ID not found.");
        }
    }

    static void displaySubscribersByLetter(Subscription[] subscriptions,
                                           char letter) {

        System.out.println("\nSubscribers starting with '" + letter + "':");

        for (Subscription s : subscriptions) {
            if (s.subscriberName.toUpperCase()
                    .startsWith(String.valueOf(letter).toUpperCase())) {
                System.out.println(s.subscriberName);
            }
        }
    }

    static double calculateTotalRevenue(Subscription[] subscriptions) {
        double totalRevenue = 0;

        for (Subscription s : subscriptions) {
            totalRevenue += s.calculateMonthlyCharge();
        }

        return totalRevenue;
    }

    static void displayMostExpensiveSubscription(
            Subscription[] subscriptions) {

        Subscription expensive = subscriptions[0];

        for (Subscription s : subscriptions) {
            if (s.calculateMonthlyCharge() >
                    expensive.calculateMonthlyCharge()) {
                expensive = s;
            }
        }

        System.out.println("\nMost Expensive Subscription:");
        expensive.displayDetails();
        System.out.println("Monthly Charge: Rs. "
                + expensive.calculateMonthlyCharge());
    }

    public static void main(String[] args) {

        Subscription[] subscriptions = {
                new BasicPlan("Sahil", "B101"),
                new PremiumPlan("Rahul", "P201"),
                new FamilyPlan("Priya", "F301"),
                new PremiumPlan("Rohan", "P202"),
                new BasicPlan("Ankit", "B102")
        };

        System.out.println("Subscription Details:\n");

        for (Subscription s : subscriptions) {
            s.displayDetails();
            System.out.println("Monthly Charge: Rs. "
                    + s.calculateMonthlyCharge());
            System.out.println();
        }

        searchSubscription(subscriptions, "F301");

        displaySubscribersByLetter(subscriptions, 'R');

        System.out.println("\nTotal Monthly Revenue: Rs. "
                + calculateTotalRevenue(subscriptions));

        displayMostExpensiveSubscription(subscriptions);
    }
}