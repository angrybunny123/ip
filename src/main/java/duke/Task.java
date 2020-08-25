package duke;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "[\u2713]" : "[\u2718]"); //return tick or X symbols
    }

    public void setDone() {
        this.isDone = true;
    }

    public String recordString() {
        return "";
    }

    @Override
    public String toString() {
        return getStatusIcon() + " " + this.description;
    }
}