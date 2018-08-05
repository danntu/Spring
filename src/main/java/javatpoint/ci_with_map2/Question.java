package javatpoint.ci_with_map2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question {
    private int id;
    private String name;
    private Map<Answer,User> answers;

    public Question() {
    }

    public Question(int id, String name, Map<Answer, User> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo(){
        System.out.println("question id:"+id);
        System.out.println("question name:"+name);
        System.out.println("Answers...");

        Set<Map.Entry<Answer,User>> set = answers.entrySet();
        Iterator<Map.Entry<Answer,User>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<Answer,User> entry = iterator.next();
            Answer answer = entry.getKey();
            User user = entry.getValue();
            System.out.println("Answer Information");
            System.out.println(answer);
            System.out.println("Posted By:");
            System.out.println(user);
        }
    }
}
