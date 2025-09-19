package topic10_statepattern.blame;

public interface Blameable {
    public Blameable taskIssue();
    public Blameable quizIssue();
    public Blameable interviewIssue();
    public void applyBlame();
}
