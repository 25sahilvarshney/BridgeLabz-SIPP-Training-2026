interface TextModeration {

    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive language is not allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String[] restrictedWords = {"bad", "hate", "abuse", "offensive"};

        for (String word : restrictedWords) {
            if (post.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Spam or repeated advertisements are not allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public void checkOffensiveContent(String post) {
        if (TextModeration.containsRestrictedWords(post)) {
            System.out.println("Offensive Post: " + post);
        }
    }

    @Override
    public void checkSpam(String post) {
        if (post.toLowerCase().contains("buy now")
                || post.toLowerCase().contains("free money")
                || post.toLowerCase().contains("click here")) {
            System.out.println("Spam Post: " + post);
        }
    }

    // Resolving default method conflict
    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public void moderatePosts(String[] posts) {

        for (String post : posts) {

            boolean offensive = TextModeration.containsRestrictedWords(post);

            boolean spam = post.toLowerCase().contains("buy now")
                    || post.toLowerCase().contains("free money")
                    || post.toLowerCase().contains("click here");

            if (spam) {
                System.out.println("Spam Post: " + post);
            } else if (offensive) {
                System.out.println("Offensive Post: " + post);
            } else {
                System.out.println("Valid Post: " + post);
            }
        }
    }
}

public class AI_Based_Content{
    public static void main(String[] args) {

        String[] posts = {
                "Welcome to our community!",
                "Buy Now and get 50% discount",
                "I hate this product",
                "Click here to win prizes",
                "Have a great day everyone!"
        };

        ContentModerator moderator = new ContentModerator();

        System.out.println("=== Moderation Policies ===");
        moderator.displayModerationPolicy();

        System.out.println("\n=== Post Analysis ===");
        moderator.moderatePosts(posts);
    }
}