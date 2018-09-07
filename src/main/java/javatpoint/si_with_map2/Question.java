package javatpoint.si_with_map2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question {
    private int id;
    private String name;
    private Map<Answer, User> answers;

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

    public Map<Answer, User> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Answer, User> answers) {
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println("question id: " + id);
        System.out.println("question name: " + name);
        System.out.println("Answers.....");
        Set<Map.Entry<Answer, User>> set = answers.entrySet();
        Iterator<Map.Entry<Answer, User>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Answer, User> entry = iterator.next();
            Answer answer = entry.getKey();
            User user = entry.getValue();
            System.out.println("Answer information:");
            System.out.println(answer);
            System.out.println("Posted by:");
            System.out.println(user);
        }
    }
}
