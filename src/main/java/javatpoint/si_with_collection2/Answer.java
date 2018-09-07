package javatpoint.si_with_collection2;

public class Answer {
    private int id;
    private String name;
    private String postedBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    @Override
    public java.lang.String toString() {
        return id + " " + name + " " + postedBy;
    }
}
