package javatpoint.ci_with_map2;

public class User {
    private int id;
    private String name,email;

    public User() {
    }

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "id:"+id+" Name:"+name+" Email Id:"+email;
    }
}
