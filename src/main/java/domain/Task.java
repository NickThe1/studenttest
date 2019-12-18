package domain;

public class Task {

    private boolean isEmpty;
    private String exercise;
    private String answer;

    public Task() {
        this.isEmpty = true;
    }

    public Task(String exercise, String answer) {
        this.exercise = exercise;
        this.answer = answer;
        this.isEmpty = false;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
