package javatpoint.ci_with_collection2;

import java.util.Iterator;
import java.util.List;

public class Question {
    private int id;
    private String name;
    private List<Answer> answers;

    public Question() {
    }

    public Question(int id, String name, List<Answer> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo(){
        System.out.println(id+" "+name);
        System.out.println("answers are:");
        Iterator<Answer> iterator = answers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
