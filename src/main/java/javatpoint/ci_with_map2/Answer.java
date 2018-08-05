package javatpoint.ci_with_map2;



public class Answer {
    private int id;
    private String answer;
    private String postedDate;

    public Answer() {
    }

    public Answer(int id, String answer, String postedDate) {
        this.id = id;
        this.answer = answer;
        this.postedDate = postedDate;
    }

    @Override
    public String toString() {
        return "Id:"+id+" Answer:"+answer+" Posted Date:"+postedDate;
    }
}
