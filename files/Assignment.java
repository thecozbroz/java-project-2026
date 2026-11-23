import java.time.LocalDate;

public class Assignment {

    public enum Type { CLASSWORK, HOMEWORK, QUIZ, PROJECT, TEST, EXAM /* final / midterm */ }

    private String task;
    private LocalDate dueDate;
    private int pointsTotal;
    private int pointsScored;
    private Type type;
    private boolean completed;

    public Assignment(String task, LocalDate dueDate, int pointsTotal,
                      int pointsScored, Type type, boolean completed) {
        // TODO: assign fields (validate pointsTotal > 0, pointsScored >= 0)
    }

    // ---- Getters ----
    public String getTask()          { return null;  /* TODO */ }
    public LocalDate getDueDate()    { return null;  /* TODO */ }
    public int getPointsTotal()      { return 0;     /* TODO */ }
    public int getPointsScored()     { return 0;     /* TODO */ }
    public Type getType()            { return null;  /* TODO */ }
    public boolean isCompleted()     { return false; /* TODO */ }

    // ---- Setters ----
    public void setTask(String task)              { /* TODO */ }
    public void setDueDate(LocalDate dueDate)     { /* TODO */ }
    public void setPointsTotal(int pointsTotal)   { /* TODO */ }
    public void setPointsScored(int pointsScored) { /* TODO */ }
    public void setType(Type type)                { /* TODO */ }
    public void setCompleted(boolean completed)   { /* TODO */ }

    @Override
    public String toString() { return ""; /* TODO */ }
}
//fuzail