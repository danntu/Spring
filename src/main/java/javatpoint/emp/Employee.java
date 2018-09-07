package javatpoint.emp;

public class Employee {
    private int id;
    private String name;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(){
        System.out.println("default constructor");
    }

    public void show(){
        if (name != null) {
            System.out.println("id="+id+", name="+name);
        } else {
            System.out.println("id=" + id);
        }
    }
}
