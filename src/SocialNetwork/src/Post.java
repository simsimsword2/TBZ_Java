import java.time.LocalDate;
import java.util.ArrayList;

public class Post {

    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;
    private String text;


    public Post(String username, String text) {
        this.username = username;
        this.timestamp = System.currentTimeMillis();
        this.likes = 0;
        this.comments = new ArrayList<>();
        this.text = text;
    }

    public void like() {
        likes++;
    }

    public void unlike() {
        if (likes > 0){
            likes--;
        }
    }

    public void addComments(String text) {
        comments.add(text);
    }

    public String getText() {
        return this.text;
    }

    public long getTimeStamp() {
        return timestamp;
    }

    /**
     * Displays details of post
     */
    public void display() {

        System.out.println("Username " + username);
        System.out.println("Posted " + timeString());

        if (likes > 0) {
            System.out.println(likes + " people like this.");
        } else {
            System.out.println();
        }
        if (comments.isEmpty()) {
            System.out.println("No Comments yet...");

        } else {
            System.out.println("   " + comments.size() + " comment(s). Press C to view");
        }
    }

    private String timeString() {

        long current = System.currentTimeMillis();
        long pastMillis = current - timestamp;
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        if (minutes > 0) {
            return minutes + " minutes ago";
        } else if(hours > 0){
            return hours + " hours ago";
        } else {
            return "a few seconds ago";
        }

    }

}
