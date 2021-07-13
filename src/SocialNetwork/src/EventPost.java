import java.time.LocalDate;
import java.util.ArrayList;

/**
 * This class represents event posts.
 * It is currently only a prototype but could be extended.
 *
 * @author based on ObjectsFirst book (simon)
 *
 */

// Diese Klasse zu erstellen war unnötig aufwändig und
// ständig ertappt man sich dabei COPY PASTA FEHLER zu machen.
// Man findet gleichen Code in mehreren Klassen, was etwas unnötig ist.
// Wenn wir etwas ändern möchten, könnte es sein, dass wird diese Änderung mehrmals
// in verschiedenen Klassen durführen müssen.

public class EventPost extends Post {

    private LocalDate eventDate;

    public EventPost(String author, String description, LocalDate eventDate) {

        super(author, description);
        this.eventDate = eventDate;
    }



    /**
     * Displays details of post
     */
    @Override
    public void display() {

        super.display();
        System.out.println("Description: " + super.getText());
        System.out.println("Date of event: " + this.eventDate);

    }


}
