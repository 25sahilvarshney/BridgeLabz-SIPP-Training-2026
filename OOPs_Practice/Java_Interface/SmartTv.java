interface StreamingService {
    
    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium Movies Pack");
    }
}

interface GamingService {
    
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Ultimate Gaming Pass");
    }
}

class SmartTV implements StreamingService, GamingService {

    String[] movies = {"Avengers", "Inception", "Interstellar"};
    String[] games = {"FIFA 25", "GTA V", "Minecraft"};

    @Override
    public void streamMovie() {
        System.out.println("Streaming movies...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing games...");
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public void displayContent() {
        System.out.println("\nAvailable Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nAvailable Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}

public class SmartTv{
    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.streamMovie();
        tv.playGame();

        System.out.println("\nSubscription Details:");
        tv.showSubscriptionDetails();

        tv.displayContent();
    }
}