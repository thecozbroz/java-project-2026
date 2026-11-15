import java.time.LocalDate;;

public class Assignment {
    private String task;
    private LocalDate dueDate;
    private int totalPoints;
    private int scoredPoints;
    private boolean completionState;
    
    private enum Weights {
        CLASSWORK, HOMEWORK, QUIZZES, PROJECTS, TESTS, MIDTERMS, FINAL, FINALPROJECT
    }
    private Weights weight;

    public void setTask(String task) {
        this.task = task;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
    public void setScoredPoints(int scoredPoints) {
        this.scoredPoints = scoredPoints;
    }
    public void setCompletionState(boolean completionState) {
        this.completionState = completionState;
    }
    public void setWeight(Weights weight) {
        this.weight = weight;
    }

    public Assignment(String task, LocalDate dueDate, int totalPoints, int scoredPoints, boolean completionState, weights weight) {
        this.task = task;
        this.dueDate = dueDate;
        this.totalPoints = totalPoints;
        this.scoredPoints = scoredPoints;
        this.completionState = completionState;
        this.weight = weight;
    }
}
