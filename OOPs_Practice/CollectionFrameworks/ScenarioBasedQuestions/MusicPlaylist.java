import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {
    private final LinkedList<String> recentlyPlayed;

    public MusicPlaylist() {
        recentlyPlayed = new LinkedList<>();
    }

    public void addSong(String song) {
        if (song == null || song.trim().isEmpty()) {
            System.out.println("Song name cannot be empty.");
            return;
        }

        recentlyPlayed.addFirst(song.trim());

        if (recentlyPlayed.size() > 10) {
            recentlyPlayed.removeLast();
        }
    }

    public boolean searchSong(String song) {
        if (song == null || song.trim().isEmpty()) {
            return false;
        }
        return recentlyPlayed.contains(song.trim());
    }

    public void displayHistory() {
        if (recentlyPlayed.isEmpty()) {
            System.out.println("Recently Played History: Empty");
            return;
        }

        System.out.println("Recently Played History:");
        int index = 1;
        for (String song : recentlyPlayed) {
            System.out.println(index++ + ". " + song);
        }
    }

    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMusic Playlist Recommendation Engine");
            System.out.println("1. Add a played song");
            System.out.println("2. Search for a song");
            System.out.println("3. Display recently played history");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter song name: ");
                    String song = scanner.nextLine();
                    playlist.addSong(song);
                    System.out.println("Song added to the playlist.");
                }
                case 2 -> {
                    System.out.print("Enter song name to search: ");
                    String song = scanner.nextLine();
                    if (playlist.searchSong(song)) {
                        System.out.println("Song found in recently played history.");
                    } else {
                        System.out.println("Song not found in recently played history.");
                    }
                }
                case 3 -> playlist.displayHistory();
                case 4 -> {
                    System.out.println("Exiting playlist engine.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
