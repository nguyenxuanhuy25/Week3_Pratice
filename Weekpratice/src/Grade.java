import java.util.Date;

public class Grade {
    private int score;
    private Date updateIn;
    private Teacher updateBy;

    public Grade(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getUpdateIn() {
        return updateIn;
    }

    public void setUpdateIn(Date updateIn) {
        this.updateIn = updateIn;
    }

    public void setUpdateBy(Teacher updateBy) {
        this.updateBy = updateBy;
    }

    public Teacher getUpdateBy() {
        return updateBy;
    }

}