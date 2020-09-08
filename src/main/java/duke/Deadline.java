package duke;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents a Deadline with a specified description, date, and boolean to indicate done or not.
 */
public class Deadline extends Task {
    protected String by;
    /** Formatted date to be printed to the user only */
    protected String formattedDate;

    /**
     * Constructor for the Deadline class
     */
    public Deadline (String description, String by) {
        super(description);
        this.by = by;
        this.formattedDate = LocalDate.parse(by).format(DateTimeFormatter.ofPattern("MMM dd yyyy"));
    }

    /**
     * Returns the Deadline description & formatted date to the user.
     *
     * @return Deadline description and date.
     */
    public String recordString() {
        return "[D]" + super.toString() + " (by: " + formattedDate + ")";
    }

    public String recordStringWithTags() {
        return "[D]" + super.toString() + " (at: " + formattedDate + ")" +
                (this.tags.size() == 0 ? "" :"\ntags: " + super.getTags());
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")" +
                (this.tags.size() == 0 ? "" :"\ntags: " + super.getTags());
    }
}
