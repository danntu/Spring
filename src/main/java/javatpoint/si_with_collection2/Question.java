package javatpoint.si_with_collection2;

import java.util.Iterator;
import java.util.List;

public class Question {
    private int id;
    private String name;
    private List<Answer> answers;

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

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    void displayInfo() {
        System.out.println(id + " " + name);
        System.out.println("Answers are");
        Iterator<Answer> iterator = answers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
